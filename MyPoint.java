package Bolum10;

public class MyPoint {
    
	private double x=0,y=0;
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(0,0);
		MyPoint p2 = new MyPoint(10, 30.5);
		
		 System.out.println("Distance from p1 to p2: " + p1.distance(p2));
	     System.out.println("Distance using static method: " + MyPoint.distance(p1, p2));
	}
	
public MyPoint()
 {
	this(0,0);
 }
	 
 public MyPoint(double x,double y)
 {
	 this.x=x;
	 this.y=y;
 }
 
 public double getx()
	{
		return x;
	}
 public double gety()
	{
		return y;
	}
 
 public double distance(MyPoint  other)
 {
     return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));

 }
 public double distance(double x, double y)
 {
     return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

 }
 public  static double distance(MyPoint p1,MyPoint p2)
 {
     return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));

 }
}
