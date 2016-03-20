import javax.swing.JOptionPane;

class JanelaCondicional1 {
    public static void main(String[] argumentos) {
        String resposta;
        int num;

        resposta = JOptionPane.showInputDialog("Digite um número:");
        num = Integer.parseInt(resposta);
        if(num > 20)
            JOptionPane.showMessageDialog(null, "Você digitou " + num);
    }
}