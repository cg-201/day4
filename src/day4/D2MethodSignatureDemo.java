package day4;

public class D2MethodSignatureDemo {

	public static void main(String[] args) throws Exception{
		System.out.println("Hello world!!");
	}
	
	
	void printMessage() {
		System.out.println("Hello World!!!!");
	}
	
	void printMessage(String message) {
		System.out.println(message);
	}
	
	void printMessage(String message, String message2) {
		System.out.println(message);
		System.out.println(message2);
	}
	
	void printMessage(String message, int number) {
		
	}
	
	
	
	int getRandomNumber() {
		// logic...
		// logic ..
		return 100;
	}
	
	float getFloatNumber() {
		return 1.0f;
	}
	
	
	
	
}
