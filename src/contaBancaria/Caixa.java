package contaBancaria;

public class Caixa {

	public static void main(String[] args) {
		ContaBancaria c1=new ContaBancaria("Sérgio Lopes",1,120);
		ContaPoupanca p1=new ContaPoupanca("Sérgio Lopes",1,230);
		try {
			c1.saque();
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		p1.depositaRendimentoMensal(1.55f);
	}

}
