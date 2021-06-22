package com.bridgelab;

import java.util.Scanner;

public class LineComparison
{	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		float x1=0, x2=0, y1=0, y2=0;
		
		System.out.print("Enter the value of a point x1: "); 
		x1 = scanner.nextFloat();
		System.out.print("Enter the value of a point y1: "); 
		y1 = scanner.nextFloat();
		System.out.print("Enter the value of a point x2: "); 
		x2 = scanner.nextFloat();
		System.out.print("Enter the value of a point y2: "); 
		y2 = scanner.nextFloat();
		
		//Calculating length of an line using math.sqrt() function.
		float length =(float) Math.sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
		System.out.println("\nThe length of a line is:" + length);
	}
}
