package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem{
    private int numChar;

    public MsgTexto(int numChar, Contato destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;    
    }

    @Override
    public Mensagem sendMessage(String mensagem){
        return this;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }
}
