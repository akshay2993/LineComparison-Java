package com.bridgelabz.javaproblems;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
		int x1, x2, y1, y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates of two points- x1, x2, y1, y2: ");
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		y1 = sc.nextInt();
		y2 = sc.nextInt();
		System.out.println("(x1, x2) - "+ "(" + x1 +", "+ x2  +")\n" + "(y1, y2) - "+ "(" + y1 +", "+ y2  +")");

		double distance = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
		System.out.println("Distance between (x1, x2) & (y1, y2)/Length: " +distance+" units" );
	}
}