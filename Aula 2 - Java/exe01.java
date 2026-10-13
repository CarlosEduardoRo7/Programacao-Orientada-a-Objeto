import java.util.Scanner;

public class exe01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("informe seu nome:");
        String nome = sc.nextLine();
        System.out.print("informe seu telefone:");
        String telefone = sc.nextLine();
        System.out.println("nome" + nome);
        System.out.println("telefone:" + telefone);
        sc.close();
    }
}