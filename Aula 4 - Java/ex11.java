import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Nome do aluno: ");
            String nome = sc.nextLine();

            for(int j = 0; j < 3; j++){
                System.out.println("Digite a "+(j+1)+"º nota: ");
                double nota = sc.nextDouble();
                soma = soma + nota;
            }

            double media =(soma/3);
            System.out.printf("Média final de "+nome+": %.2f%n", media);

            soma = 0;
            sc.nextLine();
        }
        sc.close();
    }
    
}
