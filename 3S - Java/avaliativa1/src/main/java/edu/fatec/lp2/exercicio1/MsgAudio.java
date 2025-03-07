package edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem{
    private int duracao;

    public MsgAudio(int duracao, Contato destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String mensagem){
        System.out.println("Mensagem enviada: " + mensagem);
        System.out.println("this.toString(): " + this.toString());
        return this;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    
}
