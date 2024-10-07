package edu.scu.coen160.lab2;

public class Q4 {
	public static void q4() {
		// Implement a test where you create three Singleton 
		// objects and you prove they are the same
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		
		if(obj1 == obj2 && obj2 == obj3)
			System.out.println("All objects are the same.");
		else
			System.out.println("Object aren't the same.");
	}
}