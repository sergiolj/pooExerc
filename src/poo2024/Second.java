package poo2024;

public class Second {
	
	public static void main (String[] args) {
		Main myObj1 = new Main();
		Main myObj2 = new Main();
		
		System.out.println(myObj1.x+myObj2.y);
		myObj1.x=20;
		System.out.println(myObj1.x);
		myObj2.x=32;
		System.out.println(myObj2.x);
		Main.myMethodStatic();
		myObj1.myMethodPublic();
	}

}
