package enumerations;
//USE ENUMS QUANDO TIVER VALORES QUE NÃO VÃO MUDAR, COMO DIAS, CORES, NAIPES DE CARTAS, ETC.
//ENUMS PODEM SER IMPLEMENTADAS EM OUTRAS CLASSES, MAS NÃO HERDADAS
public enum Level { // QUE TIPO DE VALORES SÃO ESSES? STRING, INT?
	LOW,MEDIUM,HIGH;
	int x=1;
	
	public void metodoEnum() {
		System.out.println("Podem ser implementados métodos em enums");
	}
}
