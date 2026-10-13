import java.util.Scanner;

public class ex8 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();

        switch (dia){
            case 1 : System.out.println("Hoje é Domingo!"); break;
            case 2 : System.out.println("Hoje é Segunda!"); break;
            case 3 : System.out.println("Hoje é Terça!"); break;
            case 4 : System.out.println("Hoje é Quarta!"); break;
            case 5 : System.out.println("Hoje é Quinta!"); break;
            case 6 : System.out.println("Hoje é Sexta!"); break;
            case 7 : System.out.println("Hoje é Sábado!"); break;
            default : System.out.println("Dia inválido"); break;
        }
        sc.close();
    }
    
}
