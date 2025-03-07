package edu.fatec.lp2.exercicio1;

import java.util.List;

public class Whatsapp {
    private List<Contato> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp(List<Contato> contatos, List<Mensagem> mensagens) {
        this.contatos = contatos;
        this.mensagens = mensagens;
    }


    public void listarContatos(){
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public void listarMensagens(){
        for (Mensagem mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }


}
