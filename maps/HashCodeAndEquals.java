package maps;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {

	public static void main(String[] args) {

		Pen pen1=new Pen(10,"blue");
		Pen pen2=new Pen(10,"blue");
		
		System.out.println("Pen 1 : "+pen1);
		System.out.println("Pen 2 : "+pen2);
		System.out.println(pen1==pen2);		//Dono alag memory mein hai, therefore ffalse ans aa rha hai
		System.out.println(pen1.equals(pen2));	//Dono same reference ko point nhi kar rahe hai, isisliye wo alag hai
		
		Set<Pen> pens=new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		System.out.println("Pens :"+pens); //Ye abhi bhi equal nahi maan rha, To avoid this Use hashCode()
	}

}
class Pen{
	int price;
	String color;
	public Pen(int price, String color) {
		this.price=price;
		this.color=color;
	}
		//Hum apne condition se equals ki paribhasha dengee,
//		Mera Generate
//		@Override
//		public boolean equals(Object obj) { //Define krenge ki dusra object tumse alag kaise hai
//			Pen that=(Pen)obj;
//			boolean isEqual=this.price==that.price && this.color.equals(that.color);
//			return isEqual;
//		}
//		@Override
//		public int hashCode() { //Ab Pens mein 2 value nahi ek aayegaa
//			return price+color.hashCode(); //Apna logic to generate hashCode
//		}
	//Inbuilt Ecllipse mein hai hashCode() and equals
	//Steps : Source tab or RightClick kar->Generate hashCode() and equals->Then tu apne according field basis define kar
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}
