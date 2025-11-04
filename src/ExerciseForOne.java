import java.util.Scanner;

public class ExerciseForOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero limite: ");
        int limite = sc.nextInt();

        int suma =0;

        for(int i=0;i<=limite;i++){
            suma+=i;
            System.out.println(i);
        }

        int limiteConditional = 40;

        if(suma>limiteConditional){
            System.out.println("Es mayor que 40");
            System.out.println("El resultado de la suma de los numeros es: " + suma);
        } else {
            System.out.println("Es menor que 40 o igual");
        }
    }
}
