import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Menu de Opções ====");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        System.out.println("========================");
        int opc = sc.nextInt();

        switch (opc) {
            case 1: System.out.println("A ação de cadastrar foi escolhida."); break;
            case 2: System.out.println("A ação de listar foi escolhida."); break;
            case 3: System.out.println("A ação de sair foi escolhida."); break;
            default : System.out.println("Número inválido"); break;
        }
        sc.close();

    }
}
