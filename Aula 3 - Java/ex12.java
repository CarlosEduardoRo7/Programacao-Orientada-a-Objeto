import java.util.Scanner;

public class ex12 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Tabela de Calculo =======");
        System.out.println("1 - Calcular duas notas");
        System.out.println("2 - Calcular três notas");
        System.out.println("3 - Calcular quatro notas");
        System.out.println("===============================-");

        int op = sc.nextInt();

        double n1;
        double n2;
        double n3;
        double n4;
        double media;

        switch (op) {
            case 1:
                System.out.println("Digite a primeira nota: ");
                n1 = sc.nextDouble();
                System.out.println("Digite a segunda nota: ");
                n2 = sc.nextDouble();
                media = (n1+n2)/2;
                System.out.println("A média final é: " + media);
                break;
            case 2:
                System.out.println("Digite a primeira nota: ");
                n1 = sc.nextDouble();
                System.out.println("Digite a segunda nota: ");
                n2 = sc.nextDouble();
                System.out.println("Digite a terceira nota: ");
                n3 = sc.nextDouble();
                media = (n1+n2+n3)/3;
                System.out.println("A média final é: " + media);
                break;
            case 3:
                System.out.println("Digite a primeira nota: ");
                n1 = sc.nextDouble();
                System.out.println("Digite a segunda nota: ");
                n2 = sc.nextDouble();
                System.out.println("Digite a terceira nota: ");
                n3 = sc.nextDouble();
                System.out.println("Digite a quarta nota: ");
                n4 = sc.nextDouble();
                media = (n1+n2+n3+n4)/4;
                System.out.println("A média final é: " + media);
                break;
            
            default: System.out.println("Valor inválido!");

            sc.close();
        }
    }
    
}
