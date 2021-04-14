package day4;

import java.util.Scanner;

public class D14StringFormatDemo3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String firstNameKey = "First Name";
		
		System.out.println("Enter First Name");
		String firstNameValue = scanner.nextLine();
		String lastNameKey = "Last Name";
		
		System.out.println("Enter Last Name");
		String lastNameValue = scanner.nextLine();
		
		
		// format here
		String formattedFirstNameKey = String.format("|%-25s|", firstNameKey);
		String formattedFirstNameVal = String.format("%-25.25s|", firstNameValue);
		
		String formattedLastNameKey = String.format("|%-25s|", lastNameKey);
		String formattedLastNameVal = String.format("%-25s|", lastNameValue);
		
		
		String dash = "-------------------------|------------------------";
		
		
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedFirstNameKey + formattedFirstNameVal);
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedLastNameKey + formattedLastNameVal);
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedFirstNameKey + formattedFirstNameVal);
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedLastNameKey + formattedLastNameVal);
		System.out.println(String.format("|%-51s|", dash));
		
		scanner.close();
	}

}
