import java.util.Scanner;

public class MatricesExercicesSuma {
    public static void main(String[] args) {
        /*
            Pedir al usuario el tamaño de la matriz, permite ingresar el valor de
            dos matrices, calcule la suma de dos matrices, muestre la matriz resultante
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas: ");
        int filas = sc.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = sc.nextInt();


        int matrizUno [][] = new int[filas][columnas];
        int matrizDos [][] = new int [filas][columnas];
        int suma [][] = new int [filas][columnas];

        // llenamos la primera matriz
        System.out.println("\n Ingrese los valores de la primera matriz ");
        for (int f=0;f<filas;f++){
            for (int c=0;c<columnas;c++){
                System.out.println("El elemento [" + f + "]["+ c +"]: ");
                matrizUno[f][c] = sc.nextInt();
            }
        }

        // Llenamos la segunda matriz
        for (int f=0;f<filas;f++){
            for (int c=0;c<columnas;c++){
                System.out.println("El elemento [" + f + "]["+ c +"]: ");
                matrizDos[f][c] = sc.nextInt();
            }
        }

        // sumamos las dos matrices
        for (int f=0;f<filas;f++){
            for (int c=0;c<columnas;c++){
                suma[f][c] = matrizUno[f][c] + matrizDos[f][c];
            }
        }

        // mostramos reusltado
        System.out.println("\nEl reusltado d ela suma de matrices: ");
        for (int f=0;f<filas;f++){
            for (int c=0;c<columnas;c++){
                System.out.println(suma[f][c] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
