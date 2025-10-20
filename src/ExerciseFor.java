public class ExerciseFor {
    public static void main(String[] args) {

        // Muestre todos los números pares del 1 al 20.
        //
        //Calcule y muestre la suma total de esos números pares.

        int numerosPares = 0;
        int sumaPares = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0){
                numerosPares++;
                sumaPares += i;
            }
        }
        System.out.printf("Numeros pares: %d", numerosPares);
        System.out.printf("\nSuma total de pares: %d", sumaPares);
    }
}
