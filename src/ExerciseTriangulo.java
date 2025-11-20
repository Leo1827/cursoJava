import java.util.Scanner;
public class ExerciseTriangulo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c, altura;
        String tipo = "";

        System.out.print("Ingrese el lado a: ");
        a = input.nextDouble();

        System.out.print("Ingrese el lado b: ");
        b = input.nextDouble();

        System.out.print("Ingrese el lado c: ");
        c = input.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        altura = input.nextDouble();

        // ---------------------------
        // 1. DETERMINAR TIPO DE TRIÁNGULO
        // ---------------------------
        if (a == b && b == c) {
            tipo = "equilatero";
            System.out.println("El triángulo es equilátero.");
        } else if (a == b || b == c || a == c) {
            tipo = "isoceles";
            System.out.println("El triángulo es isósceles.");
        } else {
            tipo = "escaleno";
            System.out.println("El triángulo es escaleno.");
        }

        // ---------------------------
        // 2. CÁLCULO DE LOS ÁNGULOS (SWITCH)
        // ---------------------------
        System.out.println("\nCálculo de ángulos usando Teorema del Coseno:");

        switch (tipo) {
            case "equilatero":
                System.out.println("Todos los ángulos = 60°");
                break;

            case "isoceles":
            case "escaleno":
                double angA = calcularAngulo(b, c, a);
                double angB = calcularAngulo(a, c, b);
                double angC = calcularAngulo(a, b, c);

                System.out.println("Ángulo A: " + angA + "°");
                System.out.println("Ángulo B: " + angB + "°");
                System.out.println("Ángulo C: " + angC + "°");
                break;

            default:
                System.out.println("Tipo de triángulo no válido.");
        }

        // ---------------------------
        // 3. CÁLCULO DEL ÁREA
        // ---------------------------
        double area = (c * altura) / 2;
        System.out.println("\nÁrea del triángulo: " + area);

        input.close();
    }

    // ----------------------------------------
    // MÉTODO PARA CALCULAR UN ÁNGULO (Ley del Coseno)
    // ----------------------------------------
    public static double calcularAngulo(double lado1, double lado2, double ladoOpuesto) {

        // Fórmula: cos(A) = (b² + c² - a²) / (2bc)
        double numerador = Math.pow(lado1, 2) + Math.pow(lado2, 2) - Math.pow(ladoOpuesto, 2);
        double denominador = 2 * lado1 * lado2;

        double cosA = numerador / denominador;

        // Pasar a grados
        return Math.toDegrees(Math.acos(cosA));
    }
}
