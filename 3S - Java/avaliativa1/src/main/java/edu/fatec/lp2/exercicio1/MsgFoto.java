package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(int tamanho, Contato destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String mensagem){
        System.out.println("Mensagem enviada: " + mensagem);
        System.out.println("this.toString(): " + this.toString());
        return this;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    
}
