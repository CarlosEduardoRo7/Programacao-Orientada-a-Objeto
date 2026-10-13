import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = sc.nextInt();
        int i = (valor - 1);
        do {
            valor = valor * i;
            i--;
        } while (i > 0);
        System.out.println(valor);
        sc.close();
    }
}
