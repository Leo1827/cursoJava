import java.util.Scanner;

public class ExerciseWhileExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean contador = true;

        while(contador){
            System.out.println("Ingresa salir: ");
            String exitInput = sc.nextLine();
            if (exitInput.equals("salir")){
                System.out.println("Saliendo del programa...");
                contador = false;
            }
        }

        sc.close();

    }
}
