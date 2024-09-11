package innerClass;

import java.util.Scanner;

class Carro {
	String modelo; //Nome do modelo
	String marca; //Nome da Montadora
	String tipo; //Hatch, SUV, Sedan, Minivan, Picape, Perua
	String classificacao; //popular ou convencional
	
	public Carro() {} // construtor padrao
	public Carro (String modelo, String marca, String tipo, String classificacao) { //construtor personalizado carro popular
		this.modelo=modelo;
		this.marca=marca;
		this.tipo=tipo;
		this.classificacao=classificacao;
	}
	public void descricao() {
		System.out.println(this.modelo+" "+this.marca+" "+this.tipo+" "+this.classificacao);
	}
	class Motor	{
		String modelo; //Motor em linha, Motor em V, Motor em W, Motor Boxer
		int cilindros; // Quantos cilindros
		int potencia; //Potencia total em cavalo vapor hp/cv
		int cilindradas; //Tamanho do motor em função da Classificação do carro (carro.Classificacao)
	
		public Motor() {}//Construtor padrão
		public Motor(String modeloMotor, int cilindros, int potencia) {
			this.modelo=modeloMotor;
			this.cilindros=cilindros;
			this.potencia=potencia; //cv
			setCilindrada();
		}
			void setCilindrada() {
				Scanner input=new Scanner(System.in);
				if(Carro.this.classificacao.equals("popular")) {
					this.cilindradas=1000;
				}else {
					System.out.println("Informe quantas cilindradas tem o motor: ");
					this.cilindradas=input.nextInt();
				}
			}
			public void descricao() {
				System.out.println("Motor tipo: "+this.modelo+" Cilindros: "+this.cilindros+" Potencia: "+this.potencia+"cv Cilindradas: "+this.cilindradas+"cm³");
			}
	}
	
	
}
