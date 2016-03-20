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

class Pilha implements Serializable {
    private Nodo topo;
    
    Pilha() {
        topo = null;
    }
    
    void inserir(Cliente cli) {
        topo = new Nodo(cli, topo);
    }
    
    Cliente remover() {
        Cliente cli;
        
        if(topo == null)
            return null;
        else
        {
            cli = topo.getInfo();
            topo = topo.getElo();
            return cli;
        }
    }
    
    boolean vazia() {
        if(topo == null)
            return true;
        else
            return false;
    }
}
