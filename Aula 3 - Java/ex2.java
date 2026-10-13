import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10: ");
        double nota = sc.nextDouble();
        if (nota >= 7 && nota <= 10){
            System.out.println("Aprovado!");
        } else if (nota >= 5 && nota <= 6.9){
            System.out.println("Recuperação!");
        } else if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
