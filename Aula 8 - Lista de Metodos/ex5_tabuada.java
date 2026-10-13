import java.util.Scanner;

public class ex5_tabuada {

    public static double Tabuada(int nmr, int i) {
        
            System.out.println("Tabuada do " + nmr + ": ");
            while(i < 11){
                System.out.println("["+nmr+"] x ["+i+"] = " + nmr * i);
                i++;
            }

        return nmr;
    }
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int nmr = sc.nextInt();

            int i = 1;

            Tabuada(nmr, i);

            sc.close();

    }
}