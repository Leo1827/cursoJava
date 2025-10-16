import java.util.Scanner;

public class ExerciseWhileTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean contador = true;
        int numero = 0;
        int numeroSecreto = (int)(Math.random() * 10) + 1;
        int intentos = 0;
        int numerosErroneos = 0;

        while (contador) {

            System.out.println("Ingrese el numero entre (1 y 10)");
            numero = sc.nextInt();

            if (numero < 10){
                if (numero == numeroSecreto) {
                    intentos++;
                    System.out.println("¡Correcto! adivinaste en " + intentos + " intentos");
                    contador = false;

                } else {
                    intentos++;
                    if (numero > numeroSecreto){
                        System.out.println("El numero secreto es mayor");
                    } else {
                        System.out.println("El numero secreto es menor");
                    }
                }
            } else {
                intentos++;
                numerosErroneos++;
                System.out.println("El numero es erroneo");
            }
        }

        System.out.println("Numero de intentos: " + intentos);
        System.out.println("Numero erroneos: " + numerosErroneos);
        System.out.println("El numero secreto era: " + numeroSecreto);
        sc.close();
    }
}
