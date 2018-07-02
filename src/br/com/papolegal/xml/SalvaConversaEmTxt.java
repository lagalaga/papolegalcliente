package br.com.papolegal.xml;

import br.com.papolegal.model.Conversa;
import br.com.papolegal.model.Mensagem;

import java.io.*;

public class SalvaConversaEmTxt {

    public static void salvaConversa(Conversa conversa) {

        try {
            OutputStream arquivo = new FileOutputStream("src/conversa.txt");
            PrintStream saida = new PrintStream(arquivo);
            for (Mensagem mensagem : conversa.getMensagens()) {
                saida.println(mensagem);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
