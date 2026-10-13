public class ex1_SomaArray {
    public static void main(String[] args) {

        int[] numeros = {5, 12, 8, 20, 7, 3, 15, 10, 2, 18};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos é: " + soma);
    }
}