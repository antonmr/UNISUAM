import java.io.*;

class Nodo implements Serializable {
    private Cliente info;
    private Nodo elo;

    Nodo(Cliente i, Nodo e) {
        info = i;
        elo = e;
    }

    Cliente getInfo() {
        return info;
    }

    Nodo getElo() {
        return elo;
    }

    void setInfo(Cliente i) {
        info = i;
    }

    void setElo(Nodo e) {
        elo = e;
    }
}

class Fila implements Serializable {
    private Nodo inicio, fim;

    Fila() {
        inicio = fim = null;
    }

    void inserir(Cliente cli) {
        Nodo novo;
        novo = new Nodo(cli, null);
        if(inicio == null)
            inicio = novo;
        else
            fim.setElo(novo);
        fim = novo;
    }

    Cliente remover() {
        Cliente cli;

        if(inicio == null)
            return null;
        else
        {
            cli = inicio.getInfo();
            inicio = inicio.getElo();
            if(inicio == null)
                fim = null;
            return cli;
        }
    }

    boolean vazia() {
        if(inicio == null)
            return true;
        else
            return false;
    }
}