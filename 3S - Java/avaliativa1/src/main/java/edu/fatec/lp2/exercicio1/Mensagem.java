package edu.fatec.lp2.exercicio1;

public abstract class Mensagem {
    private Contato destinatario;
    private String horaEnvio;
    private String conteudo;

    
    public Mensagem(Contato destinatario, String horaEnvio, String conteudo) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;
    }

    public abstract Mensagem sendMessage(String mensagem);
    
    public Contato getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(Contato destinatario) {
        this.destinatario = destinatario;
    }
    public String getHoraEnvio() {
        return horaEnvio;
    }
    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Mensagem [destinatario=" + destinatario + ", horaEnvio=" + horaEnvio + ", conteudo=" + conteudo + "]";
    }   
}
