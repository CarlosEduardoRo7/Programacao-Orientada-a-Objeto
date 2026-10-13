import java.util.Scanner;


public class ex13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o nome do funcionário "+(i+1)+"º: ");
            String nome = sc.nextLine();
            System.out.println("Digite o salário de "+nome+": ");
            double salario = sc.nextDouble();
            double sl = 0;
            sl = salario + ((salario*10)/100);
            System.out.println("Salário final com bonûs de 10%: "+ sl);

            sc.nextLine();
        }
        sc.close();
    }
}
