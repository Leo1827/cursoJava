import java.util.Scanner;

public class ExerciseVectoresNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIng = 0;

        System.out.println("Cuantos numeros deseas ingresar?: ");
        numIng = sc.nextInt();

        // Creamos el vector

        int vector[] = new int[numIng];

        for(int i=0;i<numIng;i++){
            System.out.println("Ingresa el numero " + (i+1) + ":");
            vector[i] = sc.nextInt();
        }
        // mostrar los numeros ingresados
        System.out.println("\nLos numeros ingresados son:");
        for(int i=0;i<numIng;i++){
            System.out.println("Posicion " + i + ": " + vector[i]);
        }

        // Calculamos la suma de los elementos
        int suma = 0;
        for(int i=0;i<numIng;i++){
            suma += vector[i];
        }

        System.out.println("\nLa suma de todos los numeros es: " + suma);

    }
}
