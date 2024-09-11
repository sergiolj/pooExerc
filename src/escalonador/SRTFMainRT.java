package escalonador;

import java.util.Scanner;

public class SRTFMainRT {
	public static void main(String[] args) {
		int n=10;
		int posicaoAtual=0;
		int entradaUser;
		double tempoEsperaSoma=0;
		double tempoSaidaSoma=0;
		int [] nroProcesso=new int[n];
		int [] tempoInicio=new int[n];
		int [] tempoExecucao=new int [n];
		int [] tempoSaida=new int[n];
		int [] tempoEspera=new int[n];
		Scanner input=new Scanner(System.in);
		boolean continuar=true;
		while(continuar) {
			System.out.println("Simulador de Escalonador (SRTF) \nShortest Remaining Time First");
			System.out.println();
			System.out.println("Adiciona Processo ou [-1] Sair: ");
			System.out.print("P["+(posicaoAtual+1)+"] - Tempo início: ");
			entradaUser=input.nextInt();
				if (entradaUser<0) {
					continuar=false;
				}else {
					nroProcesso[posicaoAtual]=posicaoAtual+1;
					tempoInicio[posicaoAtual]=entradaUser;
					System.out.print("P["+(posicaoAtual+1)+"] - Tempo execução: ");
					tempoExecucao[posicaoAtual]=input.nextInt();
					ordenaProcessos(posicaoAtual,nroProcesso,tempoInicio, tempoExecucao);
					//tempoEsperaSoma=calculaTempoEspera(posicaoAtual, nroProcesso, tempoInicio, tempoExecucao, tempoEspera);
					//tempoSaidaSoma=calculaTempoSaida(posicaoAtual,nroProcesso,tempoExecucao,tempoEspera,tempoSaida);
					mostra(posicaoAtual,nroProcesso,tempoInicio, tempoExecucao, tempoEspera, tempoSaida, tempoEsperaSoma, tempoSaidaSoma);
					posicaoAtual++;
				}
		}
		input.close();
	}
	private static void ordenaProcessos(int posicaoAtual, int[] nroProcesso, int[] tempoInicio, int[] tempoExecucao) {
		int temp;
		for(int i=0;i<posicaoAtual+1;i++) {
			for (int j=i+1;j<posicaoAtual+1;j++){
				if (tempoExecucao[i]>tempoExecucao[j]){
					temp=tempoExecucao[i];
					tempoExecucao[i]=tempoExecucao[j];
					tempoExecucao[j]=temp;
					temp=nroProcesso[i];
					nroProcesso[i]=nroProcesso[j];
					nroProcesso[j]=temp;
					temp=tempoInicio[i];
					tempoInicio[i]=tempoInicio[j];
					tempoInicio[j]=temp;	
				}
			}
		}
	}
	public static double calculaTempoEspera(int posicaoAtual,int [] nroProcesso, int [] tempoInicio, int [] tempoExecucao, int [] tempoEspera) {
		int tempoEsperaSoma=0;
		int tempoReal;
		if (posicaoAtual==0) {
			tempoReal=0;
		}else {
		tempoReal=tempoExecucao[posicaoAtual];
		}
		for (int i=0;i<posicaoAtual+1;i++) {
				tempoEspera[i]=tempoReal-tempoInicio[i];
				tempoReal+=tempoExecucao[i];
				tempoEsperaSoma+=tempoEspera[i];
		}
		return tempoEsperaSoma;
	}
	public static double calculaTempoSaida(int posicaoAtual, int [] nroProcesso, int [] tempoExecucao, int [] tempoEspera, int [] tempoSaida) {
		int tempoSaidaSoma=0;
		for (int i=0;i<posicaoAtual+1;i++) {
				tempoSaida[i]=tempoExecucao[i]+tempoEspera[i];
				tempoSaidaSoma+=tempoSaida[i];
		}
		return tempoSaidaSoma;
	}
	public static void mostra(int posicaoAtual, int [] nroProcesso, int [] tempoInicio, int [] tempoExecucao, int []tempoEspera, int []tempoSaida, double tempoEsperaSoma, double tempoSaidaSoma ) {
		System.out.println("idproc  início  execução  espera  saída");
		for (int i=0; i<posicaoAtual+1;i++) {
			System.out.print("["+nroProcesso[i]+"]\t"+"["+tempoInicio[i]+"]\t"+"["+tempoExecucao[i]+"]\t"+"  "+"["+tempoEspera[i]+"]\t"+"  "+"["+tempoSaida[i]+"]");
			System.out.println();
		}
		System.out.println();
		System.out.println("Tempo Médio Espera: "+tempoEsperaSoma/nroProcesso.length);
		System.out.println("Tempo Médio Saída: "+tempoSaidaSoma/nroProcesso.length);
		System.out.println();
	}
}
