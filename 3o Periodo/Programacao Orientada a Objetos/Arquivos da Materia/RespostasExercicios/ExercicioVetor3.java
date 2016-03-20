class ExercicioVetor3 {
    public static void main(String[] args) {
        int[] vet;
        int i;

        vet = new int[100];
        vet[0] = 100;
        for(i = 1; i < vet.length; i++)
        	vet[i] = vet[i - 1] - 1;
        System.out.print("vet = { ");
        for(i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
        System.out.println("}");
    }
}