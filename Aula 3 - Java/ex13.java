import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Tabela de Temperaturas =====");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("=================================");
        int op = sc.nextInt();

        double temp;

        switch (op) {
            case 1:
                System.out.println("Digite a temperaura em Celsius: ");
                temp = sc.nextDouble();
                System.out.printf("A temperatura é de %.2f Graus Fahrenheit", ((temp * 1.8) + 32));
                break;
            case 2:
                System.out.println("Digite a temperaura em Fahrenheit: ");
                temp = sc.nextDouble();
                System.out.printf("A temperatura é de %.2f Graus Celsius", ((temp - 32) / 1.8));
                break;
            default: System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
