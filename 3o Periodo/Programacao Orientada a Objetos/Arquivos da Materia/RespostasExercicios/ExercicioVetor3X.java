class ExercicioVetor3X {
    public static void main(String[] args) {
        int[] vet;
        int i;

        vet = new int[100];
        for(i = 0; i < vet.length; i++)
        	vet[i] = 100 - i;
        System.out.print("vet = { ");
        for(i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
        System.out.println("}");
    }
}