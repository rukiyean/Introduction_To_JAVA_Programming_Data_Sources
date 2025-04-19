package Bolum10;

public class MyRectangle2D {
	private double x,y,h,w;
	public static void main(String[] args) {
        
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("r1 area MyRectangle2D(2, 2, 5.5, 4.9): " + r1.getArea());
        System.out.println("r1 Perimeter MyRectangle2D(2, 2, 5.5, 4.9): " + r1.getPerimeter());
        
        System.out.println("r1.contains(3, 3): " + r1.contains(3, 3));

        System.out.println("r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)): " +
                r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)): " +
                r1.overlays(new MyRectangle2D(3, 5, 2.3, 5.4)));

	}
	
	public MyRectangle2D()
	{
		this(0,0,1,1);
	}
	 public MyRectangle2D(double x,double y,double h, double w)
	 {
		 this.x=x;
		 this.y=y;
		 this.w=w;
		 this.h=h;
	 }
	 public double getX()
		{
			return x;
		}
	 public void setX(double x) {
	        this.x= x;
	    }
	 public double getY()
		{
			return y;
		}
	 public void setY(double y) {
	        this.y= y;
	    }
	 public double getW()
		{
			return w;
		}
	 public void setW(double w) {
	        this.w= w;
	    }
	 public double getH()
		{
			return h;
		}
	 public void setH(double h) {
	        this.h= h;
	    }
	 public double getArea()
	 {
		 return w*h;
	 }
	 public double getPerimeter()
	 {
		 return 2*(w+h);
	 }
	 
	 //(a) Bir noktanýn (px, py) dikdörtgenin içinde olup olmadýðýný kontrol etme yöntemi
	 public boolean contains (double px, double py)
	 {
		 return (px >= x && px <= x+w && py >= y && py <= y+h);
	 }
	 
	 //(b) Bu dikdörtgenin baþka bir dikdörtgen içerip içermediðini kontrol etme yöntemi
	 public boolean contains (MyRectangle2D r)
	 {
		 return (r.x >= x && r.x+r.w <= x+w && r.y >= y && r.y + r.h <= y+h);
	 }
	 
	//(c) Bu dikdörtgenin baþka bir dikdörtgenle örtüþüp örtüþmediðini kontrol etme yöntemi
	 public boolean overlays (MyRectangle2D r)
	 {
		 return !(r.x > x+w || r.x+r.w < x || r.y >y+h || r.y+r.h <y);
	 }
}
