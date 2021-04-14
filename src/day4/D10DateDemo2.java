package day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class D10DateDemo2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Date in dd-MM-yyyy HH:mm format");
		String str = scanner.nextLine();
		
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

		LocalDateTime parsedDate = LocalDateTime.parse(str, formatter);
		System.out.println(parsedDate);
		
		scanner.close();
	}

}
