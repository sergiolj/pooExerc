package enumerations;

public class Main {

	public static void main(String[] args) {
		Level minhaVariavel = Level.LOW;
		System.out.println(minhaVariavel);
		
		switch(minhaVariavel) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;
		}
		enumLoop();
	}
	public static void enumLoop() {
		for(Level minhaVariavel:Level.values()) {
			System.out.println(minhaVariavel);
		}
	}

}
