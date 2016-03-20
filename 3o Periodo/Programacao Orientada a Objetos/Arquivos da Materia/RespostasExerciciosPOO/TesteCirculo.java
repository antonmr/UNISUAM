import javax.swing.JOptionPane;

class Ponto {
    private int x, y;

    Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }
}

class Circulo {
    private int raio;
    private Ponto origem;

    Circulo(Ponto ori, int rai) {
        origem = ori;
        raio = rai;
    }

    Circulo(int rai, int coordx, int coordy) {
        raio = rai;
        origem = new Ponto(coordx, coordy);
    }

    void setRaio(int rai) {
        raio = rai;
    }

    double getArea(){
        return 3.14 * raio * raio;
    }

    double getCircunferencia() {
        return 6.28 * raio;
    }
}

class TesteCirculo {
    public static void main(String[] args) {
        Circulo circ;
        String resposta;
        int novoRaio;

        circ = new Circulo(new Ponto(3, 2) , 10);
//        circ = new Circulo(10, 3, 2);
        resposta = JOptionPane.showInputDialog("Digite um raio");
        novoRaio = Integer.parseInt(resposta);
        circ.setRaio(novoRaio);
        JOptionPane.showMessageDialog(null,
                "Area = " + circ.getArea() +
                "\nCircunferencia = " +
                circ.getCircunferencia());
    }
}
