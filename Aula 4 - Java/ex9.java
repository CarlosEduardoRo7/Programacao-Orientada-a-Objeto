import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome do "+(i+1)+"º funcionário: ");
            String nome = sc.nextLine();
            System.out.println("Digite o salário de "+nome+": ");
            double sl = sc.nextDouble();
            total = total + sl;
            sc.nextLine();
        }
        double media = (total/3);
        System.out.println("Total em salários: "+total+" R$");
        System.out.println("Média dos salários: "+media+" R$");
        sc.close();
    }
    
}
