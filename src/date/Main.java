package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.anoNasc=1973;
		user1.diaNasc=25;
		user1.mesNasc=9;
		LocalDate dataAtual = LocalDate.now(); //CRIA UM OBJETO PARA ARMAZENAR A DATA ATUAL

		LocalDate dataNasc = LocalDate.of(user1.anoNasc, user1.mesNasc, user1.diaNasc);
		DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("dd-MM-yy");
		DateTimeFormatter formatoPadrao = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		//CRIA UM OBJETO PARA GUARDAR O FORMATO DE DATA QUE SE PRETENDE USAR
		System.out.println("Dia de hoje: "+dataAtual.format(formatoPersonalizado));
		System.out.println("Dia de hoje: "+dataAtual.format(formatoPadrao)); // VINCULA O OBJETO DA DATA COM O OBJETO DE FORMATO DESEJADO
		System.out.println(dataNasc.format(formatoPadrao));
		
	}

}
