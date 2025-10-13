package lojinha;

import java.util.Locale;
import java.util.Scanner;


// fazer um escolha para as funcoes
//

public class progama {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        roupa produtos = new roupa();

        // CADASTRO
        System.out.print("Nome do produto: ");
        produtos.nome = sc.nextLine();
        System.out.print("Preço: ");
        produtos.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produtos.quantidade = sc.nextInt();

        // IMPRESSÃO
        System.out.println(produtos);

        // ADD quantidade
        System.out.println("Adicionar quantidade: ");
        int quantidade = sc.nextInt();
        produtos.addProdutos(quantidade);

        // IMPRESSÃO
        System.out.println();
        System.out.println("Atualização\n" + produtos);

        // REMOVE quantidade
        System.out.println();
        System.out.println("Remover quantidade: ");
        quantidade = sc.nextInt();
        produtos.removeProdutos(quantidade);

        // IMPRESSÃO
        System.out.println();
        System.out.println("Atualização\n" + produtos);

        sc.close();

    }
}
