import javax.swing.JOptionPane;

public class NameDialog
{
   public static void main( String args[] )
   {
      String name;
      
      name = JOptionPane.showInputDialog("What is your name?");

      JOptionPane.showMessageDialog(null, "Welcome, " + name +
              ", to Java Programming!");
   }
}
