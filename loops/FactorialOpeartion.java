package loops;
import java.util.*;

public class FactorialOpeartion {

	public static void main(String[] args) {
		
		System.out.println("Enter a no : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int factorial=1;
		
		for(int i=n;i>=1;i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}
