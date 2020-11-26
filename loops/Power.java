package loops;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a no : ");
		int a=sc.nextInt();
		System.out.print("Enter Power : ");
		int b=sc.nextInt();
		
		int result=1;
		for(int i=0;i<b;i++) {
			result*=a; //result=result*a;
		}
		System.out.println("Value is "+result);
	}

}
