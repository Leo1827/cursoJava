import java.util.Scanner;

public class StructureArrayMatrices {
    public static void main(String[] args) {
        // Bidimensional: existen dos indices y se pueden ver la interseccion
        // Se manejan por columnas y filas
        // Cuando se tiene la misma cantidad de filas y columnas, se le denomina: **Matriz cuadrada**

        // matriz cuadrada
        int matriz [][] = new int [3][3]; // primero filas y luego las columnas
        Scanner sc = new Scanner(System.in);

        // doble for: un for que va recorriendo cada una de las filas
        // y un for que va a recorrer cada columna

        // Recorrido y carga de matrices
        for(int f=0;f<3; f++){
            for(int c=0;c<3;c++) {
                System.out.println("Ingrese el valor para la fila: " + f + "Columna " + c);
                matriz[f][c] = sc.nextInt();
            }
        }

        // Recorrido y muestra
        for(int f=0;f<3; f++){
            for(int c=0;c<3;c++) {
                System.out.println("Fila: " + f + "Columna " + c + "Valor" + matriz[f][c]);
            }
        }
    }
}
