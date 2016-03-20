class Livro {
    private String titulo;
    private int paginas;

    Livro(String t, int p) {
        titulo = t;
        paginas = p;
    }

    void mostrar() {
        System.out.println("Título: " + titulo +
                ", páginas: " + paginas);
    }
    public static void main(String[] args) {
        Livro[] array;
        int i;

        array = new Livro[4];
        array[0] = new Livro("Kamasutra", 200);
        array[1] = new Livro("Ilha Misteriosa", 190);
        array[2] = new Livro("Estruturas de Dados", 400);
        array[3] = new Livro("C Completo e Total", 500);
        for(i = 0; i < array.length; i++)
            array[i].mostrar();
    }
}
