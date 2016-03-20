import javax.swing.JOptionPane;

class Invoice {
    private int numItem, quantidade;
    private String descricao;
    private double preco;

    Invoice(int n, int q, String d, double p) {
        numItem = n;
        quantidade = q;
        descricao = d;
        preco = p;
    }

    int getNumItem() {
        return numItem;
    }

    int getQuantidade() {
        return quantidade;
    }

    String getDescricao() {
        return descricao;
    }

    double getPreco() {
        return preco;
    }

    void setNumItem(int n) {
        numItem = n;
    }

    void setQuantidade(int q) {
        quantidade = q;
    }

    void setDescricao(String d) {
        descricao = d;
    }

    void setPreco(double p) {
        preco = p;
    }

    double getInvoiceAmount() {
        double valor;

        valor = quantidade * preco;
        if(valor < 0)
            valor = 0.0;
        if(preco < 0)
            preco = 0.0;
        return valor;
    }
}

class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv;
        String resposta;
        double novoPreco;

        inv = new Invoice(10004, 24, "Pepino", 0.0);
        resposta = JOptionPane.showInputDialog("Digite um preço");
        novoPreco = Double.parseDouble(resposta);
        inv.setPreco(novoPreco);
        JOptionPane.showMessageDialog(null,
                "Invoice Amount = " + inv.getInvoiceAmount());
    }
}
