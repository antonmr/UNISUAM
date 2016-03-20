import java.util.Scanner;

class ExercicioModularizacao4 {
    static float conversor1(float real) {
        float dolar;

        dolar = real / 1.62f;
        return dolar;
    }

    public static void main(String[] args) {
        Scanner s;
        float valorReal, valorDolar;

        s = new Scanner(System.in);
        System.out.print("Digite um valor em reais: ");
        valorReal = s.nextFloat();
        valorDolar = conversor1(valorReal);
        System.out.print("O valor em dólares é " + valorDolar);
    }
}
