public class EstructureRepetitives {
    public static void main(String[] args) {
        // permite ejecutar una cierta porcion de codigo por una determinada cantidad de veces
        // Controlador Contador
        // Controlador Centinela

        // bucle do while: se repite pero siempre la condicion se va a evaluar al final y no al principio
        // al meno unas vez se va a ejecutar y es peligroso

        int contador = 0;
        do {
            System.out.println("Estoy en la vuelta n°" + (contador+1));
            contador++;
            /* segunda opcion
            contador = contador + 1;*/
        } while (contador < 10);
 
    }
}
