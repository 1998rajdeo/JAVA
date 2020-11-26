package competitiveProg;
import java.util.*;

public class Mathematics {

	public static void main(String[] args) {

		//seieveOfEratoSthenes->Prime numbers
		boolean isPrime[]=seieveOfEratoSthenes(20);
		for(int i=0;i<=20;i++) {
			System.out.println(i+" "+isPrime[i]);
		}
			//for GCD->(a,b)=(b,a%b)
			System.out.println("GCD = "+gcd(24,60));
				//for ModuloArithemtic Property->fastPower/a^b%n
				System.out.println("Fast Power : "+fastPower(3978432,5,1000000007));
	}
	static long fastPower(long a,long b,long n) {
		long res=1;
		while(b>0) {
			if((b&1)!=0) {
				res=(res%n*a%n)%n;  //Arithemtic Modulo property->To avoid Integer overflow,
									//ex: 10 ka power 5 * 5478=Int mein Overflow hota hai,Therfore, Long datatype+Modulo property
			}
			a=(a%n*a%n)%n;
			b=b>>1;
		}
		return res;
	}
	
	//GCD(GreatestComonDivision)=HCF by Euclidean Algorithm,GCD(a,b)=forLearning->gcd(a-b,b)since, a>b
																    //forCoding->gcd(b,a%b) and a%b!=0...Using Recursive 
	static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}
	static boolean[] seieveOfEratoSthenes(int n) {
		boolean isPrime[]=new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		isPrime[0]=false;
		isPrime[1]=false;
		
		for(int i=2;i*i<=n;i++) {
			for(int j=2*i;j<=n;j+=i) {
				isPrime[j]=false;
			}
		}
		return isPrime;
	}

}
