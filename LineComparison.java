package com.bridgelabz.javaproblems;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates of two points- x1, y1, x2, y2: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		System.out.println("(x1, y1) - "+ "(" + x1 +", "+ y1  +")\n" + "(x2, y2) - "+ "(" + x2 +", "+ y2  +")");
		double dist = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		System.out.println(dist);
		double res = Math.sqrt(dist);
		System.out.println("Distance between (x1, x2) & (y1, y2)/Length: " +res+" units" );
	}
}