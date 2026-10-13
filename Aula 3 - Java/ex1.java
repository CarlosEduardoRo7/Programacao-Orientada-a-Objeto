import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
        sc.close();
    }
}