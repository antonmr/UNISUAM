import java.io.*;

class Aluno implements Serializable {
    private int mat;

    Aluno(int m) {
        mat = m;
    }

    int getMat() {
        return mat;
    }

    void setMat(int m) {
        mat = m;
    }
}
