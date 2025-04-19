package Bolum10;

import java.math.BigInteger;

public class Divisible {

	public static void main(String[] args) {
		int count=0;
        BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000000"); // 50 basamaklý ilk sayý

	     while(count<10)
	     {
	         if (number.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO) || number.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO))
	         {
	    		 System.out.println(number);
	    		 count++;
	    	 }
	    	 number = number.add(BigInteger.ONE);
	     
		}
	}
}
