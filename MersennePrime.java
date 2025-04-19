package Bolum10;

import java.math.BigInteger;

public class MersennePrime {

	public static void main(String[] args) {
		
		System.out.println("Mersenne primes with p <= 100:");
		for (int p = 2; p <= 100; p++) {
           /* if (isPrime(p)) {
                BigInteger mersennePrime = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);
                if (isPrime(mersennePrime)) {
                    System.out.printf("p = %d -> Mersenne prime: %s%n", p, mersennePrime);
                }
            }*/
        }
	}
	public static boolean isPrime(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) <= 0) return false;
        if (n.equals(BigInteger.TWO)) return true;  // 2 is prime
        if (n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) return false;  // Even numbers are not prime
        
        BigInteger sqrt = sqrt(n);
        for (BigInteger i = BigInteger.valueOf(3); i.compareTo(sqrt) <= 0; i = i.add(BigInteger.TWO)) {
            if (n.mod(i).equals(BigInteger.ZERO)) return false;
        }
        return true;
    }
	// Compute the square root of a BigInteger
    public static BigInteger sqrt(BigInteger n) {
        BigInteger low = BigInteger.ONE;
        BigInteger high = n;
        BigInteger mid;

        while (low.compareTo(high) <= 0) {
            mid = low.add(high).shiftRight(1);  // (low + high) / 2
            if (mid.multiply(mid).compareTo(n) > 0) {
                high = mid.subtract(BigInteger.ONE);
            } else {
                low = mid.add(BigInteger.ONE);
            }
        }
        return high;
    }
}
