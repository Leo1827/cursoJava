public class ExerciseForMerryCristmas {
    public static void main(String[] args) {

        int altura = 10;

        // Parte superior columnas, indices
        for (int f=0;f<altura;f++){
            // Clase de java para construir cadenas de texto
            StringBuilder linea = new StringBuilder();

            // imprime los espacios de la izquierda
            for (int esp=0;esp<altura - f -1;esp++){
                linea.append(" ");
            }
            for (int esd=0;esd<(2*f+1);esd++){
                linea.append("*");
            }

            System.out.println(linea);
        }

        // tronco de arbol
        for (int f=0;f<2;f++){// dos lines de tronco
            StringBuilder tronco = new StringBuilder();

            for (int esp=0;esp<altura - 1;esp++){
                tronco.append(" ");
            }
            tronco.append("|");
        }

        System.out.println("\n¡Feliz navidad");
    }


}
