package conditionalStatement;

public class NestedIfelse {

	public static void main(String[] args) {
		
		int a=12, b=8, c=10;
		int result=0;
		//Ternary operator mein 1 line mein kaam ho jayega
		//result = a>b?a>c?a:c:b>c?b:c;
		if(a>b) {
			if(a>c) {
				result=a;
			}else {
				result=c;
			}
		}else {
				if(b>c) {
					result=b;
				}else {
					result=c;
				}
			}
		System.out.println("Largest of three no is : "+result);
		}
	}
