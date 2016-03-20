import java.util.Scanner;

class ExercicioModularizacao5 {
    static float conversor2(float dolar) {
        float real;

        real = 1.62f * dolar;
        return real;
    }

    public static void main(String[] args) {
        Scanner s;
        float valorReal, valorDolar;

        s = new Scanner(System.in);
        System.out.print("Digite um valor em dólares: ");
        valorDolar = s.nextFloat();
        valorReal = conversor2(valorDolar);
        System.out.print("O valor em reais é " + valorReal);
    }
}

