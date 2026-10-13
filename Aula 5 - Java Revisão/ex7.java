import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double faturamento = 0;
        double salario2 =0;

        while (true) {

            System.out.println("-------EMPRESSA-------");
            System.out.println("\n1-Gerente (bônus 20%)\n2-Supervisor (bônus 15%)\n3-Funcionário (bônus 10%)\n4-Estagiário (bônus 5%)");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("informe seu nome: ");
                    String nome = sc.nextLine();
                    System.out.println("informe o salario inicial: ");
                    double salario1 = sc.nextDouble();

                    double total = salario1*(0.02);
                    salario2 = salario1 + total;

                    System.out.println(nome+ "o salrio novo é de: "+ salario2);
                case 2:
                    System.out.println("informe seu nome: ");
                    nome = sc.nextLine();
                    System.out.println("informe o salario inicial: ");
                    salario1 = sc.nextDouble();

                    total = salario1*(0.15);
                    salario2 = salario1 + total;

                    System.out.println(nome+ "o salrio novo é de: "+ salario2);
                case 3:
                    System.out.println("informe seu nome: ");
                    nome = sc.nextLine();
                    System.out.println("informe o salario inicial: ");
                    salario1 = sc.nextDouble();

                    total = salario1*(0.10);
                    salario2 = salario1 + total;

                    System.out.println(nome+ "o salrio novo é de: "+ salario2);
                case 4:
                    System.out.println("informe seu nome: ");
                    nome = sc.nextLine();
                    System.out.println("informe o salario inicial: ");
                    salario1 = sc.nextDouble();

                    total = salario1*(0.05);
                    salario2 = salario1 + total;

                    System.out.println(nome+ "o salrio novo é de: "+ salario2);
                default:
                    faturamento += salario2;
                    System.out.println("total do faturamento é de: " + faturamento);
                    sc.close();
                    break;
            }

        }
    }
    
}
