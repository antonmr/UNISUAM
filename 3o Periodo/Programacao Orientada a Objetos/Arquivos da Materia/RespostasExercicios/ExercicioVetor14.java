import java.util.Scanner;

class ExercicioVetor14 {
    public static void main(String[] args) {
        Scanner s;
        double[] vet;
        int i;
        double val;

        s = new Scanner(System.in);
        vet = new double[15];
        for(i = 0; i < vet.length; i++)
        {
            System.out.print("Digite um real: ");
            val = s.nextDouble();
            if(val < 0)
                vet[i] = -1;
            else
                vet[i] = Math.sqrt(val);
        }
        System.out.print("vet = { ");
        for(i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
        System.out.println("}");
    }
}