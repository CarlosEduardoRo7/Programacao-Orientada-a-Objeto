import java.util.Scanner;

public class ex4_temperaturas {
    
public static double F_para_C(double temp) {
        return 	(temp - 32) * 5/9;
    }

public static double F_para_K(double temp) {
        return 	(temp - 32) * 5/9 + 273.15;
    }

public static double C_para_F(double temp) {
        return 	(temp * 9/5) + 32;
    }

public static double C_para_K(double temp) {
        return 	temp + 273.15;
    }

public static double K_para_C(double temp) {
        return 	temp - 273.15;
    }

public static double K_para_F(double temp) {
        return 	(temp - 273.15) * 9/5 + 32;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("\n======= Tabela de Temperaturas =======");
        System.out.println("\n----------------------------------------");
        System.out.println("1- Fahrenheit para Celsius \n2- Fahrenheit para Kelvin");
        System.out.println("----------------------------------------");
        System.out.println("3- Celsius para Fahrenheit \n4- Celsius para Kelvin");
        System.out.println("----------------------------------------");
        System.out.println("5- Kelvin para Celsius \n6- Kelvin para Fahrenheit");
        System.out.println("----------------------------------------");
        System.out.println("Escolha: ");
        int opc = sc.nextInt();

        System.out.println("\nInforme a temperatura: ");
        num = sc.nextInt();

        double resultado = 0;

        if (opc > 0 && opc < 7){
        switch (opc) {
            case 1:
                resultado = F_para_C(num);
                System.out.println(num+ " °F = " + resultado + " °C");
                break;
            case 2:
                resultado = F_para_K(num);
                System.out.println(num+ " °F = " + resultado + " °K");
                break;
            case 3:
                resultado = C_para_F(num);
                System.out.println(num+ " °C = " + resultado + " °F");
                break;
            case 4:
                resultado = C_para_K(num);
                System.out.println(num+ " °C = " + resultado + " °K");
                break;
            case 5:
                resultado = K_para_C(num);
                System.out.println(num+ " °K = " + resultado + " °C");
                break;
            case 6:
                resultado = K_para_F(num);
                System.out.println(num+ " °K = " + resultado + " °F");
                break;
        }
        } else {
            System.out.println("\nOpção Inválida!");
        }

        sc.close();
        
            
    }
}