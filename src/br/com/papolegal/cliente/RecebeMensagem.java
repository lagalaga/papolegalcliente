package br.com.papolegal.cliente;

import br.com.papolegal.model.Conversa;
import br.com.papolegal.xml.SalvaConversaEmTxt;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

public class RecebeMensagem implements Runnable {

    private Socket socket;
    private Conversa conversa;

    public RecebeMensagem(Socket socket){
        this.socket = socket;
        this.conversa = new Conversa();

    }

    @Override
    public void run() {


        try {

            Scanner tecladoDaOutraPessoa = new Scanner(socket.getInputStream());

            while (tecladoDaOutraPessoa.hasNextLine()){

                String mensagem = tecladoDaOutraPessoa.nextLine();
                System.out.println(mensagem);


            }



            tecladoDaOutraPessoa.close();
            socket.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
