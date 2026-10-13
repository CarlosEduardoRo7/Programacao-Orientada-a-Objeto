import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Mostrar números de 1 a 10: ");
        while(i < 11){
            System.out.println("Número: " + i);
            i++;
        }
        sc.close();
    }
}
