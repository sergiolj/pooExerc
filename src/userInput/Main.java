package userInput;

import java.util.Iterator;
import java.util.Scanner; //Ctrl+Shift+O para importar a classe

public class Main extends User {

	public static void main(String[] args) {
		User usuario1 = new User();
		Scanner input=new Scanner(System.in);
		System.out.print("Insira seu usuário: ");
		usuario1.userName= input.nextLine();
		System.out.print("Informe a idade: ");
		usuario1.age=input.nextInt();
		System.out.print("Informe seu salário esperado: ");
		usuario1.salary=input.nextDouble();
		usuario1.userDescricao();
// ShortCut para comentário de linha Ctrl+/	
// ShortCut para bloco de comentários: seleciona o bloco e Ctrl+Shift+/		
	}
}