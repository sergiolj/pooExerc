package poo2024;

public class Computador { //OUTER CLASSE COMPUTADOR
	double preco;
		class Processador{ // INNER CLASSE PROCESSADOR
		int cores;
		String fabricante;
		int cacheL1;
		public Processador() {} // CONSTRUTOR PADRAO
		public Processador(String fabricante, int cores, int cacheL1) { //CONSTRUTOR CUSTOMIZADO DA INNER CLASSE PROCESSADOR
			this.fabricante=fabricante;
			this.cores=cores;
			this.cacheL1=cacheL1;
		}
		public void descricao() { //MÉTODO DE DESCRIÇÃO DA INNER CLASSE PROCESSADOR DE COMPUTADOR
			System.out.print(this.fabricante+"/");
			System.out.print(this.cores+"/");
			System.out.print(this.cacheL1+"/");
		}
		}
		protected class RAM{ //INNER CLASSE PROTEGIDA RAM
			int capacidade;
			String fabricante;
			int unidades;
			double getVelocidadeClock() {
				return 5.3;
			}
			int getCapacidade() {
				return this.capacidade;
			}
			public void descricao() { // MÉTODO DE DESCRIÇÃO DA INNER CLASSE RAM DE COMPUTADOR
				System.out.println(this.fabricante);
				System.out.println(this.capacidade);
				System.out.println(this.unidades);
				System.out.println(this.getVelocidadeClock());
			}
		}
		public void descricao() {

		}
		
		//CONTRUTOR
		public Computador() {}
		
		/*
		 * public Computador(String CPUfabricante,int nroCores) {
				class.=nroCores;
			}
		 */
		
		public static void main(String[] args) {
				Computador pcGamer = new Computador();//CRIA O MEU PCGAMER DA CLASSE COMPUTADOR
				Computador.Processador meuRyzen5 = pcGamer.new Processador();//CRIA O PROCESSADOR ANTIGO DO MEU PCGAMER COM CONSTRUTOR PADRAO
				Computador.Processador meuRyzen9 = pcGamer.new Processador("AMD",16,2048);
				Computador.RAM minhaRAM = pcGamer.new RAM();
				pcGamer.preco=10000;
				meuRyzen9.cores=12;
				minhaRAM.capacidade=32;
				System.out.println("Custo do computador R$: "+pcGamer.preco);
				System.out.println("Processador de "+meuRyzen9.cores+" núcleos");
				System.out.println("Memória RAM: "+minhaRAM.getCapacidade()+"Gb");
				System.out.println("  ");
				minhaRAM.descricao();
				System.out.print("Meu Ryzen 5: ");
				meuRyzen5.descricao();
				System.out.println("");
				System.out.print("Meu Ryzen 9: ");
				meuRyzen9.descricao();
		}
}