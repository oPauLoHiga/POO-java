import java.util.Scanner;
public class escolhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua escolha: 1- sorvete / 2- Pizza ");
        int escolha = sc.nextInt();
        /*switch(escolha){
            case 1:
                System.out.println("Voce escolheu sorvete!!");
                break;
            case 2:
                System.out.println("Voce escolheu pizza!!");
                break;
        default:
            System.out.println("escolha invalida!!");
        }*/
        if (escolha == 1){System.out.println("Voce escolheu sorvete!!");}
        else if (escolha == 2){ System.out.println("Voce escolheu pizza!!");}
        else {System.out.println("escolha invalida!!");}
        sc.close();
    }
}
