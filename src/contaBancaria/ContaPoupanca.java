package contaBancaria;

public class ContaPoupanca extends ContaBancaria {
	int diaRendimento;
	float percentual=0f; 
	
	//CONSTRUTOR DA SUBCLASSE
	public ContaPoupanca(String nomeCliente, int numConta, int diaRendimento) { 
		super(nomeCliente,numConta); //O CONSTRUTOR USA OS ATRIBUTOS DA SUPER CLASSE
		this.diaRendimento=diaRendimento; //USANDO ATRIBUTOS DA SUBCLASSE
	}
	
	//MÉTODOS
	public void atualizarRendimentoMensal(float percentual) {
		double remuneracao=0;
		remuneracao=saldo*(percentual/100);
		saldo+=remuneracao;
		System.out.println();
		System.out.println("Conta Poupança");
		System.out.printf("Sua remuneração foi de R$: %.2f\n",remuneracao);
		System.out.printf("Saldo atual R$:%.2f",saldo);
	}
}
