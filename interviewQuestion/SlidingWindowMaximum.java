package interviewQuestion;
import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		Solution solution=new Solution();
		int a[]= {4,3,1,2,5,3,4,7,1,9};
		int ans[]=solution.maxSlidingWindow(a, 4);
		for(int x:ans) {
			System.out.print(x+" ");
		}
	}
	static class Solution {
	    public int[] maxSlidingWindow(int[] a, int k) {
	        int n=a.length;
	        if(n<=1) return a;
	    	Deque<Integer> dq=new LinkedList<>();
	        int ans[]=new int[n-k+1];
	        int i=0;
	        for(;i<k;i++) {
	        	while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
	        		dq.removeLast();
	        	}
	        	dq.addLast(i); //index daalengee
	        }
	        for(;i<n;i++) {
	        	ans[i-k]=a[dq.peekFirst()];
	        	while(!dq.isEmpty() && dq.peekFirst()<=i-k) {
	        		dq.removeFirst();
	        	}
	        	while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
	        		dq.removeLast();
	        	}
	        	dq.addLast(i);
	        }
	        ans[i-k]=a[dq.peekFirst()];
	        return ans;
	        }
	    }
	}
//Same on Leetcode ->https://leetcode.com/problems/sliding-window-maximum/description/ 
