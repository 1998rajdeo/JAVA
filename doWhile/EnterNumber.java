package doWhile;
import java.util.*;
public class EnterNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=1;
		do {
			n=sc.nextInt();
			System.out.println("Number is "+n);
		}while(n!=0);
	}

}
