package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {2,1,8,-3,6,4,12};
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			boolean sorted=true;        //Optimize->Agar ek bhi swap hua toh continue
			//for(int j=0;j<n-1;j++) {
				for(int j=0;j<n-1-i;j++) {  //Ye optimize kiya -i daal ke
				if(a[j+1]<a[j]) { 			// right agar left se chota hai
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
					sorted=false;  //Swap nahi hua
				}
			}
				if(sorted) break; //Optimize to stop if true
		}
		for(int item:a) {	//For each loop hai, iterative element ke liye
			System.out.print(item+" ");
		}
	}

}
