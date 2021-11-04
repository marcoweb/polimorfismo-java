package application.models;

public class PessoaJuridica extends ContribuinteRF {

    @Override
    public void setRegistroRF(String registroRF) {
        // Executa a validação do CNPJ antes de atribuir o valor
        this.registroRF = registroRF;
    }
    
}
