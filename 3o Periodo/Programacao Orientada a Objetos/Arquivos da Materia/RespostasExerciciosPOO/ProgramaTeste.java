class CodigoPostal {
    private int indicativo, extensao;
    private String nomeDaRua;

    CodigoPostal() {
        indicativo = 0;
        extensao = 0;
        nomeDaRua = "Indisponível";
    }

    CodigoPostal(int i, String n) {
        indicativo = i;
        extensao = 0;
        nomeDaRua = n;
    }

    CodigoPostal(int i, int e, String n) {
        indicativo = i;
        extensao = e;
        nomeDaRua = n;
    }

    int getIndicativo() {
        return indicativo;
    }

    int getExtensao() {
        return extensao;
    }

    String getNomeDaRua() {
        return nomeDaRua;
    }

    void setIndicativo(int i) {
        indicativo = i;
    }

    void setExtensao(int e) {
        extensao = e;
    }

    void setNomeDaRua(String n) {
         nomeDaRua = n;
    }
}

class ProgramaTeste {

}
