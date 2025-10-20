import java.util.Scanner;

public class ExerciseForTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTablas de multiplicar");
        int numeroUsuario, result;
        System.out.println("Ingrese un numero: ");
        numeroUsuario = sc.nextInt();

        for (int i=1;i<=10;i++){
            result = numeroUsuario * i;
            System.out.printf("%d x %d = %d\n", numeroUsuario, i, result);
        }

        sc.close();
    }
}
