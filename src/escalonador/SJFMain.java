package escalonador;

import java.util.Scanner;

public class SJFMain { //Shortest Job First

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
			ordenaProcessos(nroProcesso,tempoInicio, tempoExecucao);
			tempoEsperaSoma=calculaTempoEspera(nroProcesso, tempoInicio, tempoExecucao, tempoEspera);
			tempoSaidaSoma=calculaTempoSaida(nroProcesso,tempoExecucao,tempoEspera,tempoSaida);
			mostra(nroProcesso,tempoInicio, tempoExecucao, tempoEspera, tempoSaida, tempoEsperaSoma, tempoSaidaSoma);

		}
		private static void ordenaProcessos(int[] nroProcesso, int[] tempoInicio, int[] tempoExecucao) {
			int temp;
			int j=1;
			for(int i=0;i<nroProcesso.length-1;i++) {
					if (tempoExecucao[j]<tempoExecucao[i]){
						temp=tempoExecucao[i];
						tempoExecucao[i]=tempoExecucao[j];
						tempoExecucao[j]=temp;
						temp=nroProcesso[i];
						nroProcesso[i]=nroProcesso[j];
						nroProcesso[j]=temp;
						temp=tempoInicio[i];
						tempoInicio[i]=tempoInicio[j];
						tempoInicio[j]=temp;
						i=0;
						j=1;
						}else{
							j++;
						}
				}
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
		public static void mostra(int [] nroProcesso, int [] tempoInicio, int [] tempoExecucao, int []tempoEspera, int []tempoSaida, float tempoEsperaSoma, float tempoSaidaSoma ) {
			System.out.println("idproc  início  execução  espera  saída");
			for (int i=0; i<nroProcesso.length;i++) {
				System.out.print("["+nroProcesso[i]+"]\t"+"["+tempoInicio[i]+"]\t"+"["+tempoExecucao[i]+"]\t"+"  "+"["+tempoEspera[i]+"]\t"+"  "+"["+tempoSaida[i]+"]");
				System.out.println();
			}
			System.out.println();
			System.out.println("Tempo Médio Espera: "+tempoEsperaSoma/nroProcesso.length);
			System.out.println("Tempo Médio Saída: "+tempoSaidaSoma/nroProcesso.length);
		}
}
