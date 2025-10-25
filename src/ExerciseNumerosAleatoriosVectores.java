import java.util.Random;
public class ExerciseNumerosAleatoriosVectores {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        Random random = new Random();

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;

        // generar los numeros aleatorios
        for (int i=0;i<numeros.length;i++){
            numeros[i] = random.nextInt(100)+1;
            suma += numeros[i];

            // Verificar mayor o menor
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        // Mostrar Resultados
        System.out.println("Numeros generados");
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i] + "");
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("\n\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.printf("Promedio: %.2f\n", promedio);
    }
}
