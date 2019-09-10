package LoggingCompany;

import java.util.Scanner;
import java.io.InputStream;
public class LoggingCompany {
private static Scanner scanner = new Scanner( System.in );
public static void main(String args[]) {
// declare variables
	 System.out.print( "Type the length per log: " );
     double length = scanner.nextDouble();
	 double MAX_WEIGHT = 1100;
	 double PREMIER_LENGTH = 0.25;
	 double SECOND_LENGTH = 0.5;
	 double FINAL_LENGTH = 1;
	 double weight = length * 20;
	 double number_Of_Logs = 1100 / weight ;
	 System.out.println(number_Of_Logs);


}
}

