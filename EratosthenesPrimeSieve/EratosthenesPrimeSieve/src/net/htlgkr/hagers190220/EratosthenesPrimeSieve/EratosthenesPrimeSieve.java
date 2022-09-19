package net.htlgkr.hagers190220.EratosthenesPrimeSieve;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private boolean[] primes;
    int obergrenze;


    public EratosthenesPrimeSieve(int obergrenze) {
        this.primes = new boolean[obergrenze];
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int p) {

        int size = primes.length;
        int ersteZahl = 0;
        for (int j = 2; j < size; j++) {

            for (int i = 2; i < size; i++) {
                if (i != j && i % j == 0) {
                    primes[i] = true;
                    size = primes.length;
                }
            }

        }

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < primes.length; i++) {
            if(!primes[i]){
                temp.add(i);
            }
        }

        return temp.contains(p);
    }

    @Override
    public void printPrimes() {

        for (int i = 0; i < primes.length; i++) {
            System.out.println(primes[i]);
        }

    }
}
