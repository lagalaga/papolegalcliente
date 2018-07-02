package br.com.papolegal.model;

import java.util.ArrayList;
import java.util.List;

public class Conversa {

    private List<Mensagem> mensagens;

    public Conversa() {
        this.mensagens = new ArrayList<>();
    }

    public void adicionarMensagem(Mensagem mensagem){
        this.mensagens.add(mensagem);
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }
}
