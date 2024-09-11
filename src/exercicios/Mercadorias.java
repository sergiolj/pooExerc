package exercicios;

public class Mercadorias {

	public static void main(String[] args) {

		Lampada l1=new Lampada();
		try{
			l1.setTipo("LED");
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(l1.getTipo());
	}
}
