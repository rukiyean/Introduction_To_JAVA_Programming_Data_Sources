package Bolum10;

public class MyInteger {

	private int value;
	public static void main(String[] args) {
		MyInteger integer =new MyInteger(15);
		
		System.out.println("Value: " + integer.getvalue());
        System.out.println("isEven(): " + integer.isEven());
        System.out.println("isOdd(): " + integer.isOdd());
        System.out.println("isPrime(): " + integer.isPrime());
        
        System.out.println("isEven(20): " + MyInteger.isEven(20));
        System.out.println("isOdd(15): " + MyInteger.isOdd(15));
        System.out.println("isPrime(7): " + MyInteger.isPrime(7));
        
        MyInteger another = new MyInteger(17);
        System.out.println("equals(17): " + integer.equals(17));
        System.out.println("equals(MyInteger(17)): " + integer.equals(another));

        char[] charArr = {'1', '2', '3'};
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(charArr));
        System.out.println("parseInt(String): " + MyInteger.parseInt("456"));
	}
	
	public MyInteger(int value) {
        this.value = value;
    }
	public int getvalue()
	{
		return value;
	}

	public  boolean isEven()
	{
		return value%2==0;
	}
	public  boolean isOdd()
	{
		return value%2 !=0;
	}
	public  boolean isPrime()
	{
		if (value <= 1) 
			return false; // 1 ve daha küçük sayýlar asal deðil
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0)
                return false; // bölen bulunduysa asal deðil
        }
        return true;
	}
	
	
	public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    public static boolean isEven(MyInteger n) {
        return n.isEven();
    }

    public static boolean isOdd(MyInteger n) {
        return n.isOdd();
    }

    public static boolean isPrime(MyInteger n) {
        return n.isPrime();
    }
    
    public boolean equals(MyInteger n)
    {
    	return this.value==n.value;
    }
    
    public static int parseInt(char[] chars)
    {
    	String s = new String(chars);
    	return Integer.parseInt(s);
    }
    
    public static int parseInt(String s)
    {
    	return Integer.parseInt(s);
    }
}
