import java.util.Scanner;

public class ExerciseWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ini = true;
        int numero = 0;
        int sumaNumeros = 0;
        int contador = 0;

        while (ini == true){
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();

            if (numero >= 0){
                contador++;
                sumaNumeros += numero;
            } else {
                if (numero < 0){
                    ini = false;
                    System.out.println("Ejercicio terminado");
                }
            }

        }

        System.out.println("Has ingresado " + contador + " numeros positivos");
        System.out.println("La suma total es: " + sumaNumeros);
    }
}
