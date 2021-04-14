package day4;

import java.util.Scanner;

public class D3Main1 {

	public static void main(String[] args) {
		D3CalculatorDemo obj = new D3CalculatorDemo();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Input Number 1 => ");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter Input Number 2 => ");
		int n2 = scanner.nextInt();
		
		
		int sum = obj.addition(n1, n2);
		System.out.println("Result = " + sum);
		
		
		scanner.close();
	}
}
