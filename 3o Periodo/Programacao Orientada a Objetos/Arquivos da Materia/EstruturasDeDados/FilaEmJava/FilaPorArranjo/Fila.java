import java.io.*;

class Fila implements Serializable {
    private static int li = 0, ls = 100;
    private int inicio, fim;
    private Cliente[] vetor;

    Fila() {
        inicio = fim = li - 1;
        vetor = new Cliente[ls - li + 1];
    }

    void inserir(Cliente cli) {
        if(inicio == li - 1)
            inicio = fim = li;
        else
            if(fim == ls)
                fim = li;
            else
                fim = fim + 1;
        vetor[fim] = cli;
    }

    Cliente remover() {
        Cliente cli;

        cli = vetor[inicio];
        vetor[inicio] = null;
        if(inicio == fim)
            inicio = fim = li - 1;
        else
            if(inicio == ls)
                inicio = li;
            else
                inicio = inicio + 1;
        return cli;
    }

    boolean vazia() {
        if(inicio == li - 1)
            return true;
        else
            return false;
    }
}