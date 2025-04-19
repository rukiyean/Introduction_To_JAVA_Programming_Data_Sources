package Bolum10;

public class MyCharacter {
	 private char ch;
	public static void main(String[] args) {
		MyCharacter ch = new MyCharacter('a');
		System.out.println("charValue() :" + ch.charValue());
		System.out.println("isLetter() :" + ch.isLetter());
		System.out.println("isDigit() :"+ ch.isDigit());
		System.out.println("isLowerCase()" + ch.isLowerCase());
		System.out.println("isUpperCase()" + ch.isUpperCase());
		
		 // static metotlar
		System.out.println("equals('G'): " + ch.equals(new MyCharacter('G')));
        System.out.println("isLetter('5'): " + MyCharacter.isLetter('5'));
        System.out.println("isDigit('5'): " + MyCharacter.isDigit('5'));
		
	}
	public MyCharacter(char ch)
	{
		this.ch=ch;
	}
	public char charValue()
	{
		return ch;
	}
	public boolean isLetter()	
	{
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
	}
	public boolean isDigit()
	{
		return (ch >= 0 && ch <= 9);
	}
	public boolean isLowerCase()
	{
		return (ch >= 'a' && ch <= 'z');
	}
	public boolean isUpperCase()
	{
		return (ch >= 'A' && ch <= 'Z');
	}
	public MyCharacter toLowerCase()
	{
		 if (isUpperCase()) 
	            return new MyCharacter((char)(ch + 32));
	     return new MyCharacter(ch);
	}
	public MyCharacter toUpperCase()
	{
		 if (isLowerCase()) 
	            return new MyCharacter((char)(ch - 32));
	     return new MyCharacter(ch);
	}
	public boolean equals(MyCharacter c)
	{
		return this.ch == c.charValue();
	}
	public static boolean isLetter(char c)
	{
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
	}
	public static boolean isDigit(char c)	
	{
		return (c >= 0 && c <= 9);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Character.toString(ch);
	}
}
