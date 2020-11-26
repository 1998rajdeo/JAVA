package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {

		try {
			int arr[]=new int[5];
			System.out.println(arr[6]);
			
		int a=5;
		int b=0;
		int c=a/b;
		
		System.out.println(c);
	}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" occured, plz check code");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Check index array range");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Check casting");
		}
		finally { //-> Ye run hi hoga exception mila na mile...Okk
			System.out.println("Sorry for the inconvience.");
		}
		System.out.println("Very imp code, Needs to run"); //Dekha run hua, try catch ke benefits
	}
}
