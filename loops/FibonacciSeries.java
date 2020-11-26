package loops;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter a no : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=0,b=1;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=0;i<n-2;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
