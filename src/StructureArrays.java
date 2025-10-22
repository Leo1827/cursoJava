import java.util.Scanner;

public class StructureArrays {
    public static void main(String[] args) {
        // los arreglos son un conjunto de datos que se almacena enmemoria de manera contigua
        // Estructura fijas, cada arreglo puede ser un determinado tipo de datos, cada caja debe tener el mismo tipo dato del array
        // Cada indice esta representado con el numero desde el 0, como etiqueta de la caja
        // cada caja es una posicion de un arreglo
        // tamaño fijo, una vez declarada no se puede cambiar el tamaño

        // **Arreglos Unidimensional: poseen solo filas o solo columnas ejem: los vectores
        // vector
        int numeros [] = new int [8];// declaro e inicializo mi arreglo
        Scanner sc = new Scanner(System.in);
        /*numeros [0] = 35;
        numeros [1] = 25;
        numeros [2] = 16;
        numeros [3] = 30;
        numeros [4] = 40;
        numeros [5] = 50;
        numeros [6] = 22;
        numeros [7] = 32;*/

        // en un vector lo importante es la carga y el recorrido
        // length agrega el valor de indices de numeros
        for(int i=0;i<numeros.length;i++){
            // System.out.println("Estoy en el indice: " + i + "Y el valor es: " + numeros[i]);
            System.out.println("Ingrese el valor para el indice: " + i);
            numeros[i] = sc.nextInt();
        }
        System.out.println("Los valores ingresados fueron");
        for(int i=0; i<numeros.length;i++){
            System.out.println("Indice: "+ i + "Valor: " + numeros);
        }

        // **Array Bidimensional: Forman tablas de valores, donde existen dos dimensiones ejemp: matrices

    }
}
