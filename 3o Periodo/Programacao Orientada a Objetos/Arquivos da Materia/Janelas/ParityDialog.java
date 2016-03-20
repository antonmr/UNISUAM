import javax.swing.JOptionPane;

public class ParityDialog
{
   public static void main( String args[] )
   {
      String resposta;
      int val;

      do
      {
          resposta = JOptionPane.showInputDialog("Digite um inteiro:");
      } while(resposta == null);
      val = Integer.parseInt(resposta);
      if(val % 2 == 0)
          JOptionPane.showMessageDialog(null, "É par.");
      else
          JOptionPane.showMessageDialog(null, "É ímpar.");
   }
}