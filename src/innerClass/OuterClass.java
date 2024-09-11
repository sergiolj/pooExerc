package innerClass;

class OuterClass{
	int x=10;
		class InnerClass{
			int y=5;
		}

	public static void main(String[] args) {
		OuterClass externa1 = new OuterClass();
		OuterClass.InnerClass interna = externa1.new InnerClass(); //A CLASSE INTERNA NECESSITA DE UMA EXTERNA PARA SER CRIADA
		System.out.println(interna.y);
	}
}
