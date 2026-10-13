import java.util.Scanner;

public class ex3_MediaDeValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o valor " +(i+1)+ ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        double media = soma/numeros.length;

        System.out.println("A média do array é: "+media);

        sc.close();
    }
}
