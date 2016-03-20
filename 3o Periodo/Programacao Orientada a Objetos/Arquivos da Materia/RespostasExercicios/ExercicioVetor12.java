import java.util.Scanner;

class ExercicioVetor12 {
    public static void main(String[] args) {
        Scanner s;
        double[] vet;
        int i;
        double val;

        s = new Scanner(System.in);
        vet = new double[10];
        for(i = 0; i < vet.length; i++)
        {
            System.out.print("Digite um real: ");
            val = s.nextDouble();
            vet[i] = val * val;
        }
        System.out.print("vet = { ");
        for(i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
        System.out.println("}");
    }
}