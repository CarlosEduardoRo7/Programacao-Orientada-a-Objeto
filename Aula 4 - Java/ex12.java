import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valor_final = 0;
        System.out.println("Nome do cliente: ");
        String nome_cliente = sc.nextLine();
        for(int i = 0; i < 5; i++){
            System.out.println("Nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("Quantidade de Produtos: ");
            double qtd = sc.nextDouble();
            System.out.println("Valor por unidade: ");
            double und = sc.nextDouble();
            System.out.println("Valor final de "+nome+": " +(qtd*und));
            valor_final = valor_final + (qtd*und);
            sc.nextLine();
        }
        System.out.println("Valor final da compra de "+nome_cliente+ ": "+valor_final);
        sc.close();
    }
}
