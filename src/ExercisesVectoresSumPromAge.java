import java.util.Scanner;

public class ExercisesVectoresSumPromAge {
    public static void main(String[] args) {
        double sueldos[] = new double[12];
        Scanner sc = new Scanner(System.in);
        // carga de sueldos
        for(int i=0;i< sueldos.length;i++){
            System.out.println("Ingrese el sueldo del mes: " + (i+1));
            sueldos[i] = sc.nextDouble();
        }

        //suma de sueldos
        double suma = 0;
        for (int i=0;i<sueldos.length;i++){
            suma = suma + sueldos[i];
        }

        //promedio de sueldo
        double promedio = 0;
        promedio = suma / sueldos.length;

        System.out.println("La suma de todo los sueldos del año: " + suma);
        System.out.println("El promedio de sueldos es de: " + promedio);
    }
}
