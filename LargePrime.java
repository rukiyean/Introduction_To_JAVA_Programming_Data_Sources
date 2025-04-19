package Bolum10;

import java.math.BigInteger;

public class LargePrime {

	public static void main(String[] args) {
		
        BigInteger maxValue = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger  num = maxValue.add(BigInteger.ONE); 

          int count = 0;
		
		while(count<5)
		{
			if(isPrime(num))
			{
				 System.out.println(num);  // Asal sayýyý yazdýr
	             count++;
			}
			num = num.add(BigInteger.ONE);

		}
	}
	public static boolean isPrime(BigInteger  n) {
		if(n.compareTo(BigInteger.ONE) <=1) return false;
        if (n.equals(BigInteger.TWO)) return true;   
        if (n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) return false;  
        
     // Sayýnýn kareköküne kadar olan sayýlarla bölünme kontrolü
        BigInteger sqrt = sqrt(n);
        for (BigInteger i = BigInteger.valueOf(3); i.compareTo(sqrt) <= 0; i = i.add(BigInteger.TWO)) {
            if (n.mod(i).equals(BigInteger.ZERO)) return false;  // Eðer bölünüyorsa asal deðildir
        }
        return true;  // Eðer bölünmediyse, sayý asaldýr
	}

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
        return high;  // Karekök deðeri
    }
}
