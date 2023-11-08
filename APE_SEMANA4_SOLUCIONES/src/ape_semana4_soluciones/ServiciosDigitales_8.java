package ape_semana4_soluciones;

import java.util.Scanner;

public class ServiciosDigitales_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costoNetflix, costoYoutube, costoDropbox, costoSpotify;
        double serviciosDigitales;
        System.out.println("Ingrese costo de netflix ");
        costoNetflix = teclado.nextDouble();
        System.out.println("Ingrese costo Youtube");
        costoYoutube = teclado.nextDouble();
        System.out.println("Ingrese costo Dropbox");
        costoDropbox = teclado.nextDouble();
        System.out.println("Ingrese costo Spotify");
        costoSpotify = teclado.nextDouble();
        serviciosDigitales = (costoNetflix + costoYoutube + costoDropbox + costoSpotify);
        System.out.println("Ingrese edad");
        int edad = teclado.nextInt();
        if (edad <= 30) {
            serviciosDigitales *= 0.2;
            System.out.println("Descuento del 20% por ser menor de 30 años");        
        }
        System.out.println("El valor a pagarlos servicios digitales es. " + serviciosDigitales);
        
    }
    
}
