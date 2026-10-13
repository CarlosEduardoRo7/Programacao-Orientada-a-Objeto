import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opc;
        double convert;

        do {
            System.out.println("\n---------- CONVERSOR DE MOEDAS ----------");
            System.out.println("1 - Real para Dólar");
            System.out.println("2 - Real para Euro");
            System.out.println("3 - Real para Libra");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opc = sc.nextInt();

            if (opc >= 1 && opc <= 3){

                System.out.println("\nInforme um valor:");
                double valor = sc.nextDouble();

                switch (opc){
                    case 1:
                       convert = valor * 5;
                       System.out.println("\nO valor "+valor+" R$ em dólares é: "+convert+" U$");
                       break;
                    case 2:
                        convert = valor * 5.5;
                        System.out.println("\nO valor "+valor+" R$ em euros é: "+convert+" Euros");
                        break;
                    case 3:
                        convert = valor * 6.3;
                        System.out.println("\nO valor "+valor+" R$ em euros é: "+convert+" Libras");
                        break;
                    case 0:
                        break;
                }
            } else {
                if (opc != 0){
                System.out.println("Valor inválido!");
                }
            }

        } while (opc != 0);
        System.out.println("Encerrando programa...");
        sc.close();
    }
    
}
