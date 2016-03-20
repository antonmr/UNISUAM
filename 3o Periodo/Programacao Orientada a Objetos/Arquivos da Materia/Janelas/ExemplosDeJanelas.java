import javax.swing.JOptionPane;

public class ExemplosDeJanelas
{
   public static void main( String args[] )
   {
      String resposta;
      int vali;
      float valf;
      double vald;

      resposta = JOptionPane.showInputDialog("Digite um inteiro:");
      vali = Integer.parseInt(resposta);
      JOptionPane.showMessageDialog(null, "Você digitou " + vali);
      resposta = JOptionPane.showInputDialog("Digite um real:");
      valf = Float.parseFloat(resposta);
      JOptionPane.showMessageDialog(null, "Você digitou " + valf);
      resposta = JOptionPane.showInputDialog("Digite um real:");
      vald = Double.parseDouble(resposta);
      JOptionPane.showMessageDialog(null, "Você digitou " + vald);
      JOptionPane.showMessageDialog(null, vali + " é um inteiro", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
      JOptionPane.showMessageDialog(null, valf + " é um real", "Mensagem de informação", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, vald + " é um real", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
      JOptionPane.showMessageDialog(null, "Este é o fim?", "Mensagem de questão", JOptionPane.QUESTION_MESSAGE);
   }
}
