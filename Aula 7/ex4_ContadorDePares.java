import java.util.Scanner;

public class ex4_ContadorDePares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("\nDigite o valor " +(i+1)+ ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                soma += 1;
            }
        }

        System.out.println("\nO array possui "+soma+" números pares.\n");

        sc.close();
    }
}
