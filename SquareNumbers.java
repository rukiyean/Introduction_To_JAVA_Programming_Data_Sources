package Bolum10;

public class SquareNumbers {

	public static void main(String[] args) {
		long maxValue = Long.MAX_VALUE;
		
		long n = (long) Math.ceil(Math.sqrt(maxValue));
		
		int count = 0;
		
		while(count<10)
		{
			long squrate = n*n;
            System.out.println(squrate);
            n++;
            count++;

		}
	}

}
