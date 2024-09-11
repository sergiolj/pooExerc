package abstraction;

class Pig extends Animal{
	public void animalSound() {// O CORPO DO MÉTODO ABSTRATO É EXECUTADO A PARTIR DO METODO DA SUBCLASSE 
		System.out.println("The pigs says: wee!! wee!");
	}
}