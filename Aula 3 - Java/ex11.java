import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Menu de Frutas ======");
        System.out.println("1 - Maça");
        System.out.println("2 - Banana");
        System.out.println("3 - Laranja");
        System.out.println("4 - Uva");
        System.out.println("5 - Pêra");
        System.out.println("============================");
        System.out.println("Escolha uma fruta (1-5): ");
        int op = sc.nextInt();

        switch (op){
            case 1: System.out.println("A fruta escolhida foi: Maça"); break;
            case 2: System.out.println("A fruta escolhida foi: Banana"); break;
            case 3: System.out.println("A fruta escolhida foi: Laranja"); break;
            case 4: System.out.println("A fruta escolhida foi: Uva"); break;
            case 5: System.out.println("A fruta escolhida foi: Pêra"); break;
            default: System.out.println("Opção inválida."); break;
        }

        sc.close();
    }
}
