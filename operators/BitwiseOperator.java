package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=6;
		System.out.println(a&b);
		
		int b1=13;
		int c=b1>>1;
		System.out.println("Right Shif t : "+c);//half hota hai
		
		int b2=13;
		int c1=b2<<1;
		System.out.println("Left Shift : "+c1);//Double hota hai
	}

}
