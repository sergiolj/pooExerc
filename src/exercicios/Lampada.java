package exercicios;

public class Lampada {
	private int tensao;
	private int potencia;
	private String tipo;
	
	// DEFINE UM VETOR DE STRING COM A VALIDACAO DE DADOS
	private static final String[] tipoValidos = {"Fluorescente Compacta","Halógena","Incandescente","LED"};
	public static final int [] tensaoValidos = {127,220};
	
	//CONSTRUTORES
	public Lampada() {}  //PADRAO
	public Lampada(String tipo, int tensao, int potencia) { //PERSONALIZADO
		this.tipo=tipo;
		this.tensao=tensao;
		this.potencia=potencia;
	}
	
	//METODOS GET/SET SEM VALIDACAO
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getTensao() {
		return tensao;
	}
	public void setTensao(int tensao) {
		this.tensao=tensao;
	}
	
	//METODOS GET/SET COM VALIDACAO
	public String getTipo(){
		return tipo;
	}
	
	//SET COM VALIDACAO E MENSAGEM DE ERRO CASO INVALIDO
	public void setTipo(String tipo) throws IllegalArgumentException {
		if (esseValorPermitido(tipo)) {
			this.tipo=tipo;
		}else {
			throw new IllegalArgumentException("VALOR INVÁLIDO!\nValores válidos são: Fluorescente Compacta,Halógena,Incandescente,LED");
		}
	}
	//VERIFICA SE O VALOR É PERMITIDO
	private boolean esseValorPermitido(String tipo) {
		for (String permitido:tipoValidos) { // CRIA UMA STRING PERMITIDO QUE VAI RECEBER OS VALORES DO VETOR TIPOVALIDOS
			if (permitido.equals(tipo)) {
				return true;// SE O VALOR FOR IGUAL À STRING TIPO RETORNA TRUE, SENÃO TESTA O PROXIMO VALOR DO VETOR DE TIPOVALIDOS
			}
		}
		return false;
	}
	
	//METODOS
//	public void cadastrar(String tipo, int tensao, int potencia) {
//		this.tipo=tipo;
//		this.tensao=tensao;
//		this.potencia=potencia;
//	}
	public void listar() {
		for(String i:tipoValidos) {
			System.out.print(i);
		}

//		System.out.println("Tipo: "+tipo);
//		System.out.println("Tensão: "+tensao);
//		System.out.println("Potencia: "+potencia);
	}

}
