import java.util.Scanner;

class ExercicioCondicional21 {
    public static void main(String[] args) {
        Scanner s;
        float peso, altura, imc;

        s = new Scanner(System.in);
        System.out.print("Digite o peso e a altura: ");
        peso = s.nextFloat();
        altura = s.nextFloat();
        imc = peso / (altura * altura);
        if(imc < 20)
            System.out.println("Abaixo do peso");
        else
            if(imc >= 20 && imc < 25)
                System.out.println("Peso normal");
            else
                if(imc >= 25 && imc < 30)
                    System.out.println("Sobre peso");
                else
                    if(imc >= 30 && imc < 40)
                        System.out.println("Obeso");
                    else
                        System.out.println("Obeso mórbido");
    }
}
