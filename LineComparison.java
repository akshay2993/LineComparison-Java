package com.bridgelabz.javaproblems;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		int x3, y3, x4, y4;
		Scanner sc = new Scanner(System.in);
		// -----  LINE 1 -------//
		System.out.println("Enter coordinates of two points(Line: 1)- x1, y1, x2, y2: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		System.out.println("(x1, y1) - "+ "(" + x1 +", "+ y1  +")\n" + "(x2, y2) - "+ "(" + x2 +", "+ y2  +")");
		// -----  LINE 2 -------//
		System.out.println("Enter coordinates of two points(Line: 2)- x3, y3, x4, y4: ");
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		x4 = sc.nextInt();
		y4 = sc.nextInt();
		System.out.println("(x3, y3) - "+ "(" + x3 +", "+ y3  +")\n" + "(x4, y4) - "+ "(" + x4 +", "+ y4  +")");
		// ----- Length - LINE 1 -------//
		Double length1 = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		Double dist1 = Math.sqrt(length1);

		// ----- Length - LINE 2 -------//
		Double length2 = Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2);
		Double dist2 = Math.sqrt(length2);

		System.out.println("Length(line 1)/Distance between (x1, y1) & (x2, y2): " + dist1 +" units" );
		System.out.println("Length(line 2)/Distance between (x3, y3) & (x4, y4): " + dist2 +" units" );

		if(dist1.equals(dist2)){
			System.out.println("Line 1 is equal to line 2!");
		}else {
			System.out.println("Line 1 is not equal to line 2!");
		}
	}
}