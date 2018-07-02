package br.com.papolegal.cliente;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EnviaMensagem implements Runnable {

    private Socket socket;

    public EnviaMensagem(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        System.out.println("Pronto para enviar mensagens");


        try {
            PrintStream telaDoOutroUsuario = new PrintStream(socket.getOutputStream());
            Scanner meuTeclado = new Scanner(System.in);

            while (meuTeclado.hasNextLine()) {

                String mensagem = meuTeclado.nextLine();
                telaDoOutroUsuario.println(mensagem);
            }

            meuTeclado.close();
            telaDoOutroUsuario.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
