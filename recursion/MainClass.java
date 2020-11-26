package recursion;

public class MainClass {

	static int stepCount=0;
	public static void main(String[] args) {

		System.out.println("Sum = "+sum(5));
		
		System.out.println("Multiply = "+pow(3,10000));//Bigint se ayega, abhi -/minus ayega answer wo chhod, concept samaj
		System.out.println("Steps count : "+stepCount);	//10001 step lag rahe hai
		
		stepCount=0; //Re-Initialize for FastMultiply
		System.out.println("Fast Multiply = "+fastpow(3,10000)); //Bass 19 step..dekha jaduuu
		System.out.println("Steps count : "+stepCount);
		
		System.out.println("Total path= "+path(3,1)); //Path(row, column)
	}
	static int sum(int n) {
		if(n==1) {			//Base case
			return 1;	
		}
		return n+sum(n-1); //Recursive call
	}
	static int pow(int a,int b) {
		stepCount++;
		if(b==0) {
			return 1;
		}
		return a*pow(a,b-1);
	}
	static int fastpow(int a, int b) {
		//System.out.println(b); //To check internal working...bro
		stepCount++;
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return fastpow(a*a, b/2);
		}
		return a*fastpow(a, b-1);
	}
	static int path(int n,int m) {
		if(n==1 || m==1) return 1;
		return path(n, m-1)+path(m, n-1);
	}
}
