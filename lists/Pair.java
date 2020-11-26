package lists;

public class Pair<X, Y> {

//	String x;
//	int y;
	//X, Y -> Ab hum koi bhi random DataType ke pairs le sakte hai...Yo
	X x;
	Y y;
	
	public Pair(X x,Y y) {
		this.x=x;
		this.y=y;
	}
	public void getDescription() {
		System.out.println("X= "+x+" and Y= "+" "+y);
	}
}
