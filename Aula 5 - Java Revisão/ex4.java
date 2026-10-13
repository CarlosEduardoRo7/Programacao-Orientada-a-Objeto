import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opc;
        double preco;
        double valortotal = 0;

        do {
            System.out.println("\n----- Menu de Lanchonete -----");
            System.out.println("1 - Hambúrguer (R$10)");
            System.out.println("2 - Cheeseburger (R$15)");
            System.out.println("3 - Batata frita (R$20)");
            System.out.println("4 - Refrigerante (R$5)");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opc = sc.nextInt();

            if (opc >= 1 && opc <= 3){
            System.out.println("Quantidade: ");
            double qtd = sc.nextDouble();

            switch (opc){
                case 1:
                    preco = 10;
                    valortotal += (preco * qtd);
                    break;
                case 2:
                    preco = 15;
                    valortotal += (preco * qtd);
                    break;
                case 3:
                    preco = 20;
                    valortotal += (preco * qtd);
                    break;
                case 4:
                    preco = 5;
                    valortotal += (preco * qtd);
                    break;
            }
            } else {
                if (opc != 0) {
                    System.out.println("Valor Inválido");
                }
            }

        } while (opc != 0);
        System.out.println("Valor final: " +valortotal);
        sc.close();
    }
    
}
