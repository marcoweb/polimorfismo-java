package application.models;

public class PessoaFisica extends ContribuinteRF {

    @Override
    public void setRegistroRF(String registroRF) {
        // Executa a validação do CPF antes de atribuir o valor (TODO)
        this.registroRF = registroRF;
    }
    
}
