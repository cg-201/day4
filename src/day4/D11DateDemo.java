package day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class D11DateDemo {
	public static void main(String[] args) {

		LocalDate date =  LocalDate.now();
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
	}

}
