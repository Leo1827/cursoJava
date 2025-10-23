import java.util.Scanner;

public class ArrayVectorTenNumbers {
    public static void main(String[] args) {
        /*
            Realizar un programa que permita la carga de 10 numeros en un vector
            una vez cargados, se necesita que el programa determine cual es el mayor
            y cual es el menor de ellos
         */
        int vector[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<=vector.length;i++){
            System.out.println("Ingrese un numero: " + i);
            vector[i] = sc.nextInt();
        }

        // busqueda del mayor
        int mayor = Integer.MIN_VALUE;
        for (int i=0;i<vector.length;i++){
            if(vector[i]>mayor){
                mayor = vector[i];
            }
        }

        // busqueda del menor
        int menor = Integer.MAX_VALUE;
        for (int i=0;i<vector.length;i++){
            if(vector[i]<menor){
                menor = vector[i];
            }
        }

        System.out.println("El mayor numero es: " + mayor);
        System.out.println("El menor numero es: " + menor);
    }
}
