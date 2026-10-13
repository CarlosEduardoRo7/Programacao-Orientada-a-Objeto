import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opc;
        double preco;
        double valortotal = 0;

        do {
            System.out.println("\n----- Menu de Cinema -----");
            System.out.println("1 - Inteira (R$20)");
            System.out.println("2 - Meia (R$10)");
            System.out.println("3 - VIP (R$35)");
            System.out.println("4 - Combo pipoca + refri (R$15)");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opc = sc.nextInt();

            if (opc >= 1 && opc <= 4){
            System.out.println("Quantidade: ");
            double qtd = sc.nextDouble();

            switch (opc){
                case 1:
                    preco = 20;
                    valortotal += (preco * qtd);
                    break;
                case 2:
                    preco = 10;
                    valortotal += (preco * qtd);
                    break;
                case 3:
                    preco = 35;
                    valortotal += (preco * qtd);
                    break;
                case 4:
                    preco = 15;
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
