package cadastrobd;

import cadastrobd.model.PessoaFisica;
import cadastrobd.model.PessoaJuridica;

public class CadastroBDTeste {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica(1, "Douglas", "Rua A", "Florianópolis", "SC", "99999-9999", "douglas@email.com", "123.456.789-00");
        pf.exibir();

        PessoaJuridica pj = new PessoaJuridica(2, "Empresa XYZ", "Rua B", "Florianópolis", "SC", "88888-8888", "contato@empresa.com", "12.345.678/0001-00");
        pj.exibir();
    }
}