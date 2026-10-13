import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o primeiro número: ");
        int n2 = sc.nextInt();

        int maior = (n1 > n2) ? n1 : n2;

        System.out.println("O maior número é o: " + maior);
        sc.close();
    }
}
