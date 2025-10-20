package br.com.aplicacao;

import java.util.Scanner;

public class progama_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] valor = new double[4];
        String [] produto = new String [4];
        //CADASTRO
        for (int i = 0; i < produto.length; i++) {
            System.out.println("Digite o nome do produto: ");
            produto[i] = sc.nextLine();
            System.out.println("Digite o valor do produto: ");
            valor[i] = sc.nextDouble();
            sc.nextLine();
        }
        //IMPRESSÃO
        for (int i = 0; i < 4; i++){
            System.out.printf("Produto: %s%nValor: %.2f%n%n", produto[i], valor[i]);
        }
        sc.close();
    }
}
