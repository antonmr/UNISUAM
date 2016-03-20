import javax.swing.JOptionPane;

class JanelaRepeticao1 {
    public static void main(String[] args) {
        int num;

        num = 0;
        while(num <= 50)
        {
            JOptionPane.showMessageDialog(null, num);
            num = num + 1;
        }
    }
}
