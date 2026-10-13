import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        if (valor >= 100) {
            System.out.println("Valor acima de 100 reais, portanto, desconto de 10%!");
            double novo_valor = valor - ((valor*10)/100);
            System.out.println("Valor final: " + novo_valor);
        } else {
            System.out.println("Valor abaixo de 100 reais, portanto, sem desconto");
            System.out.println("Valor final: " + valor);
        }
        sc.close();
    }
    
}
