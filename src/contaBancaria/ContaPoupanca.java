package contaBancaria;

public class ContaPoupanca extends ContaBancaria {
	int diaRendimento;
	float percentual=0f; 
	
	public ContaPoupanca(String nomeCliente, int numConta,double saldo) {
		super(nomeCliente,numConta,saldo);
	}
	public void depositaRendimentoMensal(float percentual) {
		double remuneracao=0;
		remuneracao=saldo*(percentual/100);
		saldo+=remuneracao;
		System.out.println();
		System.out.println("Conta Poupança");
		System.out.printf("Sua remuneração foi de R$: %.2f\n",remuneracao);
		System.out.printf("Saldo atual R$:%.2f",saldo);
	}
}
