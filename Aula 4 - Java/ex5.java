import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        double soma = 0;
        while(i < 5){
            System.out.println("Digite a "+i+"º nota: ");
            double nmr = sc.nextDouble();
            soma = soma + nmr;
            i++;
        }
        double media = (soma/4);
        System.out.println("Média final: "+ media);
        sc.close();
    }
    
}
