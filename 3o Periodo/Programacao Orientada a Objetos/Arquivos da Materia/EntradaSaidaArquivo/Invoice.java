import java.io.*;

class Invoice implements Serializable {
    private int numero, quantidade;
    private String descricao;
    private float preco;

    Invoice(int n, String d, int q, float p) {
        numero = n;
        descricao = d;
        quantidade = q;
        preco = p;
    }

    int getNumero() {
        return numero;
    }

    void setNumero(int n) {
        numero = n;
    }

    String getDescricao() {
        return descricao;
    }

    void setDescricao(String d) {
        descricao = d;
    }

    int getQuantidade() {
        return quantidade;
    }

    void setQuantidade(int q) {
        quantidade = q;
    }

    float getPreco() {
        return preco;
    }

    void setPreco(float p) {
        preco = p;
    }

    double getInvoiceAmount() {
        return quantidade * preco;
    }
}
