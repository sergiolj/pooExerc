package abstraction;

abstract class Animal {
	public abstract void animalSound(); // METODOS ABSTRATOS NÃO POSSUEM CORPO
	/*
	 * //DESTE MODO PODEMOS TER METODOS QUE SÃO IGUAIS PARA AS SUBCLASSES E AINDA UTILIZAR UMA MESMA NOMENCLATURA
		//DE MÉTODO PARA METODOS ESPECÍFICOS DE CADA SUBCLASSE COMO O SOM QUE CADA ANIMAL FAZ
	 */
	public void sleep() { 
		System.out.println("Zzz");
	}
}
