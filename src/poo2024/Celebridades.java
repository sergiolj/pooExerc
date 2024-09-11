package poo2024;

public class Celebridades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa Pessoa1 = new Pessoa("Albert Einstein", 13, 3, 1879);
		Pessoa1.calculaIdade(1945);
		Pessoa Pessoa2 = new Pessoa("Isaac Newton", 4, 1, 1643);
		Pessoa2.calculaIdade(2000);
		Pessoa Pessoa3 = new Pessoa("John Doe",1,1,2000);
		Pessoa3.informaNome();
		Pessoa3.ajustaDataNasc(10, 2, 2005);
	}
}
