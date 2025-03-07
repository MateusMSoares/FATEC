package edu.fatec.lp2.exercicio1;

public class Contato {
    private String nome;
    private String celular;

    public Contato(String nome, String celular) {
        this.nome = nome;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", celular=" + celular + "]";
    }

    

}
