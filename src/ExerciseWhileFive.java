import java.util.Scanner;

public class ExerciseWhileFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CONTRASENA_CORRECTA = "1234";
        String contrasena;
        double saldo = 1000.0;
        int opcion;

        System.out.println("Bienvenido al cajero virtual\n");
        System.out.println("Ingrese su contraseña: ");
        contrasena = sc.nextLine();

        while(!contrasena.equals(CONTRASENA_CORRECTA)){
            System.out.println("Contraseña incorrecta. Intente nuevamente.");
            System.out.println("Ingrese su contraseña: ");
            contrasena = sc.nextLine();
        }

        System.out.println("Acceso concedido\n");

        // 👇 Aquí vuelves a mostrar el menú y pedir una nueva opción
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Ver saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");

        System.out.println("Ingrese una opcion");
        opcion = sc.nextInt();

        // dos formas de saber si utilizar un boolean en un proceso logico
        // boolean result = (opcion < 0 || opcion > 4);
        // Cuando hay solo dos estados es muy conveniente pero cuando hay varias opciones, agregar condicion directas
        while (opcion != 4) {

            switch (opcion) {
                case 1:
                    System.out.printf("Su saldo total es: %.2f\n", saldo);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Ingrese el monto a depositar: ");
                    double saldoAgregado = sc.nextDouble();
                    saldo += saldoAgregado;
                    System.out.printf("Deposito exitoso, su nuevo saldo es: %.2f\n", saldo);
                    break;
                case 3:
                    System.out.println("Cuanto dinero desea retirar: ");
                    double retiro = sc.nextDouble();
                    boolean validation = (retiro > saldo);
                    if (!validation) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else if (retiro < 0){
                        System.out.println("No se permiten numeros negativos");
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                default:
                    System.out.println("opcion no valida.intente de nuevo");
                    break;
            }
            // 👇 Mostrar el menú otra vez dentro del bucle
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
        }

        System.out.println("Saliendo del banco");

        sc.close();

    }
}

