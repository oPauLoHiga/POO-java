package ProjeN2.entities;

import br.com.app.Progama;

public class Graduacao_Paulo extends Pessoas_Paulo {
    private String cursoGraduacao;
    public Graduacao_Paulo(String nome, int cpf, String matricula, String cursoGraduacao) {
        super(nome, cpf, matricula);
        this.cursoGraduacao = cursoGraduacao;
    }
    public String getCursoGraduacao() {
        return cursoGraduacao;
    }
    public void setCursoGraduacao(String cursoGraduacao) {
        this.cursoGraduacao = cursoGraduacao;
    }
}
