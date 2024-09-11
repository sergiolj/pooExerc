package poo2024;

import java.util.Scanner;

public class Pessoa {
	int idade,diaNasc,mesNasc,anoNasc,aRef;
	String nome;

public Pessoa() {}// CONSTRUTOR PADRÃO
public Pessoa(String n, int dn, int mn, int an) { // METODO CONSTRUTOR PADRONIZADO
		nome=n;
		diaNasc=dn;
		mesNasc=mn;
		anoNasc=an;
	}

	public void calculaIdade(int a) {
		idade=a-anoNasc;
		informaIdade(a);
	}
	public void informaIdade(int aRef) {
		System.out.println("Se vivo, "+nome+" teria "+idade+" anos em "+aRef);
	}
	public void informaNome() {
		System.out.println(nome);
	}
	public void ajustaDataNasc(int d, int m,int a) {
		diaNasc=d;
		mesNasc=m;
		anoNasc=a;
		System.out.println("Data de nascimento ajustada para "+diaNasc+"/"+mesNasc+"/"+anoNasc);
	}
	

}