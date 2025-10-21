import java.util.Scanner;

public class ExerciseLimitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroLimit = 0;
        System.out.println("Digite el numero limite: ");
        numeroLimit = sc.nextInt();

        for (int i=1;i<=numeroLimit;i++){
            System.out.printf("Numero: %d\n",i);
        }
    }
}
