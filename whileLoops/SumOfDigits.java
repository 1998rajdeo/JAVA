package whileLoops;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int numberOfDigits=(int)Math.log10(n)+1;
		System.out.println("No of Digits is "+numberOfDigits);//ye forloop ke liye
		
		int temp=n;
		int sum=0;
		
		while(temp>0) {
			int lastDigit=temp%10;
			temp/=10;
			
			sum+=lastDigit;
			System.out.println(lastDigit+" "+temp+" "+sum);//Loop samajh le mast
		}
		System.out.println("The sum of digits of "+n+" is "+sum);
	}

}
