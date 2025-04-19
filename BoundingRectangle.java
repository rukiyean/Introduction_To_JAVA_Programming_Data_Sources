package Bolum10;

import java.util.Scanner;

public class BoundingRectangle {
	
	private double x, y;
    private double w, h;
    
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        double[][] points = new double[5][2];

        System.out.println("5 nokta girin (x y):");
        for (int i = 0; i < points.length; i++) {
            System.out.print((i + 1) + ". nokta: ");
            points[i][0] = input.nextDouble(); // x
            points[i][1] = input.nextDouble(); // y
        }
        
        MyRectangle2D rectangle = BoundingRectangle.getRectangle(points);

        System.out.println("Bounding Rectangle:");
        System.out.println("Merkez: (" + rectangle.getX() + ", " + rectangle.getY() + ")");
        System.out.println("Geniþlik: " + rectangle.getW());
        System.out.println("Yükseklik: " + rectangle.getH());

	}
	
	public BoundingRectangle()
	{
		this(0,0,1,1);
	}
	
	public BoundingRectangle(double x,double y,double h, double w)
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
	 public static MyRectangle2D getRectangle(double[][] points)
	 {
		 double minX = points[0][0];
        double maxX = points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < minX) minX = points[i][0];
            if (points[i][0] > maxX) maxX = points[i][0];
            if (points[i][1] < minY) minY = points[i][1];
            if (points[i][1] > maxY) maxY = points[i][1];
        }
        
        double centerX = (minX + maxX) / 2;
        double centerY = (minY + maxY) / 2;
        double width = maxX - minX;
        double height = maxY - minY;

        return new MyRectangle2D(centerX, centerY, width, height);
	 }

}
