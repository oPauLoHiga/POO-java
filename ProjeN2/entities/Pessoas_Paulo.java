package ProjeN2.entities;

public class Pessoas_Paulo {
    private String nome ;
    private String cpf  ;
    private String matricula ;

    public Pessoas_Paulo(String nome, String cpf, String matricula){
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString(){
        return "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Matrícula: " + matricula;
    }
}



