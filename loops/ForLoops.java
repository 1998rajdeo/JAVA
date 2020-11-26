package loops;

public class ForLoops {

	public static void main(String[] args) {
		
		//Print
		for(int i=0;i<=10;i=i+1)
		{
			System.out.println("Hello"+i);
		}
		
		//print even no
		for(int i=2;i<=10;i=i+2)
		{
			System.out.println(i);
		}
		
		//print sum of all no
		int sum=0,n=5;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum : "+sum);
	}		

}
