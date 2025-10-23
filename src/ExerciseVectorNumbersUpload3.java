import java.util.Scanner;

public class ExerciseVectorNumbersUpload3 {
    public static void main(String[] args) {
        int numeros[] = new int[15];

        Scanner sc= new Scanner(System.in);

        for (int i=0; i<15;i++){
            System.out.println("Ingrese el numero para el indice: " + i);
            numeros[i] = sc.nextInt();
        }

        // cuantos numeros 3 hay
        int cont3 = 0;
        for (int i=0; i<15;i++){
            if(numeros[i]==3){
                cont3++;
            }
        }

        System.out.println("El numero 3 se repite: " + cont3 + "veces");
    }
}
