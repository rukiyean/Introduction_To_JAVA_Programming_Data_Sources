package Bolum10;

import java.util.GregorianCalendar;

public class MyDate {
	
	private int year;
    private int month; 
    private int day;
    
	public static void main(String[] args) {
		 MyDate now = new MyDate();
		 System.out.println("Bug�n�n tarihi: " + now);
         System.out.println("Y�l: " + now.getYear());
         System.out.println("Ay: " + now.getMonth());  
         System.out.println("G�n: " + now.getDay());
		 
         System.out.println();
         
		 MyDate new1 = new MyDate(34355555133101L);
		 System.out.println("34355555133101L sonras� "+ new1);
         System.out.println("Y�l: " + new1.getYear());
         System.out.println("Ay: " + new1.getMonth());  
         System.out.println("G�n: " + new1.getDay());
	}
	
  public MyDate() {
	  GregorianCalendar calendar = new GregorianCalendar();
      this.year = calendar.get(GregorianCalendar.YEAR);
      this.month = calendar.get(GregorianCalendar.MONTH);
      this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
  
  public MyDate(long elapsedTime) {
      setDate(elapsedTime);
  }
  
  public MyDate(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
  }
  
  public int getYear() {
      return year;
  }

  public int getMonth() {
      return month;
  }

  public int getDay() {
      return day;
  }
  
  public void setDate(long elapsedTime) {
      GregorianCalendar calendar = new GregorianCalendar();
      calendar.setTimeInMillis(elapsedTime);
      this.year = calendar.get(GregorianCalendar.YEAR);
      this.month = calendar.get(GregorianCalendar.MONTH);
      this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
  }
    public String toString() {
        return String.format("%d-%02d-%02d", year, month + 1, day); // month + 1 for display
    }
    
 
    
  
}
