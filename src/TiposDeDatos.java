import java.util.Scanner;
public class TiposDeDatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nota uno: ");
        double notaUno = sc.nextDouble();
        System.out.println("Ingrese nota dos: ");
        double notaDos = sc.nextDouble();
        System.out.println("Ingrese nota tres: ");
        double notaTres = sc.nextDouble();

        boolean notaValidas =
                (notaUno >= 0 && notaUno <= 5) &&
                (notaDos >= 0 && notaDos <= 5) &&
                (notaTres >= 0 && notaTres <= 5);

        double operation = (notaUno + notaDos + notaTres )/ 3;

        String result = !notaValidas ? "Alguna nota no es valida"
                : (operation < 3.0) ? "Reprobo la materia marica"
                : (operation <= 3.9 ) ? "Paso raspando mediocre"
                : (operation <= 4.6 ) ? "Buen trabajo imbesil"
                : "Notas invalidas";

        System.out.println(result + operation);

        sc.close();
    }
}
