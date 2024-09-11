package poo2024;

class OuterClass {
	int y=5;
		class InnerClass {
			int x=10;
		}
}

public class MainInnerOuter {
	public static void main(String[] args) {
		OuterClass minhaExterna = new OuterClass();
		OuterClass.InnerClass minhaInterna = minhaExterna.new InnerClass();
		System.out.println(minhaInterna.x + minhaExterna.y);
	}
}
