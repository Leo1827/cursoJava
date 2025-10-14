import java.util.Scanner;

public class ExerciseForConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberPositive;

        System.out.println("Ingresa un numero positivo N: ");
        numberPositive = sc.nextInt();

        if (numberPositive <= 0){
            System.out.println("El numero debe ser mayor a cero");
        } else {
            int sumaPares = 0;
            int sumaImpares = 0;

            System.out.println("\nAnalizando numeros del 1 al "+ numberPositive + ":\n");

            for (int i = 0; i < numberPositive; i++ ){
                if (i % 2 == 0) { // Se valida si el residuo es 0: par o 1: impar
                    System.out.println(i + "Es PAR");
                    // sumar y guardar
                    sumaPares += i;
                } else {
                    System.out.println(i + "Es IMPAR");
                    sumaImpares += i; // en la variable sumaPares se va sumando cada iteracion de numero positivo
                }
            }

            System.out.println("\n RESULTADOS ");
            System.out.println("Suma de pares: " + sumaPares);
            System.out.println("Suma de impares: " + sumaImpares);

            if (sumaPares > sumaImpares) {
                System.out.println("Los números pares tienen una suma mayor.");
            } else if (sumaImpares > sumaPares) {
                System.out.println("Los números impares tienen una suma mayor.");
            } else {
                System.out.println("Ambas sumas son iguales.");
            }
        }

    }
}
