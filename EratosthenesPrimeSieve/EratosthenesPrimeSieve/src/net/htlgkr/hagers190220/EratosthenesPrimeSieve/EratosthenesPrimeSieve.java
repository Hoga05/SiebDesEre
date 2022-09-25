package net.htlgkr.hagers190220.EratosthenesPrimeSieve;

import java.util.ArrayList;

public class EratosthenesPrimeSieve{

    private ArrayList<Integer> list;
    int obergrenze;


    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
        this.list = new ArrayList<>();

        for (int i = 2; i <= obergrenze; i++) {
            list.add(i);
        }
    }


}
