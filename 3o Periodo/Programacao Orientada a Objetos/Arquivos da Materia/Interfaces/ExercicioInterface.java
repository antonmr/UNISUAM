import javax.swing.JOptionPane;

class Creme {
    private float litros;

    Creme() {
        litros = 0.0f;
    }

    Creme(float li) {
        litros = li;
    }

    float getLitros() {
        return litros;
    }

    void setLitros(float li) {
        litros = li;
    }
}

interface Azul {
    int getTom();
    void setTom(int to);
}

interface Rosto {
    boolean getSeco();
    void setSeco(boolean se);
}

class NovoProduto extends Creme implements Azul, Rosto {
    private int tom;
    private boolean seco;

    NovoProduto() {
        setLitros(1.0f);
        tom = 0;
        seco = false;
    }

    NovoProduto(float li, int to, boolean se) {
        setLitros(li);
        tom = to;
        seco = se;
    }

    public int getTom() {
        return tom;
    }

    public void setTom(int to) {
        tom = to;
    }

    public boolean getSeco() {
        return seco;
    }

    public void setSeco(boolean se) {
        seco = se;
    }
}

class ExercicioInterface {
    public static void main(String[] args) {
        NovoProduto np1, np2;

        np1 = new NovoProduto();
        np2 = new NovoProduto(0.5f, 2, true);

        JOptionPane.showMessageDialog(null, 
                "np1:\nlitros = " + np1.getLitros() +
                "\ntom = " + np1.getTom() +
                "\nseco = " + np1.getSeco());
        JOptionPane.showMessageDialog(null,
                "np2:\nlitros = " + np2.getLitros() +
                "\ntom = " + np2.getTom() +
                "\nseco = " + np2.getSeco());
    }
}
