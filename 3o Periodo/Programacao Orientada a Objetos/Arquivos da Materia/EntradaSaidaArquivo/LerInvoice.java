import java.io.*;
import javax.swing.JOptionPane;

class LerInvoice {
    public static void main(String[] args) {
        Invoice inv;
        FileInputStream fi;
        ObjectInputStream oi;

        try {
            fi = new FileInputStream("c:\\aulas\\invoice.obj");
            oi = new ObjectInputStream(fi);
            inv = (Invoice) oi.readObject();
            oi.close();
            JOptionPane.showMessageDialog(null,
                    "Número: " + inv.getNumero() +
                    "\nDescrição: " + inv.getDescricao() +
                    "\nQuantidade: " + inv.getQuantidade() +
                    "\nPreço: " + inv.getPreco() +
                    "\nValor da fatura: " + inv.getInvoiceAmount());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro - " + e.toString());
        }
    }
}