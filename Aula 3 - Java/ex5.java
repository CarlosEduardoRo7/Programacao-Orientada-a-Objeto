import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite outro número: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite uma operação (+, -, *, /): ");
        sc.nextLine();
        String opc = sc.nextLine();

        switch (opc){
            case "+": System.out.println("Resultado: " + (n1 + n2)); break;
            case "-": System.out.println("Resultado: " + (n1 - n2)); break;
            case "*": System.out.println("Resultado: " + (n1 * n2)); break;
            case "/": System.out.println("Resultado: " + (n1 / n2)); break;
            default : System.out.println("Digito inválido"); break;
        }
        sc.close();
    }
}
