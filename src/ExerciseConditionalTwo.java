import java.util.Scanner;

public class ExerciseConditionalTwo {
    public static void main(String[] args) {

        int cantPackaje;
        double pricePackaje, discount, totalConDiscount, discountTwo, resultOperationtree;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de paquete por venta: ");
        cantPackaje = sc.nextInt();

        if(cantPackaje < 5){
            if (cantPackaje < 0){
                System.out.println("No se permiten compras con cantidad de paquetes negativos");
            } else {
                System.out.println("No se permiten compras minoristas (cantidad de paquetes negativos)");
            }
            // return true
        } else {
            System.out.println("Ingresa el precio del packaje");
            sc = new Scanner(System.in); // porque se utiliza int y double
            pricePackaje = sc.nextDouble();

            if (cantPackaje >= 5 && cantPackaje <= 15 ){
                System.out.println("El costo de envio es de $10 usd");
                pricePackaje = pricePackaje + 10;
            } else {
                System.out.println("El envio es gratuito");
            }

            if (pricePackaje < 100){
                // el total
                double resultRest = 100 - pricePackaje; // cuanto necesita para alcanzar la promocion
                System.out.printf("Para cumplir la promocion faltan: \n$ %.2f USD para entrar a la promocion\n", resultRest);
            } else {
                if (pricePackaje >= 100  && pricePackaje <= 300){
                    System.out.println("Posees un descuento del 5%");
                    discount = pricePackaje * 0.05;
                    totalConDiscount = pricePackaje - discount ;
                    System.out.printf("El descuento es: $ %.2f USD\n", discount);
                    System.out.printf("El total es: $ %.2f USD\n", totalConDiscount);
                } else {
                    if (pricePackaje > 300){
                        System.out.println("Posee un descuento de 10%");
                        //el descuento
                        discountTwo = pricePackaje * 0.10;
                        // el total
                        resultOperationtree = pricePackaje - discountTwo ;
                        System.out.printf("El descuento: $ %.2f USD\n", discountTwo);
                        System.out.printf("El total: $ %.2f USD\n", resultOperationtree);
                    } else {
                        System.out.println("el valor es incorrecto");
                    }
                }
            }

        }


        sc.close();
    }
}
