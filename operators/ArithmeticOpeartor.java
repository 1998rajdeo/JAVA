package operators;

public class ArithmeticOpeartor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=5;
		
		int c=a*a+2*a*b+b*b;
		int d=(a+b)*(a+b);
		
		System.out.println("C = "+c);
		System.out.println("D = "+d);
		
		int a1=10,b1=10;
		a1=a1++;
		b1=++b1;
		System.out.println("a1 = "+a1+", b1 = "+b1);
		System.out.println("Now badega b1 ="+b1);
	}

}
