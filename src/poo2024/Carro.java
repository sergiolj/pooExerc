package poo2024;

public class Carro extends Veiculo { //SUBCLASSE
	private String nomeModelo = "Mustang";
	
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.buzina(); // buzina() é um método herdado da classe Veiculo
		System.out.println(meuCarro.marca+ "  " + meuCarro.nomeModelo);
		//No caso o atributo marca foi herdado da Classe Veiculo, pois a classe carro só possui um
		//atributo que é nomeModelo
	}
}
