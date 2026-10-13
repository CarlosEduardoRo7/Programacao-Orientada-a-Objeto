import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe seu cpf:");
        String cpf = sc.nextLine();

        int numero = Integer.parseInt(cpf);

        if(cpf.isEmpty()){
            System.out.println("cpf vazia!");
        }
        else if (numero == 11 ) {
            System.out.println("Cadastro realizado com sucesso!");
        }
        else {
            System.out.println("sua cpf deve ter 11 caracters");
            
        }

        sc.close();
    }
}
