package Bolum10;

public class Circle2D {
  private double x,y;
  private double radius;
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        System.out.println("Contains point (3, 3): " + c1.contains(3, 3));
        System.out.println("Contains circle (4, 5, 10.5): " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Overlaps with circle (3, 5, 2.3): " + c1.overlaps(new Circle2D(3, 5, 2.3)));

	}
	public Circle2D()
	 {
		this(0,0,1);
	 }
	
	 public Circle2D(double x,double y, double radius)
	 {
		 this.x=x;
		 this.y=y;
		 this.radius=radius;
	 }
	 
	public double getx()
	{
			return x;
	}
	 public double gety()
	{
			return y;
	}
	 public double getradius()
	{
			return radius;
	}
	double getArea() {
		 return Math.PI*Math.sqrt(radius) ;
	}
	double getPerimeter() {
		 return Math.PI*radius*2 ;
	}
	
	// (x, y) noktasýnýn daire içinde olup olmadýðýný kontrol eder
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance <= radius;
    }
    
    // Verilen dairenin bu daire içinde olup olmadýðýný kontrol eder
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));
        return distance + circle.radius <= this.radius;
    }
    
 // Verilen daire ile çakýþma olup olmadýðýný kontrol eder
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));
        return distance < this.radius + circle.radius && !this.contains(circle);
    }
    
}
