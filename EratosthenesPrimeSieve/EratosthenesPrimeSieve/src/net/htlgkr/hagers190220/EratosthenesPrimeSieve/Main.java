package net.htlgkr.hagers190220.EratosthenesPrimeSieve;

public class Main {

    public static void main(String[] args) {
	    EratosthenesPrimeSieve eratosthenesPrimeSieve = new EratosthenesPrimeSieve(100);

        boolean f = eratosthenesPrimeSieve.isPrime(5);

        System.out.println(f);

        eratosthenesPrimeSieve.printPrimes();
    }
}
