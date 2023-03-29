package ejerciciowhile;

import java.util.Scanner;

public class EjercicioWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        int nota = leer.nextInt();

        while (nota > 0 && nota <= 10) {
            System.out.println("Su nota está dentro del rango");
            nota = leer.nextInt();
        }
    }
}
