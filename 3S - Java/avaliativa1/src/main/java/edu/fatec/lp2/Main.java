package edu.fatec.lp2;

import edu.fatec.lp2.exercicio1.Contato;
import edu.fatec.lp2.exercicio1.Mensagem;
import edu.fatec.lp2.exercicio1.MsgTexto;

public class Main {
    public static void main(String[] args) {
        MsgTexto msgTexto = new MsgTexto(10, new Contato("Matui", "99999999"), "4:20", "Vamo Ali?");


        Mensagem msg = msgTexto.sendMessage("Posso Passar aqui que nao assumira o texto");

        System.out.println("msg: " + msg);
    }
}