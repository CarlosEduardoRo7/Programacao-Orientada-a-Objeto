import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    double n1 = sc.nextDouble();
    System.out.println("Digite o segundo valor: ");
    double n2 = sc.nextDouble();
    System.out.println("Digite o terceiro valor: ");
    double n3 = sc.nextDouble();

    if (n1 < (n2 + n3) && n2 < (n1 + n3) && n3 < (n1 + n2) ) {
        System.out.println("Pode ser um triângulo!");
    } else {
        System.out.println("Não pode formar um triângulo.");
    }
    sc.close();
    }
}
