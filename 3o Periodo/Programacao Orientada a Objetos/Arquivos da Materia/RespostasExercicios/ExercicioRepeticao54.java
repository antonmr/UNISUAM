import java.util.Scanner;

class ExercicioRepeticao54 {
    public static void main(String[] args) {
        Scanner s;
        double valor, x, numerador;
        int denominador, i;

        s = new Scanner(System.in);
	System.out.print("Digite um número: ");
	x = s.nextDouble();
        valor = 0;
        numerador = 1;
        denominador = 1;
        i = 1;
        while(i <= 15)
        {
            valor = valor + numerador / denominador;
            numerador = numerador * x;
            denominador = denominador * i;
            i = i + 1;
        }
	System.out.print("e elevado a " + x + " é " + valor);
    }
}
