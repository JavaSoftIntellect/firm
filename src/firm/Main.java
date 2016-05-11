package firm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String firstChar = reader.next();
		
		System.out.println("Your last name:");
		String secondChar = reader.next();
		
		System.out.println("Your age:");
		int ageInt = reader.nextInt();
		
		System.out.println("Gender('m' or 'f'):");
		String thirdChar = reader.next();
		
		System.out.println("Phone number:");
		int numberInt = reader.nextInt();
		
		System.out.println("EGN:");
		int egnInt = reader.nextInt();
		
		System.out.println("Thanks");
		  

	}
}
