package day4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class D7DateDemo {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		// formating the date
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

		String formatedDate = date.format(formatter);
		System.out.println(formatedDate);
	}

}
