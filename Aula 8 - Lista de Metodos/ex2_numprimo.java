import java.util.Scanner;

public class ex2_numprimo {
    public static boolean Primo (int numero){
        if (numero <= 1) return false;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) return false; 
            }
            return true;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("informe um numero: ");
        num = sc.nextInt();

        boolean resultado = Primo(num);

        if (resultado == false){
            System.out.println("\nO número "+num+" não é primo.\n");
        } else {
            System.out.println("\nO número "+num+" é primo.\n");
        }

        sc.close();
        
            
    }
}