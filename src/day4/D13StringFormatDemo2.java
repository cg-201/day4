package day4;

public class D13StringFormatDemo2 {
	
	public static void main(String[] args) {
		
		String str = "Hello World Welcome Here";
		
		String str1 = String.format("@%-15.15s#", str);
		
		System.out.println(str1);
		
	}

}
