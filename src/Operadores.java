import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        // programa que dependiendo del promedio de un alumno, nos diga si aprobó o no

        // declaracion de variables
        double promedio;
        String condicionFinal;

        Scanner sc = new Scanner(System.in); // que permite ingresar al sistema
        // scanner: clase java que nos permiten ingresar datos al sistema
        System.out.println("Escriba el promedio del alumno: ");
        promedio = sc.nextDouble();

        condicionFinal = (promedio >= 3.0) ? "Aprobado" : "Desaprobado";

        System.out.printf(condicionFinal + promedio);

    }
}
