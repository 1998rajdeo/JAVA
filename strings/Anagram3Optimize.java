package strings;

public class Anagram3Optimize {

	public static void main(String[] args) {
		// XOR waal-Ab do loop ki jagah ek lengee,Incre = decrement->YES
		String a="aab#123";
		String b="aba#321";
		boolean isAnagram=true;
		//Ab 2nd tarika optimize waala-ASCII use 2 array se compare frequency
		int al[]=new int[256];
		int bl[]=new int[256];
		
		for(char c:a.toCharArray()) {
			int index=(int)c;
			al[index]++;
		}
		for(char c:b.toCharArray()) {
			int index=(int)c;
			al[index]--;
		}
		//Ab compare kar al and bl ko
		for(int i=0;i<256;i++) {
			if(al[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("Anagram hai");
		}else {
			System.out.println("Not Anagram");
		}
	}

	}
