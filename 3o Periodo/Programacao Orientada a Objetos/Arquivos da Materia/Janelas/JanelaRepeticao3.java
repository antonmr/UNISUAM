import javax.swing.JOptionPane;

class JanelaRepeticao3 {
    public static void main(String[] args) {
        int num;

        num = 100;
        while(num >= 1)
        {
            JOptionPane.showMessageDialog(null, num);
            num = num - 1;
        }
    }
}