import java.util.Scanner;

class ExercicioModularizacao3 {
    static double hipotenusa(double cateto1, double cateto2) {
        double hipo;

        hipo = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        return hipo;
    }

    public static void main(String[] args) {
        Scanner s;
        double cat1, cat2,resultado;

        s = new Scanner(System.in);
        System.out.print("Digite dois números reais: ");
        cat1 = s.nextDouble();
        cat2 = s.nextDouble();
        resultado = hipotenusa(cat1, cat2);
        System.out.println("O resulatdo é " + resultado);
    }
}
