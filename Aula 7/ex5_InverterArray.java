public class ex5_InverterArray {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("\nArray na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}