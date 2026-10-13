package Exercicios_Switch_case;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe um numero:");
        int dia = sc.nextInt();

        switch(dia){
            case 1: System.err.println("domingo");
            case 2: System.err.println("segunda");
            case 3: System.err.println("terça");
            case 4: System.err.println("quarta");
            case 5: System.err.println("quinta");
            case 6: System.err.println("sexta");
            case 7: System.err.println("sabado");


        }

        sc.close();
    }
}
