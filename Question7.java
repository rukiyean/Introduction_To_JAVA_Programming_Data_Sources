package Sorular;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//8.7 (Points nearest to each other) 
	double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
			 {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
			 {5.5, 4, -0.5}};

	int p1 = 0, p2 = 1 ; // Initial two points
	double shortestDistance = distance(points[p1][0], points[p1][1],
	points[p1][2], points[p2][0], points[p2][1], points[p2][2]);	
	for (int i = 0; i < points.length; i++) {
		 for (int j = i + 1; j < points.length; j++) {
			double distance = distance(points[i][0], points[i][1], points[i][2],
			points[j][0], points[j][1], points[i][2]); // Find distance
			 if (shortestDistance > distance) {
			 p1 = i; // Update p1
			 p2 = j; // Update p2
			 shortestDistance = distance; // Update shortestDistance
			 }
		 }
	}
	 System.out.println("The closest two points are " +
	 "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
	 points[p2][0] + ", " + points[p2][1] + ")");	
        
	}

}
	public static double distance(
	double x1, double y1, double x2, double y2, double z1, double z2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
	}
}
