package innerClass;

public class StaticClass {
	class OuterClass{
		int x=10;
		static class InnerClass{ // O MODIFICADOR STATIC DEFINE QUE A CLASSE INTERNA NÃO NECESSITA DE UMA EXTERNA
			int y=5;
		}
	}

	public static void main(String[] args) {
		OuterClass.InnerClass interna = new OuterClass.InnerClass(); //A CLASSE INTERNA PODE SER CRIADA SEM QUE SEJA CRIADA UMA EXTERNA
		System.out.println(interna.y);
	}
}
