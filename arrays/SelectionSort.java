package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[]= {3,1,-2,7,4,0};
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			int minIndex=i;   //Initial mein 1st waala position ok
			for(int j=i;j<n;j++) {
				if(a[j]<a[minIndex]) { //current MinIndex se chota check ok
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
