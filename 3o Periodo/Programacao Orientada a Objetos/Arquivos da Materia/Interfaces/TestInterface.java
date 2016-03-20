interface Lista {
    void botar(float val);
    float tirar();
}

interface Rotulado {
    void mudarNome(String n);
}

class Pilha implements Lista, Rotulado {
    private int posLivre;
    private float[] vetor;
    private String nome;

    Pilha() {
        posLivre = 0;
        vetor = new float[10];
        nome = "Pilha sem nome";
    }

    public void botar(float val)
    {
        vetor[posLivre] = val;
        posLivre++;
    }

    public float tirar()
    {
        posLivre--;
        return(vetor[posLivre]);
    }

    void mostrar()
    {
        int i;

        System.out.print(nome + " = [");
        for(i = 0; i < posLivre; i++)
            System.out.print(" " + vetor[i]);
        System.out.println(" ]");
    }

    public void mudarNome(String n)
    {
        nome = n;
    }
}

class Fila implements Lista {
    private int posIni, posFin;
    private float[] vetor;

    Fila()
    {
        posIni = posFin = 0;
        vetor = new float[10];
    }

    public void botar(float val)
    {
        vetor[posFin] = val;
        posFin++;
    }

    public float tirar()
    {
        float val;

        val = vetor[posIni];
        posIni++;
        return(val);
    }

    void mostrar()
    {
        int i;

        System.out.print("Fila = [");
        for(i = posIni; i < posFin; i++)
            System.out.print(" " + vetor[i]);
        System.out.println(" ]");
    }
}

class TestInterface {
    public static void main(String[] args) {
        Pilha pi;
        Fila fi;

        pi = new Pilha();
        pi.mostrar();
        pi.botar(7.1f);
        pi.mudarNome("Pilhinha");
        pi.mostrar();
        pi.botar(3.2f);
        pi.mostrar();
        System.out.println("Tirei o valor " + pi.tirar());
        pi.mostrar();
        fi = new Fila();
        fi.mostrar();
        fi.botar(7.1f);
        fi.mostrar();
        fi.botar(3.2f);
        fi.mostrar();
        System.out.println("Tirei o valor " + fi.tirar());
        fi.mostrar();
    }
}