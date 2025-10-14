import java.util.Scanner;

public class ExerciseConditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de paquete por venta: ");
        int cantPackaje = sc.nextInt();

        boolean validationCero = (cantPackaje == 0) || (cantPackaje < 0);
        // primer solucion
        String result = validationCero ? "El valor no se permite"
                : (cantPackaje < 5) || (cantPackaje > 0) ? "No se permite compras inferiores a 5 productos"
                : (cantPackaje < 15 ) ? "El costo de envio es de $10 USD"
                : (cantPackaje >= 15 ) ? "El envio es gratuito"
                : "El valor ingresado no es correcto";

        System.out.println(result);

        sc.close();
    }
}
