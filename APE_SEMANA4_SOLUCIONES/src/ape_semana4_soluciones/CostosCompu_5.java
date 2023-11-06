package ape_semana4_soluciones;
import java.util.Scanner;
public class CostosCompu_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costoCPU, costoTecla, costoPant, costoRat, costoTotal;
        System.out.println("Ingrese costo del CPU");
        costoCPU = teclado.nextDouble();
        System.out.println("Ingrese costo del teclado");
        costoTecla = teclado.nextDouble();
        System.out.println("Ingrese costo de la pantalla");
        costoPant = teclado.nextDouble();
        System.out.println("Ingrese costo del raton");
        costoRat = teclado.nextDouble();
        costoTotal = costoCPU + costoTecla + costoPant + costoRat;
        System.out.println("Total a pagar de la computadora es: " + costoTotal);   
    }   
}
