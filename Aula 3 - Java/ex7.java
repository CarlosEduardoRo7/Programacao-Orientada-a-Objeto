import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12){
            System.out.println("Você é uma criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Você é um adulto");
        } else if (idade >= 60) {
            System.out.println("Você é idoso");
        } else {
            System.out.println("Idade inválida");
        }

        sc.close();
    }
    
}
