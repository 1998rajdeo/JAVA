package conditionalStatement;

public class IfClass {

	public static void main(String[] args) {
		
		int number=23;
		if(number <= 10) {
			System.out.println("Number is less than 10");
		}else if(number > 10 && number <= 20) {
			System.out.println("Number is greater than 10 and less than 20");
		}else if(number > 20 && number <= 30) {
			System.out.println("Number is greater than 20 and less than 30");
		}else {
			System.out.println("Number is greater than 30");
		}
			

	}

}
