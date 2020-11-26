package nestedForLoop;

public class Pattern2 {

	public static void main(String[] args) {
        int n=4;					 //User se le sakta hai
		for(int r=1;r<=n;r++) {      //for row
			for(int c=1;c<=r;c++) {  //for column
				System.out.print('*'+" ");
			}
			System.out.println();
		}
	}

}
