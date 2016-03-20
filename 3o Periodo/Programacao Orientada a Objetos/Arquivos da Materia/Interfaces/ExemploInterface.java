class Videogame {
    private int numJogos;

    Videogame() {
        numJogos = 0;
    }

    Videogame(int numJogos) {
        this.numJogos = numJogos;
    }

    int getNumJogos() {
        return numJogos;
    }

    void setNumJogos(int nj) {
        numJogos = nj;
    }
}

interface BluRayPlayer {
    int getNumDiscos();
    void setNumDiscos(int nd);
}

class PS3 extends Videogame implements BluRayPlayer {
    private int numDiscos;

    PS3() {
        setNumJogos(1);
        numDiscos = 0;
    }

    PS3(int nj, int nd) {
        setNumJogos(nj);
        numDiscos = nd;
    }

    public int getNumDiscos() {
        return numDiscos;
    }

    public void setNumDiscos(int nd) {
        numDiscos = nd;
    }
}

class ExemploInterface {
    public static void main(String[] args) {
        PS3 meu, seu;

        meu = new PS3();
        seu = new PS3(10, 5);
        System.out.println("Meu PS3 tem " +
                meu.getNumJogos() + " jogo.");
        System.out.println("Seu PS3 tem " +
                seu.getNumDiscos() + " discos.");
    }
}
