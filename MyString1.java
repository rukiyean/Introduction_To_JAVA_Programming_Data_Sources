package Bolum10;

public class MyString1 {
	private char[] chars;
	public static void main(String[] args) {
        MyString1 s = new MyString1(new char[]{'H', 'E', 'L', 'L', 'O'});
        System.out.println("charAt(1): " + s.charAt(1)); 
        System.out.println("length(): " + s.length());   
        System.out.println("substring(1, 4): " + s.substring(1, 4)); 
        System.out.println("toLowerCase(): " + s.toLowerCase()); 
        System.out.println("equals(): " + s.equals(new MyString1(new char[]{'H','E','L','L','O'}))); 
        System.out.println("valueOf(123): " + MyString1.valueOf(123)); 
	}
	public MyString1(char[] chars)
	{
		this.chars =new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
	        this.chars[i] = chars[i];
	    }
	}
	
	public char charAt(int index)
	{
		return chars[index];
	}
	
	public int length()
	{
		return chars.length;
	}
	
	public MyString1 substring(int begin, int end)
	{
		char[] sub =new char[end-begin];
		for(int i =begin ;i< end ;i++)
			sub[i-begin]=chars[i];
		return new MyString1(sub);
	}
	
	public MyString1 toLowerCase()
	{
		char[] lower =new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] >= 'A' && chars[i]<= 'Z')
				lower[i] =(char) (chars[i]+32);
			else
				lower[i] = chars[i];
		}
        return new MyString1(lower);
	}
	
	public boolean equals(MyString1 s)
	{
		if (this.length() != s.length()) return false;
		for (int i = 0; i < chars.length; i++) {
			if(this.chars[i] != s.chars[i])
				return false;
		}
		return true;
	}
	
	public static MyString1 valueOf(int i)
	{
		String str = Integer.toString(i);
        char[] chars = new char[str.length()];
        for (int j = 0; j < str.length(); j++) {
            chars[j] = str.charAt(j);
        }
        return new MyString1(chars);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
