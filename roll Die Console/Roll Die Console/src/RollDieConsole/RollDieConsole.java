package RollDieConsole;

import java.util.Random;
import java.util.Scanner;

public class RollDieConsole {
	
	// creates a new scanner
	private static Scanner scanner = new Scanner( System.in );
	// function to generate number between 0 and user max value
	public static double RollDie(double maxValue) { 
		Random rndNumber = new Random();
		double randomNumber = Math.random() * maxValue + 1;
		return randomNumber;
	}
	public static void main(String[] args) {
		double answer;
		// prints out on the console a question for the user
		System.out.print("What is the max value that you want?");
		// assigns the user's answer to a variable
		double userValue = scanner.nextDouble();
		answer = RollDie(userValue);
		System.out.println("The random number generated is:" + answer);
		  
	}
		
	}

	
	


