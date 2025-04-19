package Bolum10;

import java.math.BigInteger;

public class Divisible5or6 {

	public static void main(String[] args) {
		 BigInteger maxValue = BigInteger.valueOf(Long.MAX_VALUE);
	     BigInteger  num = maxValue.add(BigInteger.ONE); 

	     int count = 0;
	     while(count<10)
	     {
	    	 if(num.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO) 
	    	|| num.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO))
	    	 {
	    		 System.out.println(num);
	    		 count++;
	    	 }
	    	 num = num.add(BigInteger.ONE);
	     }
	}

}
