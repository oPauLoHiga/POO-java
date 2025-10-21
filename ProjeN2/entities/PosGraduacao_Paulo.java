package ProjeN2.entities;

public class PosGraduacao_Paulo extends Pessoas_Paulo {
    private String cursoPosGraduacao;
    public PosGraduacao_Paulo(String nome, String cpf, String matricula, String cursoPosGraduacao) {
       super(nome, cpf, matricula);
       this.cursoPosGraduacao = cursoPosGraduacao;
    }

    public String getCursoPosGraduacao() {
        return cursoPosGraduacao;
    }
    public void setCursoPosGraduacao(String cursoPosGraduacao) {
        this.cursoPosGraduacao = cursoPosGraduacao;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nCurso PosGraduacao: " + cursoPosGraduacao;
    }
}
