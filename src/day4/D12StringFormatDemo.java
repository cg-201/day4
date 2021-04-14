package day4;

public class D12StringFormatDemo {
	
	public static void main(String[] args) {
		
		String firstNameKey = "First Name";
		String firstNameValue = "Sunil";
		String lastNameKey = "Last Name";
		String lastNameValue = "Babu";
		
		
		// format here
		String formattedFirstNameKey = String.format("|%-25s|", firstNameKey);
		String formattedFirstNameVal = String.format("%-25s|", firstNameValue);
		
		String formattedLastNameKey = String.format("|%-25s|", lastNameKey);
		String formattedLastNameVal = String.format("%-25s|", lastNameValue);
		
		
		String dash = "-------------------------|------------------------";
		
		
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedFirstNameKey + formattedFirstNameVal);
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedLastNameKey + formattedLastNameVal);
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedFirstNameKey + formattedFirstNameVal);
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(formattedLastNameKey + formattedLastNameVal);
		System.out.println(String.format("|%-51s|", dash));
	}

}
