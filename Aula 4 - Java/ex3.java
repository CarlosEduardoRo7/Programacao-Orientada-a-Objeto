import java.util.Scanner;

public class ex3 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int nmr = sc.nextInt();

            int i = 1;
            while(i < 11){
                System.out.println("["+nmr+"] x ["+i+"] = " + (nmr * i));
                i++;
            }

            sc.close();
        }
}
