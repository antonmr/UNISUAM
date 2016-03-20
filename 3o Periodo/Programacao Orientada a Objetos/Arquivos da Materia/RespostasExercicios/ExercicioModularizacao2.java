import java.util.Scanner;

class ExercicioModularizacao2 {
    static void massa(float peso, float altura) {
        float imc;

        imc = peso / (altura * altura);
        if(imc < 20)
            System.out.println("abaixo do peso");
        else
            if(imc >= 22 && imc <= 25)
                System.out.println("peso normal");
            else
                System.out.println("acima do peso");
    }

    public static void main(String[] args) {
        Scanner s;
        float valPeso, valAltura;

        s = new Scanner(System.in);
        System.out.print("Digite o peso e a altura: ");
        valPeso = s.nextFloat();
        valAltura = s.nextFloat();
        massa(valPeso, valAltura);

    }
}
