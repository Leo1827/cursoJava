import java.util.Scanner;

public class ArrayVectorNames {
    public static void main(String[] args) {

        String nombres[] = new String[8];
        Scanner sc = new Scanner(System.in);
        // carga de nombres
        for (int i=0;i<nombres.length;i++){
            System.out.println("Ingrese el nombre que quiera guardar en el indice:");
            nombres[i] = sc.nextLine();
        }
        // mostrar los nombres
        for (int i=0;i<nombres.length;i++){
            System.out.println("Indice: " + i + "Nombre guardado: " + nombres[i]);
        }


    }
}
