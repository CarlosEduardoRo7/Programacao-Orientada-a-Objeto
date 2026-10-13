import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        double valorfinal = 0;

        do {
            System.out.println("------ EMPRESA ------");
            System.out.println("1 - Vale transporte");
            System.out.println("2 - Vale alimentação");
            System.out.println("3 - Plano de saúde");
            System.out.println("4 - Todos geral dos descontos");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opc = sc.nextInt();

            if (opc >= 1 && opc <= 4){
                System.out.println("Digite o salário: ");
                double valor = sc.nextDouble();

                double desconto = 0;
                switch (opc){
                    case 1:
                        desconto = valor - (valor*0.06);
                        System.out.println("Salário final: " +desconto);
                        valorfinal += desconto;
                        break;
                    case 2:
                        desconto = valor - (valor*0.1);
                        System.out.println("Salário final: " +desconto);
                        valorfinal += desconto;
                        break;
                    case 3:
                        desconto = valor - (valor*0.12);
                        System.out.println("Salário final: " +desconto);
                        valorfinal += desconto;
                        break;
                    case 4:
                        desconto = valor - (valor*0.12) - (valor*0.1) - (valor*0.06);
                        System.out.println("Salário final: " +desconto);
                        valorfinal += desconto;
                        break;
                }
            }
        } while (opc != 0);
        System.out.println("Valor final: " +valorfinal);

        sc.close();
    }
}
