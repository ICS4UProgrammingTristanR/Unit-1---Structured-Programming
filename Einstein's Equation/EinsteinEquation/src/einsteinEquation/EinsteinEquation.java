/*
 * Created by: Tristan Royer
 * Created on: Sept-2019
 * Created for: ICS4U
 * Day #5 Einstein Equation
 * This program calculates an equation using a value input by the user.
*/
package einsteinEquation;
// imports the ability to utilize java scanner
import java.util.Scanner;


public class EinsteinEquation {
	// creates a new scanner
private static Scanner scanner = new Scanner( System.in );

	public static void main(String args[]) {
	// prints out on the console a question for the user
	System.out.print("What is the mass of your object?");
	// assigns the user's answer to a variable
	double m = scanner.nextDouble();
	// calculates the answer utilizing the equation
	double speedOfLight = (double) Math.pow(10,8);
	double c = 2.998 * speedOfLight;
	double cSquared = Math.pow(c ,2);
	double e = m * cSquared;
	// prints out a statement of the answer.
	System.out.println("The equation resulted in:" + e);
}
}
