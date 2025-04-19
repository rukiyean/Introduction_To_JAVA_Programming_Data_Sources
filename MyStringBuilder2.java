package Bolum10;

public class MyStringBuilder2 {
    private StringBuilder builder;
	public static void main(String[] args) {
		 MyStringBuilder2 s1 = new MyStringBuilder2("hello");
	        MyStringBuilder2 s2 = new MyStringBuilder2(" world");

	        s1.insert(5, s2); // hello + world
	        System.out.println("After insert: " + s1); // hello world

	        s1.toUpperCase();
	        System.out.println("To upper case: " + s1); // HELLO WORLD

	        s1.reverse();
	        System.out.println("Reversed: " + s1); // DLROW OLLEH

	        MyStringBuilder2 sub = s1.substring(6);
	        System.out.println("Substring(6): " + sub); // OLLEH

	}
	public MyStringBuilder2()
	{
		builder = new StringBuilder();
	}
	public MyStringBuilder2(char[] chars)
	{
		builder = new StringBuilder();
		for(char c : chars)
			builder.append(c);
	}
	public MyStringBuilder2(String s)	
	{
		builder = new StringBuilder(s);
	}
	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s)
	{
		builder.insert(offset, s.toString());
		return this;
	}
	public MyStringBuilder2 reverse() {
		builder.reverse();
		return this;
	}
	public MyStringBuilder2 substring(int begin)
	{
		return new MyStringBuilder2(builder.substring(begin));
	}
	public MyStringBuilder2 toUpperCase()
	{
		String upper = builder.toString().toUpperCase();
		builder = new StringBuilder(upper);
        return this;
	}
	public String toString() {
        return builder.toString();
    }
}
