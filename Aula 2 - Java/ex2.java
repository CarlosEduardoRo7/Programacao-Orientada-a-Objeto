import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("informe seu email:");
        String email = sc.nextLine();

        if(email.trim().isEmpty()){
            System.err.println("o nome não pode estra vazio");
        }
        if (email.contains("@")){
            System.out.println("contem o @");
        }else{
            System.out.println("não possui o @, por favor coloque");
        }
        if(email == ""){
            System.out.println("informe seu email");
        }


        sc.close();
    }
}
