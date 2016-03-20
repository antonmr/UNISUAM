import javax.swing.JOptionPane;

class Livro {
    private String titulo;
    private int paginas;

    Livro(String ti, int pa) {
        titulo = ti;
        paginas = pa;
    }

    String getTitulo() {
        return titulo;
    }

    void setTitulo(String ti) {
        titulo = ti;
    }

    int getPaginas() {
        return paginas;
    }

    void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}

class TestaLivro {
    public static void main(String[] args) {
        Livro li;
        String resposta;
        int novaPaginas, i;
        Livro[] vetLi;

        li = new Livro("Fortaleza Digital", 425);
        JOptionPane.showMessageDialog(null, "Título: " +
                li.getTitulo() + "\nPáginas: " +
                li.getPaginas());
        resposta = JOptionPane.showInputDialog("Digite a nova quantidade de páginas:");
        novaPaginas = Integer.parseInt(resposta);
        li.setPaginas(novaPaginas);
        JOptionPane.showMessageDialog(null, "Páginas: " +
                li.getPaginas());
        vetLi = new Livro[4];
        vetLi[0] = new Livro("O Nome da Rosa", 750);
        vetLi[1] = new Livro("Bíblia", 360);
        vetLi[2] = new Livro("Comer Rezar e Amar", 350);
        vetLi[3] = new Livro("Doutor No", 250);
        for( i = 0; i < vetLi.length; i++)
            JOptionPane.showMessageDialog(null, "Título: " +
                vetLi[i].getTitulo() + "\nPáginas: " +
                vetLi[i].getPaginas());
    }
}
