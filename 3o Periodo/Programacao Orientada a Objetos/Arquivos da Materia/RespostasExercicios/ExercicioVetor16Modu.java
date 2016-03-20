import java.util.Scanner;

class ExercicioVetor16Modu {
    static void lerVetor(double[] a) {
        Scanner s;
        int i;

        s = new Scanner(System.in);
        for(i = 0; i < a.length; i++)
        {
            System.out.print("Digite uma altura: ");
            a[i] = s.nextDouble();
        }
    }

    static double calcularMedia(double[] a) {
        int i;
        double soma, media;

        soma = 0.0;
        for(i = 0; i < a.length; i++)
            soma = soma + a[i];
        media = soma / a.length;
        return media;
    }

    static void mostrarVetor(double[] a) {
        int i;
        double media;

        media = calcularMedia(a);
        for(i = 0; i < a.length; i++)
            if(a[i] > media)
                System.out.println(a[i]);
    }

    public static void main(String[] args) {
        double[] altura;

        altura = new double[10];
        lerVetor(altura);
        System.out.println("Alturas maiores que a média:");
        mostrarVetor(altura);
    }
}