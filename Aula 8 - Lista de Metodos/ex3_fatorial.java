import java.util.Scanner;

public class ex3_fatorial {
    
public static int Fatorial(int n) {
        int resultado = 1; 
        
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        
        return resultado;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("Informe um numero: ");
        num = sc.nextInt();

        int resultado = Fatorial(num);
        System.out.println("O fatorial de "+num+" é: "+resultado);

        sc.close();
        
            
    }
}