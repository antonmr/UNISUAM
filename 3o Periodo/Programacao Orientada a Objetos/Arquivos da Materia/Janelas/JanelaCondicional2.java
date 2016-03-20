import javax.swing.JOptionPane;

class JanelaCondicional2 {
    public static void main(String[] argumentos) {
        String resposta;
        int num1, num2, soma;

        resposta = JOptionPane.showInputDialog("Digite um número:");
        num1 = Integer.parseInt(resposta);
        resposta = JOptionPane.showInputDialog("Digite um número:");
        num2 = Integer.parseInt(resposta);
        soma = num1 + num2;
        if(soma > 10)
            JOptionPane.showMessageDialog(null, "O resultado é " + soma);
    }
}