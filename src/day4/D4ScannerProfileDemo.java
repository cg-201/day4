package day4;

import java.util.Scanner;

public class D4ScannerProfileDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Name ::");
		String firstName = scanner.nextLine();
		
		System.out.println("Enter Last Name ::");
		String lastName = scanner.nextLine();
		
		System.out.println("Enter Email Address ::");
		String email = scanner.nextLine();
		
		System.out.println("Enter Mobile ::");
		String mobile = scanner.nextLine();
		
		System.out.println("First name " + firstName);
		System.out.println("Last name " + lastName);
		System.out.println("Email " + email);
		System.out.println("Mobile " + mobile);
		
		scanner.close();
	}

}
