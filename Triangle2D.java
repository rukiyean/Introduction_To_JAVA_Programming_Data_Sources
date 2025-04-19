package Bolum10;

public class Triangle2D {
	    private MyPoint p1;
	    private MyPoint p2;
	    private MyPoint p3;
	    
	public static void main(String[] args) {
		MyPoint a = new MyPoint(0, 0);
        MyPoint b = new MyPoint(10, 30.5);
        MyPoint c = new MyPoint(2, 5);

        Triangle2D triangle = new Triangle2D(a, b, c);

        System.out.println("Alan: " + triangle.getArea());
        System.out.println("Çevre: " + triangle.getPerimeter());
       

	}
	public Triangle2D() {
        this.p1 = new MyPoint(0, 0);
        this.p2 = new MyPoint(1, 1);
        this.p3 = new MyPoint(2, 5);
    }
		 
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
	 
	public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
    
    public double getArea() {
        double x1 = p1.getx(), y1 = p1.gety();
        double x2 = p2.getx(), y2 = p2.gety();
        double x3 = p3.getx(), y3 = p3.gety();

        return Math.abs((x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)) / 2.0);
    }
    
    double getPerimeter()
    {
    	double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);

        return side1 + side2 + side3;
    }
    

    
   

}
