class ExercicioVetor1X {
    public static void main(String[] args) {
        int[] vet;
        int i;

        vet = new int[51];
        for(i = 0; i < vet.length; i++)
        	vet[i] = i;
        System.out.print("vet = { ");
        for(i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
        System.out.println("}");
    }
}