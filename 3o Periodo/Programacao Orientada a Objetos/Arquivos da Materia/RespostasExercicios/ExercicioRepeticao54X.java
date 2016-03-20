import java.util.Scanner;

class ExercicioRepeticao54X {
    public static void main(String[] args) {
        Scanner s;
        double valor, x, termo;
        int i;

        s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        x = s.nextDouble();
        valor = 0;
        termo = 1.0;
        i = 1;
        while(i <= 40)
        {
            valor = valor + termo;
            termo = termo * x / i;
            i = i + 1;
        }
	System.out.println("e elevado a " + x + " é " + valor);
    }
}
