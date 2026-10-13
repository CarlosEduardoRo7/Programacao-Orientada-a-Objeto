import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor = 1;
        int soma = 0;
        do {
            System.out.println("Digite um número (0 para fechar): ");
            valor = sc.nextInt();
            soma = soma + valor;

        } while(valor != 0);
        System.out.println("Soma final: "+ soma);
        sc.close();
    }
    
}
