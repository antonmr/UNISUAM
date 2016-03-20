import javax.swing.JOptionPane;

class JanelaCondicional3 {
    public static void main(String[] argumentos) {
        String resposta;
        int n;

        resposta = JOptionPane.showInputDialog("Digite um inteiro:");
        n = Integer.parseInt(resposta);
        if(n % 2 == 0)
            JOptionPane.showMessageDialog(null, "PAR");
        else
            JOptionPane.showMessageDialog(null, "ÍMPAR");
    }
}