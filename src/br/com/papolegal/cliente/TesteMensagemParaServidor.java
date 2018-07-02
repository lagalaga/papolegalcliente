package br.com.papolegal.cliente;

import java.net.Socket;

public class TesteMensagemParaServidor {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 12345);

        Thread tEnviaMensagem = new Thread(new EnviaMensagem(socket));
        Thread tRecebeMensagem = new Thread(new RecebeMensagem(socket));

        tEnviaMensagem.start();
        tRecebeMensagem.start();

        tEnviaMensagem.join();


    }
}
