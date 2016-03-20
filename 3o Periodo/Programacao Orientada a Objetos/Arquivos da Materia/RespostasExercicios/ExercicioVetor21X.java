import java.util.Scanner;

class ExercicioVetor21X {
    public static void main(String[] args) {
        Scanner s;
        double[] temperatura;
        double soma, media, menor, maior;
        int i, cont;

        s = new Scanner(System.in);
        temperatura = new double[121];
        for(i = 0; i < temperatura.length; i++)
        {
            System.out.print("Digite uma temperatura: ");
            temperatura[i] = s.nextDouble();
        }
        soma = 0.0;
        for(i = 0; i < temperatura.length; i++)
            soma = soma + temperatura[i];
        media = soma / temperatura.length;
        System.out.println("A média é " + media);
        menor = temperatura[0];
        for(i = 1; i < temperatura.length; i++)
            if(temperatura[i] < menor)
                menor = temperatura[i];
        System.out.println("A menor é " + menor);
        maior = temperatura[0];
        for(i = 1; i < temperatura.length; i++)
            if(temperatura[i] > maior)
                maior = temperatura[i];
        System.out.println("A maior é " + maior);
        cont = 0;
        for(i = 0; i < temperatura.length; i++)
            if(temperatura[i] < media)
                cont++;
        System.out.println("Existem " + cont +
                " temperaturas inferiores à média");
    }
}
