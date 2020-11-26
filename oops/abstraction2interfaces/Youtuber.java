package oops.abstraction2interfaces;

public abstract interface Youtuber extends VideoEditor{ //->Ek interface multiple interfaces ko extends kar skati hai
	
	int x=6; //-->Ye By default, public static abstract int x=6...Hai
	//int x; //->Error show karega..Okk
	abstract void makeVideo();
	
		//->Error show karega to avoid..Default add kar
	//	void uploadVideo() {
	//		System.out.println("Upload the video");
	//	}
		
		//Ab error nahi aaya/Ye aap baad mein new method add karne ke liye banaya gya hai
	default void uploadVideo() {
				System.out.println("Upload the video");
			}
}
