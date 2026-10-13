import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("informe sua senha:");
        String senha = sc.nextLine();

        int numero = Integer.parseInt(senha);

        if(senha.isEmpty()){
            System.out.println("senha vazia!");
        }
        else if (numero <= 6 ) {
            System.out.println("Cadastro realizado com sucesso!");
        }
        else {
            System.out.println("sua senha deve ter 6 caracters");
            
        }




        sc.close();  
    }
}
