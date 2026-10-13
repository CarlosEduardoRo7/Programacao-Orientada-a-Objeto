import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
        System.out.println("\n======= MENU =======");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potencia");
        System.out.println("0 - Sair");
        System.out.println("Escolha: ");
        opcao = sc.nextInt();
        if (opcao >=1 && opcao <= 5){
            System.out.println("Digite o primeiro número: ");
            double n1 = sc.nextDouble();
            System.out.println("Digite o segundo número: ");
            double n2 = sc.nextDouble();
            switch (opcao){
                case 1:
                    System.out.println("O resultado da soma é: " + (n1+n2));
                    break;
                case 2:
                    System.out.println("O resultado da subtração é: " + (n1-n2));
                    break;
                case 3:
                    System.out.println("O resultado da Multiplicação é: " + (n1*n2));
                    break;
                case 4:
                    if (n1 > 0 && n2 > 0){
                        System.out.println("O resultado da Divisão é: " + (n1/n2)); 
                       break;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                        break;
                    }
                case 5:
                    System.out.println("O resultado da Potencia é: " + Math.pow(n1,n2));
                    break;
            }
        } else {
            System.out.println("Opção inválida!");
        }
        } while(opcao != 0);
        System.out.println("Projeto finalizado...");
        sc.close();
    }
}
