package exercicios;

public class Exemplo {

    private String status;

    // Conjunto de valores permitidos
    private static final String[] VALORES_PERMITIDOS = {"Ativo", "Inativo", "Pendente"};

    // Método set para o atributo status
    public void setStatus(String status) throws IllegalArgumentException {
        if (isValorPermitido(status)) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Valor inválido. Use apenas: Ativo, Inativo, ou Pendente.");
        }
    }

    // Verifica se o valor é permitido
    private boolean isValorPermitido(String valor) {
        for (String permitido : VALORES_PERMITIDOS) {
            if (permitido.equals(valor)) {
                return true;
            }
        }
        return false;
    }

    // Método get para acessar o valor do status
    public String getStatus() {
        return this.status;
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        try {
            exemplo.setStatus("Ativo");  // Valor permitido
            System.out.println("Status: " + exemplo.getStatus());

            exemplo.setStatus("Finalizado");  // Valor não permitido, vai lançar exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(exemplo.getStatus());
    }
}
