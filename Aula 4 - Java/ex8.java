import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a matéria: ");
        String mat = sc.nextLine();
        System.out.println("Digite o número de notas: ");
        int notas = sc.nextInt();
        int i = 0;
        double soma = 0;
        do {
            System.out.println("Digite a "+ (i+1) +"º nota: ");
            double n = sc.nextDouble();
            soma = soma + n;
            i++;
        } while (i < notas);
        double media = (soma/notas);
        System.out.println("A Média final de "+ nome +" em "+ mat +" é: "+ media);
        sc.close();
    }
    
}
