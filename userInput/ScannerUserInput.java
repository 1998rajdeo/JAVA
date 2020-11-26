package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount :");
		int principal=sc.nextInt();
		float rate=12.5f;
		float time=(float)12;
		float simpleInterest=principal*rate*time/100;
		System.out.println("SI is "+simpleInterest);
	}

}
