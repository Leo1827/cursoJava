public class ArrayErrorDesbordamiento {
    public static void main(String[] args) {
        // Cuando queremos acceder a una posicion de nuestro vector que no esta contemplada
        int vector [] = new int [3];
        vector[0]= 1;
        vector[1]= 2;
        vector[2] = 3;
        // primer caso de desbordamiento
        System.out.println("Elvalor de la 3ra posiciones: " + vector[3]);
        //
        for(int i=0; i<4;i++){//posicion no existe
            System.out.println("Valor: " + vector[i]);
        }
    }
}
