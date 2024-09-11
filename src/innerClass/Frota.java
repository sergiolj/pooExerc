package innerClass;

public class Frota extends Carro {

	public static void main(String[] args) {
		Carro c001 = new Carro("Corsa", "Chevrolet", "Passeio", "popular");
		Carro.Motor m001 = c001.new Motor("Linha",4,68);
		//Motor m001 = new Motor("Linha",4,82);
		c001.descricao();
		m001.descricao();
		
	}

}
