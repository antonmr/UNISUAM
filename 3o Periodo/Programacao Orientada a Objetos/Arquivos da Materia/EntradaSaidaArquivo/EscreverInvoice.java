import java.io.*;
import javax.swing.JOptionPane;

class EscreverInvoice {
    public static void main(String[] args) {
        Invoice inv;
        FileOutputStream fo;
        ObjectOutputStream oo;

        inv = new Invoice(322, "3DS", 10, 859.9f);
        try {
            fo = new FileOutputStream("c:\\aulas\\invoice.obj");
            oo = new ObjectOutputStream(fo);
            oo.writeObject(inv);
            oo.close();
            JOptionPane.showMessageDialog(null,
                    "O objeto foi escrito no arquivo");
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro - " + e.toString());
        }
    }
}