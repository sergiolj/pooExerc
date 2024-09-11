package escalonador;

import java.util.Scanner;

public class SRTFMain {
	public static void main(String[] args) {
		int n=10;
		int posicaoAtual=0; // Tamanho do vetor utilizado
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
		System.out.println("Simulador de Escalonador (SRTF) \nShortest Remaining Time First");
		System.out.println();
		System.out.println("Adiciona Processo ou [-1] Sair: ");
		while(continuar) {
			System.out.print("P["+(posicaoAtual+1)+"] - Tempo início: ");
			entradaUser=input.nextInt();
				if (entradaUser<0) {
					continuar=false;
				}else {
					nroProcesso[posicaoAtual]=posicaoAtual+1;
					tempoInicio[posicaoAtual]=entradaUser;
					System.out.print("P["+(posicaoAtual+1)+"] - Tempo execução: ");
					tempoExecucao[posicaoAtual]=input.nextInt();
					posicaoAtual++; //delimita o limite de espaços usados no vetor
				}
		}
		input.close();
		
		ordenaInicioExecucao(posicaoAtual,nroProcesso,tempoInicio, tempoExecucao);
		calculaEsperaSaida(posicaoAtual, nroProcesso, tempoInicio, tempoExecucao, tempoEspera,tempoSaida);
		//tempoSaidaSoma=calculaTempoSaida(posicaoAtual,nroProcesso,tempoExecucao,tempoEspera,tempoSaida);
		mostra(posicaoAtual,nroProcesso,tempoInicio, tempoExecucao, tempoEspera, tempoSaida, tempoEsperaSoma, tempoSaidaSoma);
		posicaoAtual++;
	}
	//Ordena por início e por tempo de execução sem levar em consideração a preempção
	private static void ordenaInicioExecucao(int posicaoAtual, int[] nroProcesso, int[] tempoInicio, int[] tempoExecucao) {
		int temp;
		for(int i=0;i<posicaoAtual-1;i++) {
			for (int j=i+1;j<posicaoAtual;j++){
				if (tempoInicio[i]>tempoInicio[j]) {
					temp=nroProcesso[i];
					nroProcesso[i]=nroProcesso[j];
					nroProcesso[j]=temp;
					
					temp=tempoInicio[i];
					tempoInicio[i]=tempoInicio[j];
					tempoInicio[j]=temp;
					
					temp=tempoExecucao[i];
					tempoExecucao[i]=tempoExecucao[j];
					tempoExecucao[j]=temp;
				}
			}
		}
		for(int i=0;i<posicaoAtual-1;i++) {
			for (int j=i+1;j<posicaoAtual;j++){
				if ((tempoExecucao[i]>tempoExecucao[j]) && (tempoInicio[i]>=tempoInicio[j])) {
					temp=nroProcesso[i];
					nroProcesso[i]=nroProcesso[j];
					nroProcesso[j]=temp;
					
					temp=tempoInicio[i];
					tempoInicio[i]=tempoInicio[j];
					tempoInicio[j]=temp;
					
					temp=tempoExecucao[i];
					tempoExecucao[i]=tempoExecucao[j];
					tempoExecucao[j]=temp;
				}
			}
		}
	}
	//A lista de processos deve sempre iniciar em 0, supõe-se que só interessa o início dos processos e não o tempo sem uso.
	//Aqui será ajustada a característica da preempção
	public static double calculaEsperaSaida(int posicaoAtual,int [] nroProcesso, int [] tempoInicio, int [] tempoExecucao, int [] tempoEspera, int[]tempoSaida) {
		int [] tempoExecucaoRestante= new int [posicaoAtual];
		for (int i=0;i<posicaoAtual;i++) {
			tempoExecucaoRestante[i]=tempoExecucao[i];
		}
		int tempoReal=0;
		tempoEspera[0]=0;
		//SEMPRE QUE UM PROCESSO APARECER NA LISTA DE PRONTO O ALGORITMO TEM QUE COMPARAR O RESTANTE DO TEMPO DO PROCESSO EM EXECUÇÃO
		//COM O TEMPO DE EXECUÇÃO DO RECEM CHEGADO

		
		for (int i=0;i<nroProcesso.length-1;i++) {
			tempoReal=tempoInicio[i];      //Controla o tempo de execução
			if (i==0) {					   // O primeiro processo
				tempoEspera[i]=0;
			}else {
				tempoExecucaoRestante[i-1]=tempoExecucao[i-1]-tempoInicio[i];
				tempoSaida[i-1]+=tempoInicio[i];
				if (tempoExecucaoRestante[i-1]<=0) {
					if(tempoExecucaoRestante[i-1]>tempoExecucao[i])
					
				}
				
				
				if(tempoExecucao[i-1]<=tempoInicio[i]) { //Espera=0 o processo anterior ja executou.
						tempoEspera[i]=0;
					}if (else {
						tempoExecucaoRestante[i]=0          //Espera=0 o restante de execucaco pro processo anterior é maior do que o tempo de execucao do processo corrente
						tempoEspera[i]+=tempoInicio[i];
				}
			}
		}

		if (tempoExecucao[i]<=tempoInicio[i+1]) {		//Se o tempo de execução do processo for menor que o tempo de início do próximo
				;					//Não há preempção e o tempo de execução restante será de zero
															//tempo de espera também será de zero
			}
			
			}else {
				tempoExecucaoRestante[i]-=tempoInicio[i+1];
				tempoEspera[i]+=tempoExecucao[i+1];
			}
			if(tempoExecucaoRestante[i]>tempoExecucao[i+1]) {
				tempoReal+=tempoInicio[i+1];
		
		
		for (int i=0;i<posicaoAtual+1;i++) {
			for (int j=i+1;j<posicaoAtual;j++){
				if (tempoInicio[i]==tempoInicio[j]) {
					tempoEspera[j]=tempoExecucao[i];		
				}else {
					tempoExecucaoRestante[i]
					
				tempoReal+=tempoInicio[j];	
				if (tempoReal+tempoExecucao[i]<tempoExecucao[j]){ 
						tempoExecucaoRestante[i]-=tempoReal;
					}
				}
				tempoEspera[j]=tempoInicio[j]-tempoReal;
				tempoReal+=tempoInicio[j]; //Incrementa o tempo real com o tempo de inicio do segundo processo
			}
			tempoEsperaSoma+=tempoEspera[i]; //Soma o tempo de espera do processo
		}
		return tempoEsperaSoma;
	}
	
	public static double calculaTempoSaida(int posicaoAtual, int [] nroProcesso, int [] tempoExecucao, int [] tempoEspera, int [] tempoSaida) {
		int tempoSaidaSoma=0;
		for (int i=0;i<posicaoAtual-1;i++) {
				tempoSaida[i]=tempoExecucao[i]+tempoEspera[i];
				tempoSaidaSoma+=tempoSaida[i];
		}
		return tempoSaidaSoma;
	}
	public static void mostra(int posicaoAtual, int [] nroProcesso, int [] tempoInicio, int [] tempoExecucao, int []tempoEspera, int []tempoSaida, double tempoEsperaSoma, double tempoSaidaSoma ) {
		System.out.println("idproc  início  execução  espera  saída");
		for (int i=0; i<posicaoAtual;i++) {
			System.out.print("["+nroProcesso[i]+"]\t"+"["+tempoInicio[i]+"]\t"+"["+tempoExecucao[i]+"]\t"+"  "+"["+tempoEspera[i]+"]\t"+"  "+"["+tempoSaida[i]+"]");
			System.out.println();
		}
		System.out.println();
		System.out.println("Tempo Médio Espera: "+tempoEsperaSoma/nroProcesso.length);
		System.out.println("Tempo Médio Saída: "+tempoSaidaSoma/nroProcesso.length);
		System.out.println();
	}
}
