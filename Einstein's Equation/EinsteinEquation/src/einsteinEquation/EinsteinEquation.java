package einsteinEquation;
import java.util.Scanner;


public class EinsteinEquation {
private static Scanner scanner = new Scanner( System.in );

	public static void main(String args[]) {
	System.out.print("What is the mass of your object?");
	double m = scanner.nextDouble();
	double speedOfLight = (double) Math.pow(10,8);
	double c = 2.998 * speedOfLight;
	double cSquared = Math.pow(c ,2);
	double e = m * cSquared;
	System.out.println("The equation resulted in:" + e);
}
}
