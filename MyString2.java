package Bolum10;

public class MyString2 {
	private String value;
	public static void main(String[] args) {
        MyString2 str = new MyString2("hello");
        System.out.println("compare :"+ str.compare("nice"));
        System.out.println("substring :"+ str.substring(2));
        System.out.println("toUpperCase :"+ str.toUpperCase());
        char[] chars = str.toChars();
        System.out.print("toChars(): ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("valueOf(true): " + MyString2.valueOf(true)); // "true"



	}
  public MyString2 (String s)
  {
	  this.value=s;
  }
  public int compare(String s)
  {
	  return this.value.compareTo(s);
  }
  public MyString2 substring(int begin)
  {
	  return new MyString2(this.value.substring(begin));
  }
  public MyString2 toUpperCase()	
  {
	  return new MyString2(this.value.toUpperCase());
  }
  public char[] toChars()
  {
	  return this.value.toCharArray();
  }
  public static MyString2 valueOf(boolean b)
  {
	  return new MyString2(String.valueOf(b));
  }
@Override
public String toString() {
	// TODO Auto-generated method stub
	return value;
}
}
