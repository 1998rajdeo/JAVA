package sets;
/*
 * Given an array, find it there exists a subarray with sum equals to zero.
 * n<10^5 => Ex, 100 second ka 10 second, lega set mein
 */
import java.util.*;
public class SubarrayWithZeroSum {

	public static void main(String[] args) {

		int a[]= {2, -2, 3, 4, 2};
		int k=6;	//Agar k diya hua hai
		boolean found=false;
		
		//Ye normal hai
//			for(int i=0;i<a.length;i++) {
//				int sum=0;
//				for(int j=i;j<a.length;j++) {
//					sum+=a[j];
//					if(sum==0) {
//						found=true;
//						break;
//					}
//				}
//				if(found) break;
//			}
		
		//Ab set+one concept, se karenge/Iss mein space increase but time complexity decrease hui hai
		Set<Integer> set=new HashSet<>();
		int sum=0;
		for(int element:a) {
			set.add(sum);
			sum+=element;
			if(set.contains(sum-k)) { //sum or sum-k(if k is given)
				found=true;
				break;
			}
		}
		
		System.out.println("Found "+found);
	}
}
