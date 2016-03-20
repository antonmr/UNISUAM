import javax.swing.JOptionPane;

class CodigoPostal {
    private int indicativo, extensao;
    private String rua;

    CodigoPostal() {
        indicativo = 0;
        extensao = 0;
        rua = "Indisponível";
    }

    CodigoPostal(int i, String r) {
        indicativo = i;
        extensao = 0;
        rua = r;
    }

    CodigoPostal(int i, int e, String r) {
        indicativo = i;
        extensao = e;
        rua = r;
    }

    int getIndicativo() {
        return indicativo;
    }

    int getExtensao() {
        return extensao;
    }

    String getRua() {
        return rua;
    }

    void setIndicativo(int i) {
        indicativo = i;
    }

    void setExtensao(int e) {
        extensao = e;
    }

    void setRua(String r) {
        rua = r;
    }

    void mostra() {
        JOptionPane.showMessageDialog(null,
                "CEP: " + indicativo + " - " +
                extensao + " " + rua);
    }
}

class ProgramaDeTeste {
    public static void main(String[] args) {
        CodigoPostal cp1, cp2, cp3;
        String resposta;
        int i;

        cp1 = new CodigoPostal();
        cp2 = new CodigoPostal(21044, "Rua Jucelino Caetano");
        cp3 = new CodigoPostal(20511, 140, "Rua Major Ávila");
        cp1.mostra();
        cp2.mostra();
        cp3.mostra();
        resposta = JOptionPane.showInputDialog("Digite um inteiro");
        i= Integer.parseInt(resposta);
        cp1.setIndicativo(i);
        cp1.mostra();
        resposta = JOptionPane.showInputDialog("Digite um inteiro");
        i= Integer.parseInt(resposta);
        cp3.setExtensao(i + cp3.getExtensao());
        cp3.mostra();
        resposta = JOptionPane.showInputDialog("Digite uma string");
        cp1.setRua(resposta);
        cp1.mostra();
    }
}
