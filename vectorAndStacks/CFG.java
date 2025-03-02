package vectorAndStacks;

import java.util.*;

public class CFG {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of character in integer : ");
		int t=sc.nextInt();
		System.out.println("Enter the character bracket : ");
		sc.nextLine();
		while(t--!=0) {
			String s=sc.nextLine();
			Stack<Character> stack=new Stack<>();
			
			boolean isBalanced=true;
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch=='(' || ch=='{' || ch=='[') {
					stack.push(ch);
					continue;
				}
				if(stack.isEmpty()) {
					isBalanced=false;
					break;
				}
				if(ch==')') {
					if(stack.peek()=='(') {
						stack.pop();
					}else {
						isBalanced=false;
						break;
					}
				}
				if(ch=='}') {
					if(stack.peek()=='{') {
						stack.pop();
					}else {
						isBalanced=false;
						break;
					}
				}
				if(ch==']') {
					if(stack.peek()=='[') {
						stack.pop();
					}else {
						isBalanced=false;
						break;
					}
				}
			}
			if(!stack.isEmpty()) {
				isBalanced=false;
			}
			if(isBalanced) {
				System.out.println("Balanced");
			}else {
				System.out.println("Unbalanced");
			}
		}
	}

}
