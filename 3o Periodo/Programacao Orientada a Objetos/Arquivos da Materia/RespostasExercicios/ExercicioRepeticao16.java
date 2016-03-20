class ExercicioRepeticao16 {
    public static void main(String[] args) {
        int num, soma;

        soma = 0;
        num = 1;
        while(num <= 100)
        {
            System.out.println(num);
            soma = soma + num;
            num = num + 1;
        }
        System.out.println("O somatório é " + soma);
    }
}