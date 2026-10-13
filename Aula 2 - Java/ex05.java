import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("informe seu nome completo:");
        String nome = sc.nextLine();

        if(nome.isEmpty()){
            System.out.println("infome seu nome completo");
        }else{
            System.out.println("deve conter pelo menos um espaço ");
        }
        

        sc.close();
    }
}
