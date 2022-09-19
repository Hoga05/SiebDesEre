package net.htlgkr.hagers190220.EratosthenesPrimeSieve;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private ArrayList<Integer> primes;
    int obergrenze;


    public EratosthenesPrimeSieve(int obergrenze) {
        this.primes = new ArrayList<>();
        this.obergrenze = obergrenze;

        for (int i = 2; i < obergrenze; i++) {
            primes.add(i);
        }
    }

    @Override
    public boolean isPrime(int p) {

        int size = primes.size();
        for (int i = 0; i < size; i++) {

            if (p % i == 1) {
                primes.remove(i);
                size = primes.size();
            }
        }

        return primes.contains(p);
    }

    @Override
    public void printPrimes() {

        for (int i = 0; i < primes.size(); i++) {
            System.out.println(primes.get(i));
        }

    }
}
