package application.tests;

import application.models.ContribuinteRF;
import application.models.PessoaFisica;
import application.models.PessoaJuridica;

public class TestPessoas {
    public static void main(String[] args) {
        ContribuinteRF pf = new PessoaFisica();
        ContribuinteRF pj = new PessoaJuridica();

        pf.setRegistroRF("11111111111");
        pj.setRegistroRF("11111111111111");
    }
}