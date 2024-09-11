package poo2024;

public class Car {
	int x;
	int anoModelo;
	String nomeMontadora;
	
	public void aceleracaoMaxima() {
		System.out.println("O"+"carro anda o mais rápido que consegue");
	}
	public void velocidade(int maxVelocidade) {
		System.out.println("A velocidade máxima é de : "+ maxVelocidade);
	}
	//public Car(){ //Esse é o método CONSTRUTOR. O método serve para inicializar valores padrão para as instãncias
	//	aceleracaoMaxima();
	//	velocidade(120);
	//}
	//public Car(int y) {
	//	x=y;
	//}
	public Car(int ano, String montadora) {
		anoModelo=ano;
		nomeMontadora=montadora;
	}
}
