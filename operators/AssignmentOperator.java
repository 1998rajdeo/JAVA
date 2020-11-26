package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		a+=2;// a=a+2 -> a=4+2 - >6
		System.out.println(a);
		
		int a1=4;
		a1>>=2; // Left shift 4/2 then 2/2 =1...okk
		System.out.println(a1);
		
		int a2=4;
		a2&=2; //4=100 in binary & 2=10 in binary ans 000
		System.out.println(a2);
		
		int a3=4;
		a3|=2; //4=100 in binary OR 2=10 in binary ans 101->6 ayega
		System.out.println(a3);
	}

}
