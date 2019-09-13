/*
 * Created by: Tristan Royer
 * Created on: 10/09/19
 * Created for: ICS4U
 * Day #3 (Logging Company)
 * This program gets an input from the user of a length and calculates 
 * how many logs of that length can be held in a truck.
*/
package LoggingCompany;
// imports the ability to utilize java scanner
import java.util.Scanner;
public class LoggingCompany {
// creates a new scanner
private static Scanner scanner = new Scanner( System.in );
public static void main(String args[]) {
// prints out a request for the user
	 System.out.print( "Type the length per log: " );
// assign the value input by the user to a variable
     double length = scanner.nextDouble();
     // calculates the number of logs that can be held
	 double weight = length * 20;
	 double number_Of_Logs = 1100 / weight ;
	 // displays the number of logs.
	 System.out.println(number_Of_Logs + " logs can be held");


}
}

