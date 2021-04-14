package day4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class D8DateDemo {
	public static void main(String[] args) {

		String str = "12-04-2021";
		
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate parsedDate = LocalDate.parse(str, formatter);
		// parsedDate.minusDays(1); // minus day
		
		System.out.println(parsedDate);
		System.out.println(parsedDate.minusDays(1));
	}

}
