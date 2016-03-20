import java.io.*;
import javax.swing.JOptionPane;

class LerObjetoDoArquivo {
    public static void main(String[] args) {
        Aluno al;
        FileInputStream fi;
        ObjectInputStream oi;

        try {
            fi = new FileInputStream("c:\\aulas\\aluno.obj");
            oi = new ObjectInputStream(fi);
            al = (Aluno) oi.readObject();
            oi.close();
            JOptionPane.showMessageDialog(null,
                    "Matrícula do aluno: " + al.getMat());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro - " + e.toString());
        }
    }
}
