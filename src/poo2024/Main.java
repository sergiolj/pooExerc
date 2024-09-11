package poo2024;

public class Main {
	int x=5;
	final int y=3;// A opção final é um MODIFICADOR que impede que as instâncias modifiquem o valor do campo
	//Essa opção é exibida no ícone do atributo e a tentativa de mudança gera codigo de erro
	public void myMethodPublic() {
		System.out.println("Hello World - Public Method");
		//Precisa que um objeto ou instância da Classe seja criada para ser chamado
	}
	static void myMethodStatic() {
		System.out.println("Hello World - Static Version");
		//Não precisa que um objeto da Classe seja criado para que esse método seja chamado
	}
}
