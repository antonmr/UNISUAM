import javax.swing.JOptionPane;

public class MediaDialog
{
   public static void main( String args[] )
   {
      String resposta;
      double num1, num2, media;

      resposta = JOptionPane.showInputDialog("Digite um real:");
      num1 = Double.parseDouble(resposta);
      resposta = JOptionPane.showInputDialog("Digite outro real:");
      num2 = Double.parseDouble(resposta);
      media = (num1 + num2) / 2;
      JOptionPane.showMessageDialog(null, "A média é " + media);
   }
}