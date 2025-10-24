package ProjeN2.application;

import ProjeN2.entities.Graduacao_Paulo;
import ProjeN2.entities.Pessoas_Paulo;
import ProjeN2.entities.PosGraduacao_Paulo;

import java.util.Locale;
import java.util.Scanner;

// import java.util.ArrayList;
// for com vetor
// localizar o aluno para matricular na graduação ou pós-graduação
//
// DO = resposta igual a SIM continua
// 1 = cadastro aluno
// 2 = qual curso: graduação ou pos
// if... graduação ... else if.. pos
// deseja cadastrar mais aluno?

// while = não break

public class Progama_Paulo_Higa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pessoas_Paulo pessoas = null;
        Graduacao_Paulo graduacao_paulo = null;
        PosGraduacao_Paulo posGraduacao_paulo = null;
        int opcao;

        do {
            System.out.println("\n********* MENU *********");
            System.out.println("\n1 - Cadastrar Aluno");
            System.out.println("\n2 - Cadastrar Aluno Graduacao");
            System.out.println("\n3 - Cadastro Aluno PosGraduação");
            System.out.println("\n4 - Exibir dados do aluno");
            System.out.println("\n0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1: // cadrastrar aluno
                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o cpf: ");
                    String cpf = sc.nextLine();
                    System.out.println("Digite o matricula: ");
                    String matricula = sc.nextLine();

                    pessoas = new Pessoas_Paulo(nome, cpf, matricula);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    if(pessoas != null) {
                        System.out.println("----------Cadastro de Graduação----------");
                        System.out.println("Digite o nome da sua Graduação: ");
                        String cursoGraduacao = sc.nextLine();

                        graduacao_paulo = new Graduacao_Paulo(
                                pessoas.getNome(),
                                pessoas.getCpf(),
                                pessoas.getMatricula(),
                                cursoGraduacao
                        );
                        System.out.println("Graduação cadastrada com sucesso!");
                    } else {
                        System.out.println("Primeiro cadastre um Aluno!!(opção 1)");
                    }
                    break;

                case 3:
                    if(pessoas != null) {
                        System.out.println("----------Cadastro de PosGraduação----------");
                        System.out.println("Digite o nome da sua PosGraduação");
                        String cursoPosGraduacao = sc.nextLine();

                        posGraduacao_paulo = new PosGraduacao_Paulo(
                                pessoas.getNome(),
                                pessoas.getCpf(),
                                pessoas.getMatricula(),
                                cursoPosGraduacao
                        );
                    } else {
                        System.out.println("Primeiro cadastre um Aluno!!(opção 1)");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Dados Cadastrados ---");
                    if (posGraduacao_paulo != null) {
                        System.out.println(posGraduacao_paulo); // chama toString()
                    } else if (graduacao_paulo != null) {
                        System.out.println(graduacao_paulo); // chama toString()
                    } else if (pessoas != null) {
                        System.out.println(pessoas); // chama toString()
                    } else {
                        System.out.println("Nenhum cadastro encontrado!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                    default:
                        System.out.println("Opção inválida!");
            }

        } while (opcao != 0); // parar resposta não
        sc.close();
    }
}