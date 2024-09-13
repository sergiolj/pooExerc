package contaBancaria;

import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		ContaBancaria c1=new ContaBancaria("Sérgio Lopes",1);
		ContaPoupanca p1=new ContaPoupanca("Sérgio Lopes",1,5);
		ContaEspecial c2=new ContaEspecial("Sérgio Lopes", 2, 1000);
		Scanner sc=new Scanner(System.in);
		int menu=1;
		while (menu!=0){
			System.out.println("O que deseja fazer?\n[0] Sair\n[1] Depósito\n[2] Saque\n[3] Exibir\n[4] Limite");
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				c2.depositar(sc);
			break;
			case 2:
				try {
					c2.sacar(sc);
				}catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			break;
			case 3:
				System.out.println(c2.exibirDadosConta());
				break;
			case 4:
				c2.definirLimite(sc);
				break;
			}
		}
		sc.close();
	}
}
