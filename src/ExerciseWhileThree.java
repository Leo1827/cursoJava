import java.util.Scanner;

public class ExerciseWhileThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Salir");

            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                int numero1 = sc.nextInt();

                System.out.print("Ingrese el segundo número: ");
                int numero2 = sc.nextInt();

                int resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = numero1 + numero2;
                        System.out.println("Resultado de la suma: " + resultado);
                        break;
                    case 2:
                        resultado = numero1 - numero2;
                        System.out.println("Resultado de la resta: " + resultado);
                        break;
                    case 3:
                        resultado = numero1 * numero2;
                        System.out.println("Resultado de la multiplicación: " + resultado);
                        break;
                    case 4:
                        if (numero2 != 0) {
                            double division = (double) numero1 / numero2;
                            System.out.println("Resultado de la división: " + division);
                        } else {
                            System.out.println("No se puede dividir entre 0.");
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                continuar = false;
            } else {
                System.out.println("Opción no válida, intenta de nuevo.");
            }
        }

        sc.close();

    }
}
