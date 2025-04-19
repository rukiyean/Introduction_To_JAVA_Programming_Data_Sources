package Bolum10;

public class MyStringBuilder1 {
	
    private char[] value;

	public static void main(String[] args) {
		MyStringBuilder1 sb = new MyStringBuilder1("Hello");
        sb.append(new MyStringBuilder1(" World"));
        sb.append(123);

        System.out.println("Full: " + sb.toString());           // Hello World123
        System.out.println("charAt(1): " + sb.charAt(1));       // e
        System.out.println("length(): " + sb.length());         // 13
        System.out.println("substring(6, 11): " + sb.substring(6, 11)); // World
        System.out.println("toLowerCase(): " + sb.toLowerCase().toString()); // hello world123
	}
	public MyStringBuilder1(String s)	
	{
		this.value=s.toCharArray();
	}
	
	public int length()
	{
		return value.length;
	}
	
	public char charAt(int index) {
        return value[index];
    }
	
	public MyStringBuilder1 append(MyStringBuilder1 s)
	{
		char[] newValue = new char[this.value.length+s.length()];
		System.arraycopy(this.value, 0, newValue, 0, this.value.length);
        System.arraycopy(s.value, 0, newValue, this.value.length, s.length());
		this.value = newValue;
        return this;
	}
	
	public MyStringBuilder1 append(int i)
	{
		return append(new MyStringBuilder1(String.valueOf(i)));
	}
	
	public MyStringBuilder1 toLowerCase() {
		for(int i=0;i<value.length; i++)
		{
			value[i]=Character.toLowerCase(value[i]);
		}
		return this;
	}
	
	public MyStringBuilder1 substring(int begin, int end) {
		char[] sub = new char[end-begin];
		for(int i=begin; i< end ; i++)
		{
			sub[i-begin]=value[i];
		}
		return new MyStringBuilder1(new String(sub));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String(value);
	}
}
