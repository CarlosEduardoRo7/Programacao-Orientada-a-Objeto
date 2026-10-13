import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int soma = 0;
        while(i < 5){
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            soma = soma + numero;
            i++;
        }

        System.out.print(soma);
        sc.close();
        }
    }
