package contaBancaria;

import java.util.Scanner;

public class ContaBancaria {
	public String nomeCliente;
	public int numConta;
	double saldo;
	
	//CONSTRUTOR PADRÃO
	public ContaBancaria() {}
	//CONSTRUTOR PERSONALIZADO
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	//MÉTODOS
	public void saque() throws IllegalArgumentException  {
		int saque;
		Scanner sc=new Scanner(System.in);
		System.out.println("Seu saldo é de R$: "+this.saldo);
		System.out.println("Qual o valor deseja sacar? R$: ");
		saque=sc.nextInt();
		sc.close();
			if(saque<=saldo) {
				saldo-=saque;
				System.out.println("Aguarde a contagem das cédulas...");
				System.out.println("Saldo atual: R$: "+this.saldo);
			}else {
				throw new IllegalArgumentException("Saldo insuficiente");
			}
	}
	public void deposito() {
		int deposito;
		Scanner sc=new Scanner(System.in);
		System.out.println("Qual o valor a ser depositado? R$:");
		deposito=sc.nextInt();
		sc.close();
		saldo+=deposito;
		System.out.println("Saldo Atual"+this.saldo);
	}
	public void cadastro() {
		System.out.println("Cliente: "+this.nomeCliente);
		System.out.println("Conta: "+this.numConta);
		System.out.println("Saldo: R$: "+this.saldo);
	}
}
