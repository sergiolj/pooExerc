package interfaces;

public class MultipleInterfaces implements FirstInterface, SecondInterface {
	public void metodFirstInterface() {
		System.out.println("Primeira da multiplas interfaces...como usar mais de uma referência");
	}
	public void metodSecondInterface() {
		System.out.println("Segunda da multiplas interfaces...como usar mais de uma referência");
	}

}
