package ape_semana4_soluciones;
import java.util.Scanner;
public class pagoPrestamo_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double montoPrestamo;
        double interesMensual;
        double pagoMensual;
        System.out.println("Ingrese el monto del prestamo");
        montoPrestamo = teclado.nextDouble();
        System.out.println("Ingrese interes mesual");
        interesMensual = teclado.nextDouble();
        pagoMensual = (montoPrestamo/12) + (interesMensual);
        System.out.println("El pago mensual del prestamo va a ser: " + pagoMensual);
    }   
}
