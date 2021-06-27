package com.bridgelab;

import java.util.Scanner;

/*********************************************************************
 * @author mihir
 * 
 * As per user input calculating difference between two lines.
 * as if they both are equal, first one is greater than the second one
 * or first one is smaller than the second one.
 *********************************************************************/

public class LineComparison
{	
	float x1=0, x2=0, y1=0, y2=0, a1=0, a2=0, b1=0, b2=0;
	static Scanner scanner = new Scanner(System.in);
	
	/**
	 * Name : compareTo
	 * 
	 * Description : Checking if both the line are equal, grater than or smaller than the other one.
	 * 
	 * Algorithm : Accepting starting point and ending points for both the lines from a user.
	 * with the help of math.sqrt() function calculating length of the lines.
	 * Comparing the length of the lines with the help of compare() function to check if equal,
	 * smaller or greater.
	 * 
	 * Modification : Last commit 27-June-2021
	 */
	public void compareTo()
	{
		System.out.print("Enter the value of a point x1: "); 
		x1 = scanner.nextFloat();
		System.out.print("Enter the value of a point y1: "); 
		y1 = scanner.nextFloat();
		System.out.print("Enter the value of a point x2: "); 
		x2 = scanner.nextFloat();
		System.out.print("Enter the value of a point y2: "); 
		y2 = scanner.nextFloat();
		System.out.print("Enter the value of a point a1: "); 
		a1 = scanner.nextFloat();
		System.out.print("Enter the value of a point b1: "); 
		b1 = scanner.nextFloat();
		System.out.print("Enter the value of a point a2: "); 
		a2 = scanner.nextFloat();
		System.out.print("Enter the value of a point b2: "); 
		b2 = scanner.nextFloat();
		
		//Calculating length of lines using math.sqrt() function that is accepting number from user.
		float firstLineLength =(float) Math.sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
		float secondLineLength =(float) Math.sqrt( ( ( a2 - a1 ) * ( a2 - a1 ) ) + ( ( b2 - b1 ) * ( b2 - b1 ) ) );
		
		System.out.println("\nThe length of a first line is:" + firstLineLength);
		System.out.println("The length of a second line is:" + secondLineLength);
		Float obj1 = firstLineLength;
		Float obj2 = secondLineLength;
		int val = Float.compare(obj1, obj2);
	    if (val == 0) 
		{
			System.out.println("Both the line are equal.");
		}
		else if (val > 0)
		{
			System.out.println("The first line is greater than the second line.");
		}
		else
		{
			System.out.println("The first line is smaller than the second line.");
		}
	}
	
	public static void main(String[] args)
	{
		LineComparison lineComparisonObject = new LineComparison();
		lineComparisonObject.compareTo();
	}
}
