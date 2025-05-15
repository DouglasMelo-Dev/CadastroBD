package cadastrobd.model;

public class Pessoa {
    protected int id;
    protected String nome, logradouro, cidade, estado, telefone, email;

    public Pessoa() {}

    public Pessoa(int id, String nome, String logradouro, String cidade, String estado, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibir() {
        System.out.println("ID: " + id + ", Nome: " + nome);
    }
}