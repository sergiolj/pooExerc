package lojaProdutos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loja {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		menu(teclado);
		teclado.close();

	}
	
	private static void menu(Scanner teclado) throws InputMismatchException {
		int opcao=0;
		boolean executar=true;
			do {
				System.out.println("Escolha uma opção: \n[1] Cadastrar Produto\n[2] Atualizar Produto\n[3] Apagar Produto\n[0] Sair");
				// Tipos de dados inválidos serão tratados pelo catch
				try {
					opcao=teclado.nextInt();	
					// Dados de tipo VÁLIDO, mas sem opções no menu são tratados pelo if
					if(opcao>=0 && opcao<=3) {
						switch (opcao) {
						case 0:
							System.out.println("Tenha um bom dia!!");
							executar=false;
							break;
						case 1:
							System.out.println("Cadastrar");
							break;
						case 2:
							System.out.println("Atualizar");
							break;
						case 3:
							System.out.println("Apagar");
							break;
						}
					}else {                                  
						System.out.println("Opção inválida");;
					}
					// Dados de tipos INVÁLIDOS para evitar crash de execução
				}catch (InputMismatchException e) {  
					System.out.println("Tipo dado inválido");
					// Essa instrução descarta o input de teclado que não pode ser gravado na variável
					//Sem essa linha o try catch entra em loop infinito
					teclado.next();  
				}
			}while (executar);
	}
}