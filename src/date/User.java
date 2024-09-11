package date;

public class User {
	int age;
	double salary;
	String userName;
	int diaNasc, mesNasc, anoNasc;
	
	public void userDescricao() {
		System.out.println(this.userName);
		System.out.println(this.age);
		System.out.println(this.salary);
	}
}
