package oops.abstraction2interfaces;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {
		Person obj=new Person();
		obj.study();
		obj.makeVideo();
		
		Youtuber obj2=obj; //Upcasting, ab ye sirf Youtuber rah gaya hai,Ussi ka hibulayega/Ye instantiate nahi hai,Jab New Keyword nahi hai
		obj2.editVideo();
		obj2.makeVideo();
		//obj2.study(); //->Error ayegaa, Kyuki uske paas nahi hai
		
	}

	@Override
	public void study() {
		System.out.println("Person is studying");		
	}

	@Override
	public void makeVideo() {
		System.out.println("Youtuber is making video");
	}

	@Override
	public void editVideo() {
		System.out.println("Youtuber is editing video");
		
	}

}
