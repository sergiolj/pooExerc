package contaBancaria;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria{
	double limiteCredito;
	
	public ContaEspecial(String nomeCliente,int numConta, double limiteCredito) {
		super(nomeCliente,numConta);
		this.limiteCredito=limiteCredito;
	}
	public void definirLimite(Scanner sc) {
		System.out.println("Informe o novo limite da Conta Especial R$: ");
		this.limiteCredito=sc.nextDouble();
	}
	public void sacar(Scanner sc) throws IllegalArgumentException  {
		int saque;
		double saldoComLimite= this.saldo+limiteCredito;
		System.out.printf("Seu saldo C/C R$:%.2f",this.saldo);
		System.out.printf("\nLimite C/E R$ :%.2f",limiteCredito);
		System.out.printf("\nDisponível R$ :%.2f\n",saldoComLimite);
		System.out.print("Qual o valor deseja sacar? R$: ");
		saque=sc.nextInt();
			if(saque<=saldoComLimite) {
				saldo-=saque;
				System.out.println("Aguarde a contagem das cédulas...");
				System.out.printf("Saldo atual: R$: %.2f\n",this.saldo);
			}else {
				throw new IllegalArgumentException("******************\nSALDO INSUFICIENTE\n******************\n");
			}
	}
}

