package day4;

import java.util.Scanner;

public class D1ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your user name ");
		String username = scanner.nextLine();
		
		System.out.println(username);
		
		scanner.close();
	}
}
