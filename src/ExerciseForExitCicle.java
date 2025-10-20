public class ExerciseForExitCicle {
    public static void main(String[] args) {

        // Si deseo salir del bucle
        int suma = 0;

        for (int i=0;i<10;i++){
            System.out.printf("Estoy en la vuelta: %d",i);

            suma = 5 + i;
            if (suma>=7){
                i=11;
            }
        }
    }
}
