import java.util.Scanner;

public class ExerciseWhileFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intentos = 0;
        int numeroUsuario = 0;
        int sumaTotal = 0;
        boolean continuar = true;

        while (continuar){
            System.out.println("Los numero que ingreses se sumaran hasta que selecciones: 0");
            System.out.println("Ingresa el numero: " + numeroUsuario);
            numeroUsuario = sc.nextInt();

            if (numeroUsuario == 0){
                System.out.println("Saliendo del programa");
                continuar = false;
            }
            sumaTotal += numeroUsuario;
            intentos++;

        }

        System.out.printf("La suma total es: %d", sumaTotal);
        System.out.printf("\nLa cantidad de numeros ingresados: %d", intentos);


        sc.close();
;    }
}
