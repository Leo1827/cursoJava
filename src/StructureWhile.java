import java.util.Scanner;

public class StructureWhile {
    public static void main(String[] args) {
        // while es muy utilizado: mientras

        // Ejemplo controlado por contador
        /*int contador = 0;

        while(contador < 10){
            System.out.println("Estoy en la vuelta N°: " + contador+1);
            contador ++;
        }*/

        Scanner sc = new Scanner(System.in);

        // Bucle controlador por centinela
        boolean bandera = true;
        String respuesta;
        while (bandera == true){
            System.out.println("El valor de mi bandera es: " + bandera);
            System.out.println("Estas actualmente subscrito? " + bandera);

            System.out.println("Queres desuscribirse? ");
            respuesta = sc.next();
            // para comparar strings equals
            if (respuesta.equals("si")){ // equalsIgnoreCase ignora las mayusculas o minus
                bandera = false;
            }



        }


    }
}
