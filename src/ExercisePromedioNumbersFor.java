import java.util.Scanner;

public class ExercisePromedioNumbersFor {
    public static void main(String[] args) {
        /*
        Crea un programa en java que pida al usuario ingresar 5 numeros, los guarde en un arreglo
        y luego calcule el promedio usando un bucle for
         */
        Scanner sc = new Scanner(System.in);
        // se crea el vector
        double [] numeros = new double[5];
        double suma = 0;

        System.out.println("Ingrese 5 numeros: ");

        //leer los numeros con un for
        for(int i=0;i< numeros.length;i++){
            System.out.println("Numero " + (i+1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        double promedio = suma / numeros.length;

        System.out.println("\nEl promedio de los numeros es: " + promedio);

        sc.close();
    }
}
