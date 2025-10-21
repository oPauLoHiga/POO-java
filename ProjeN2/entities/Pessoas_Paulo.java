package ProjeN2.entities;

public class Pessoas_Paulo {
    private String nome ;
    private int cpf  ;
    private String matricula ;

    public Pessoas_Paulo(String nome, int cpf, String matricula){
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}



