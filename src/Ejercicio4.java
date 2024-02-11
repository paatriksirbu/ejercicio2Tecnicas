import java.util.Scanner;

public class Ejercicio4 {

    public static double calcularVm(double distancia, double tiempo){
        return distancia/tiempo;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Algoritmo para calcular la velocidad media." +
                "\nRecuerde, si quiere poner un numero que no sea entero debe usar coma ',' ");

        System.out.println("Introduzca la distancia recorrida en km: ");
        double distancia = sc.nextDouble();

        System.out.println("Introduzca el tiempo en horas empleado en recorrer la distancia: ");
        double tiempo = sc.nextDouble();

        System.out.println("Introduzca el tiempo que ha parado en horas (en el caso de haber parado): ");
        double paradas = sc.nextDouble();

        if (paradas > 0 ){
            tiempo += paradas;
        }

        double velocidadMedia = calcularVm(distancia, tiempo);

        System.out.println("La velocidad media es de " + velocidadMedia + "km/h");
    }

}

