package net.htlgkr.hagers190220.EratosthenesPrimeSieve;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private ArrayList<Integer> list;
    int obergrenze;


    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
        this.list = new ArrayList<>();

        for (int i = 2; i <= obergrenze; i++) {
            list.add(i);
        }
    }

    @Override
    public boolean isPrime(int p) {

        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(list.get(j) % list.get(i) == 0 && list.get(j) != list.get(i)){
                    list.remove(j);
                    size = list.size();
                }
            }
        }

        return list.contains(p);
    }

    @Override
    public void printPrimes() {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
