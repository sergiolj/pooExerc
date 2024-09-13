package contaBancaria;

import java.util.Scanner;

public class ContaBancaria {
	public String nomeCliente;
	public int numConta;
	double saldo;
	
	//CONSTRUTOR PADRÃO
	public ContaBancaria() {}
	//CONSTRUTOR PERSONALIZADO
	public ContaBancaria(String nomeCliente, int numConta) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = 0;
	}
	//MÉTODOS
	public void sacar(Scanner sc) throws IllegalArgumentException  {
		int saque;
		System.out.println("Seu saldo é de R$: "+this.saldo);
		System.out.println("Qual o valor deseja sacar? R$: ");
		saque=sc.nextInt();
			if(saque<=saldo) {
				saldo-=saque;
				System.out.println("Aguarde a contagem das cédulas...");
				System.out.println("Saldo atual: R$: "+this.saldo);
			}else {
				throw new IllegalArgumentException("Saldo insuficiente");
			}
	}
	
	public void depositar(Scanner sc) {
		double valor;
		System.out.print("Qual o valor a ser depositado? R$:");
		valor=sc.nextDouble();
		this.saldo+=valor;
		System.out.println("Saldo Atual R$: "+this.saldo);
	}

	public void cadastrar() {
		System.out.println("Cliente: "+this.nomeCliente);
		System.out.println("Conta: "+this.numConta);
		System.out.println("Saldo: R$: "+this.saldo);
	}
	public String exibirDadosConta() {
		String s="Conta ["+numConta;
		s+="] Titular ["+nomeCliente;
		s+="] Saldo R$: "+saldo;
		return s;
	}
	
}
