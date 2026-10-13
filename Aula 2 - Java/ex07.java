import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe um numero: ");
        int numero = sc.nextInt();

        


        if (numero < 0  ){
            System.out.println("erro não pode ser negativo");
        }else if(numero == 0){
            System.out.println("numero nulo");
        }else {
            System.out.println(numero +"é um numero inteiro");
        }
        sc.close();
    }
}
