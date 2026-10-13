import java.util.Scanner;

public class ex10 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o salário: ");
        double sl = sc.nextDouble();

        if (sl <= 2000) {
            double novo_sl = sl + ((sl*15)/100);
            System.out.println("Salário final: " + novo_sl);
        } else {
            double novo_sl = sl + ((sl*10)/100);
            System.out.println("Salário final: " + novo_sl);
        }

        sc.close();
    }
}
