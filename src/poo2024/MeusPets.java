package poo2024;
//EXEMPLO DE POLIMORFISMO

public class MeusPets {

	public static void main(String[] args) {
		Animal meuAnimal = new Animal(); // CRIA UMA INSTANCIA DE ANIMAL 
		Animal meuGato = new Gato(); //CRIA UMA INSTANCIA DE ANIMAL COM REFERENCIA NA CLASSE GATO
		Animal meuCachorro = new Cachorro(); //CRIA UMA INSTANCIA DE ANIMAL COM REF. CLASSE CACHORRO
		meuAnimal.animalSom(); // USA O MÉTODO DA CLASSE ANIMAL
		meuGato.animalSom(); // USA O MÉTODO DA CLASSE GATO 
		meuCachorro.animalSom(); // USA O MÉTODO DA CLASSE CACHORRO
		// AO SELECIONAR O MÉTODO ELE EXIBE APENAS O MÉTODO DA SUPERCLASSE EMBORA EXECUTE 
		//OS MÉTODOS DA SUBCLASSE. 
	}

}
