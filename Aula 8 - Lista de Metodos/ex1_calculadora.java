import java.util.Scanner;

public class ex1_calculadora {
    public static double Somar(double a, double b) {
        return a + b;
    }
    public static double Subtrair(double a, double b) {
        return a - b;
    }
    public static double Multiplicar(double a, double b) {
        return a * b;
    }
    public static double Dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado = 0;
        int opcao;
        System.out.println("\nDigite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        System.out.println("\n======== TABELA ========");
        System.out.println("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir");
        System.out.println("Escolha uma opção: \n");
        opcao = sc.nextInt();

        if (opcao < 5 && opcao > 0) {
        switch (opcao) {
            case 1:
                resultado = Somar(num1, num2);
                break;
            case 2:
                resultado = Subtrair(num1, num2);
                break;
            case 3:
                resultado = Multiplicar(num1, num2);
                break;
            case 4:
                resultado = Dividir(num1, num2);
                break;
        }

        System.out.println("Resultado final: " + resultado);
        
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
