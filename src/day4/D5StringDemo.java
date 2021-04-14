package day4;

public class D5StringDemo {
	
	public static void main(String[] args) {

		 // stringDemo2();
		 // stringDemo3();
		utilityDemo2();
	}
	
	
	static void stringConcatDemo() {
		String str1 = "Hello";
		String str2 = "World";
		
		String str3 = str1 + str2;
		System.out.println(str3);
	}
	
	static void stringConcatDemo1() {
		String str1 = "100" + 100.00;
		
		System.out.println(str1);
	}
	
	// Answer 3
	static void stringConcatDemo2() {
		String str1 = "hello";
		str1 = str1 + " world";
		str1 = str1 + " a";
		
		System.out.println(str1);
	}
	
	
	static void stringDemo1() {
		String str1 = "Hello World";
		String str2 = new String("Hello World");
		
		System.out.println(str1);
		System.out.println(str2);
	}

	
	static void stringDemo2() {
		String str1 = "Hello World"; // without new keyword
		String str2 = "Hello World";
		
		System.out.println(str1 == str2);       // Reference Comparision : true
		System.out.println(str1.equals(str2));  // value comparsion  	: true
	}
	
	
	static void stringDemo3() {
		String str1 = new String("Hello World");
		String str2 = new String("Hello World");
		
		System.out.println(str1 == str2); 			// Reference Comparsion : false
		System.out.println(str1.equals(str2));		// Value Comparasion	: true
	}


	static void utilityDemo() {
		
		String str = "";
		System.out.println(str.isEmpty());
		
		String str1 = "hello world";
		System.out.println(str1.length());
		
		System.out.println(str1.startsWith("he"));
		System.out.println(str1.startsWith("ae"));
		
		System.out.println(str1.endsWith("rld"));
		System.out.println(str1.endsWith("ald"));
		
		System.out.println(str1.concat("abcd"));
		
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(0, 4));
		
		System.out.println(str1.replace("he", "He"));
		System.out.println(str1.replace("l", "L"));
		
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
	}


	static void utilityDemo1() {
		String str = "Hello World";  // immutable
		str.toLowerCase(); // hello world
		System.out.println(str);
		
		String str1 = str.toLowerCase();
		System.out.println(str1);
	}
	
	static void utilityDemo2() {
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
	}
	
	
	static void utilityDemo3() {
		// this is not thread safe
		StringBuilder sb = new StringBuilder("hello");
		sb.append("world");
		System.out.println(sb);
	}
}
