import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opc;
        double valorfinal;

        do {

            System.out.println("\n-------- Posto de combustível --------");
            System.out.println("1 - Gasolina (6,50/L)");
            System.out.println("2 - Etanol (4,00/L)");
            System.out.println("3 - Diesel (6,00/L)");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opc = sc.nextInt();

            if (opc >= 1 && opc <= 3) {
                System.out.println("Digite o número de litros: ");
                double l = sc.nextDouble();
                switch (opc){
                    case 1:
                        valorfinal = l * 6.5;
                        System.out.println("O valor final é: "+ valorfinal + " R$");
                        break;
                    case 2:
                        valorfinal = l * 4;
                        System.out.println("O valor final é: "+ valorfinal + " R$");
                        break;
                    case 3:
                        valorfinal = l * 6;
                        System.out.println("O valor final é: "+ valorfinal + " R$");
                        break;
                }

            } else {
                if (opc != 0){
                    System.out.println("Opçao Inválida!");
                }
            }

        } while (opc != 0);
        sc.close();
    }
}
