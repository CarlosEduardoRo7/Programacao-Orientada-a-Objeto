import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        
        System.out.print("informe sua idade: ");
        String idade = sc.nextLine();
        
        int numero = Integer.parseInt(idade);
        
        if(idade.isEmpty() ) {
            System.out.println("idade vazia, favor informar");
        } else if (numero < 0  || numero > 120) {
            System.out.println("Erro: idade invalida");
        }
         else {
            System.out.println("Cadastro realizado com sucesso!");
            
        }

    
        
        
    
        sc.close();
    }
    
}
