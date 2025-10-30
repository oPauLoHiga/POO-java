package ProjeN2.entities;

public class Graduacao_Paulo extends Pessoas_Paulo {
    private String cursoGraduacao;
    public Graduacao_Paulo(String nome, String cpf, String matricula, String cursoGraduacao) {
        super(nome, cpf, matricula);
        this.cursoGraduacao = cursoGraduacao;
    }
    public String getCursoGraduacao() {
        return cursoGraduacao;
    }
    public void setCursoGraduacao(String cursoGraduacao) {
        this.cursoGraduacao = cursoGraduacao;
    }
    @Override
    public String toString() {
        return  super.toString() +
                "\nCurso Graduacao: " + cursoGraduacao;
    }
}
