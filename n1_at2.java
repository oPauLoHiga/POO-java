import java.util.Scanner;

public class n1_at2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] produtos = {
                "Cachaça 51", "Heineken",
                "Guaraná", "Guaraná Zero",
                "Batata Frita", "Torresmo",
                "Feijoada", "Picanha"
        };
        double[] valores = {
                5.00, 12.00,
                7.00, 7.50,
                20.00, 25.00,
                40.00, 60.00
        };

        int[] pedidos = new int[2];
        int[] quantidades = new int[2];

        System.out.print("Digite o número da mesa: ");
        int mesa = sc.nextInt();

        System.out.println("\n****** CARDAPIO ******");
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("%d - %s (R$:%.2f) \n", i + 1, produtos[i], valores[i]);
        }

        for (int i = 0; i < 2; i++) {

            System.out.printf("\nDigite o numero do produto para o pedido %d: ", i + 1);
            pedidos[i] = sc.nextInt();

            while (pedidos[i] <= 0 || pedidos[i] > produtos.length) {
                System.out.println("\nOi1");
                System.out.println("PRODUTO INVALIDO!!!");


                System.out.printf("\nDigite outro numero do produto para o pedido %d: ", i + 1);
                pedidos[i] = sc.nextInt();
            }

            System.out.printf("Digite a quantidade: ");
            quantidades[i] = sc.nextInt();

            while (quantidades[i] < 1) {

                System.out.println("QUANTIDADE INVALIDA!!!");

                System.out.printf("Digite a quantidade: ");
                quantidades[i] = sc.nextInt();
            }
        }

        System.out.println("********** CONTA DA MESA" + mesa + "**********");
        double total = 0;
        for (int i = 0; i < 2; i++) {
            int indice = pedidos[i];
            double subtotal = valores[indice] * quantidades[i];
            total += subtotal;
            System.out.printf("\n%d x %s (R$%.2f cada) = R$%.2f", quantidades[i], produtos[i], valores[indice], subtotal);
        }
        System.out.printf("\nTOTAL A PAGAR: R$ %.2f\n", total);

        sc.close();
    }
}
