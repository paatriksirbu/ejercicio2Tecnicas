import java.util.Scanner;

public class Ejercicio4 {

    public static double calcularVm(double distancia, double tiempo){
        return distancia/tiempo;
    }
    public static double calcularConsumo(double distancia, double mediaConsumo){
        return (distancia/100) * mediaConsumo;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Algoritmo para calcular la velocidad media." +
                "\nRecuerde, si quiere poner un numero que no sea entero debe usar coma ',' \n");

        System.out.println("Introduzca la distancia recorrida en km: ");
        double distancia = sc.nextDouble();

        System.out.println("Introduzca el tiempo en horas empleado en recorrer la distancia: ");
        double tiempo = sc.nextDouble();

        System.out.println("Introduzca el tiempo que ha parado en horas (en el caso de haber parado): ");
        double paradas = sc.nextDouble();

        System.out.println("Introduzca la media de consumo del vehiculo: ");
        double mediaConsumo = sc.nextDouble();

        if (paradas > 0 ){
            tiempo += paradas;
        }

        double velocidadMedia = calcularVm(distancia, tiempo);
        double consumoComb = calcularConsumo(distancia, mediaConsumo);

        System.out.printf("La velocidad media es de  %.2f km/h \n", velocidadMedia);
        System.out.printf("El consumo total del trayecto es:  %.2f litros", consumoComb);
    }

}

