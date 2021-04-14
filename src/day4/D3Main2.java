package day4;

import java.util.Scanner;

public class D3Main2 {

	public static void main(String[] args) {
		D3CalculatorDemo obj = new D3CalculatorDemo();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Input Number 1 => ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Enter Input Number 2 => ");
		double n2 = scanner.nextDouble();
		
		
		double sum = obj.divide(n1, n2);
		System.out.println("Result = " + sum);
		
		
		scanner.close();
	}
}
