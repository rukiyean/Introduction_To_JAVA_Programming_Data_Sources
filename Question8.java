package Sorular;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of points: ");	
	int num = input.nextInt();
	System.out.println("Enter 8 points:: ");	
	double[][] points = new double[num][2];
	for(int i=0 ;i < num ;i++)
	{
		 points[i][0] = input.nextDouble();
         points[i][1] = input.nextDouble();
	}
	
	int p1 = 0, p2 = 1 ; // Initial two points
	double shortestDistance = distance(points[p1][0], points[p1][1],
	 points[p2][0], points[p2][1]);	
	for (int i = 0; i < points.length; i++) {
		 for (int j = i + 1; j < points.length; j++) {
			double distance = distance(points[i][0], points[i][1],
			points[j][0], points[j][1]); // Find distance
			 if (shortestDistance > distance) {
			 shortestDistance = distance; // Update shortestDistance
			 }
		 }
	}
	
	for (int i = 0; i < points.length; i++) {
		 for (int j = i + 1; j < points.length; j++) {
			 double dist = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
             if (dist == shortestDistance) {
                 System.out.println("(" + points[i][0] + ", " + points[i][1] + ") and ("
                         + points[j][0] + ", " + points[j][1] + ")");
             }
		 }
		 
	}		
	System.out.println(shortestDistance );
       
	}
	public static double distance(
			double x1, double y1, double x2, double y2) {
			return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}
