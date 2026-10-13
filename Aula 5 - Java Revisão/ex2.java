import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opc;
        double convert;

        do {

        System.out.println("\nInforme uma temperatura: ");
        double temp = sc.nextDouble();

        System.out.println("========== MENU ==========");
        System.out.println("1 - Celsius -> Fahrenheit");
        System.out.println("2 - Fahrenheit -> Celsius");
        System.out.println("3 - Celsius -> Kelvin");
        System.out.println("0 - Sair");
        System.out.println("==========================");

        System.out.println("Escolha: ");
        opc = sc.nextInt();

        if (opc >= 1 && opc <= 3){

        switch (opc){
            case 1:
                convert = ((temp * 9/5) + 32);
                System.out.printf("A temperatura " +temp+ "ºC é igual a: " + convert +"ºF " );
                break;
            case 2:
                convert = ((temp - 32) * 5/9);
                System.out.println("A temperatura " +temp+ "ºF é igual a: " +convert+"ºC " );
                break;
            case 3:
                convert = temp + 273.15;
                System.out.println("A temperatura " +temp+ "ºC é igual a: " +convert+"ºK ");
                break;
        }
        } else {
            System.out.println("Opção inválida!");
        }

        } while (opc != 0);
        System.out.println("Programa encerrado...");

        sc.close();
    }
    
}
