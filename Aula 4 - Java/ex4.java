import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor = 1;
        while(valor > 0 && valor < 51){
            System.out.println("Digite um número (entre 1 e 50): ");
            valor = sc.nextInt(); 
        }
            System.out.println("Valor inválido!");
        sc.close();
    }
}
