import java.util.Scanner;

public class ExerciseEstacionamiento {
    public static void main(String[] args) {
        // repetitivas, varios clientes
        Scanner sc = new Scanner(System.in);
        String patente="";
        int tipoServicio, cantHoras;
        double total, totalDia=0;
        // cambio de tipo por la comparacion entre string e int
        // Acumuladores: permiten en cada vuelta acumular valores
        int cont1 = 0, cont2=0, cont3=0;

        while(!patente.equalsIgnoreCase("fin")){
            System.out.println("Ingrese la patente de su vehiculo");
            patente = sc.nextLine();
            if (!patente.equalsIgnoreCase("fin")){
                System.out.println("Ingrese el tipo de servicio\n");
                System.out.println("1 - Por hora");
                System.out.println("2 - Media jornada (5 horas)");
                System.out.println("3 - Jornada completa (Hasta 10 horas)");
                sc = new Scanner(System.in); //No quedan valores anteriores, por el tema del string
                tipoServicio = sc.nextInt();

                if (tipoServicio>3 || tipoServicio<=0){
                    System.out.println("No ingreso un tipo de servicio correcto.");
                } else {
                    if(tipoServicio == 1){
                        System.out.println("Ingrese la cantidad de horas que desea estacionar: ");
                        cantHoras = sc.nextInt();
                        total = cantHoras * 3;
                        cont1++;
                        totalDia = totalDia+total;
                        System.out.println("El total de estacionamiento es de: " + total);
                    } else {
                        if(tipoServicio==2){
                            System.out.println("El servicio de media jornada corresponde a 5 hs y posee un descuento de 5%");
                            total = 15-(15 * 0.05);
                            cont2++;
                            totalDia = totalDia+total;
                            System.out.println("El total de su estacionamiento es: " + total);
                        } else {
                            System.out.println("El servicio de jornada completa corresponde a 10 hr y posee un descuento de 15%");
                            total = 30-(30*0.10);
                            cont3++;
                            totalDia = totalDia+total;
                            System.out.println("EL total de su estacionamiento es de: " + total);
                        }
                    }
                    System.out.println("Muchas gracias por su compra!!");
                    sc = new Scanner(System.in);
                }
            }

            System.out.println("***********");
            System.out.println("Total monetario del día: ");
            System.out.println("Cantidad servicios por hora: " + cont1);
            System.out.println("Cantidad servicios por media jornada: " + cont2);
            System.out.println("Cantidad servicios de jornada completa: " + cont3);
            System.out.println("El monto total recaudado del día es de: $" + totalDia + "USD");
        }

        sc.close();
    }
}
