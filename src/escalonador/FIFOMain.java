package escalonador;

import java.util.Scanner;

public class FIFOMain { // First In First Out fila de processos

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		float tempoEsperaSoma=0f;
		float tempoSaidaSoma=0f;
		do {
			System.out.print("Informe o total de processos: ");
			n=input.nextInt();
		}while (n<=0);
		int [] nroProcesso=new int[n];
		int [] tempoInicio=new int[n];
		int [] tempoExecucao=new int [n];
		int [] tempoSaida=new int[n];
		int [] tempoEspera=new int[n];
		for (int i=0;i<n;i++) {
			nroProcesso[i]=i+1;
			System.out.print("Tempo de Início"+" P"+nroProcesso[i]+": ");
			tempoInicio[i]=input.nextInt();
			System.out.print("Tempo de Execução"+" P"+nroProcesso[i]+": ");
			tempoExecucao[i]=input.nextInt();
		}
		input.close();
	tempoEsperaSoma=calculaTempoEspera(nroProcesso,tempoInicio,tempoExecucao,tempoEspera);
	tempoSaidaSoma=calculaTempoSaida(nroProcesso,tempoExecucao, tempoEspera,tempoSaida);
	mostra(nroProcesso,tempoInicio, tempoExecucao, tempoEspera, tempoSaida, tempoEsperaSoma, tempoSaidaSoma);
	
	}
	public static void mostra(int [] nroProcesso, int [] tempoInicio, int [] tempoExecucao, int []tempoEspera, int []tempoSaida, float tempoEsperaSoma, float tempoSaidaSoma ) {
		System.out.println("Processo - Início - Execução - Espera - Saída");
		for (int i=0; i<nroProcesso.length;i++) {
			System.out.print("   ["+nroProcesso[i]+"]");
			System.out.print("       ["+tempoInicio[i]+"]");
			System.out.print("      ["+tempoExecucao[i]+"]");
			System.out.print("       ["+tempoEspera[i]+"]");
			System.out.println("     ["+tempoSaida[i]+"]");
		}
		System.out.println();
		System.out.println("Tempo Médio Espera: "+tempoEsperaSoma/nroProcesso.length);
		System.out.println("Tempo Médio Saída: "+tempoSaidaSoma/nroProcesso.length);
	}
	public static float calculaTempoEspera(int [] nroProcesso, int [] tempoInicio, int [] tempoExecucao, int [] tempoEspera) {
		float tempoEsperaSoma=0f;
		int tempoReal=0;

		for (int i=0;i<nroProcesso.length;i++) {
				tempoEspera[i]=tempoReal-tempoInicio[i];
				tempoReal+=tempoExecucao[i];
				tempoEsperaSoma+=tempoEspera[i];
		}
		return tempoEsperaSoma;
	}
	public static float calculaTempoSaida(int [] nroProcesso, int [] tempoExecucao, int [] tempoEspera, int [] tempoSaida) {
		int tempoSaidaSoma=0;
		for (int i=0;i<nroProcesso.length;i++) {
				tempoSaida[i]=tempoExecucao[i]+tempoEspera[i];
				tempoSaidaSoma+=tempoSaida[i];
		}
		return tempoSaidaSoma;
	}
}

