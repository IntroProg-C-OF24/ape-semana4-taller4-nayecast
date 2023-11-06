package ape_semana4_soluciones;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
public class PlantilladeLuz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costoPlantilla;
        double costoMinutos;
        double totalPagar;
        System.out.println("Ingrese el costo de la plantilla de luz");
        costoPlantilla = teclado.nextDouble();
        System.out.println("Ingrese el costo de los minutos utilizados");
        costoMinutos = teclado.nextDouble();
        totalPagar = costoPlantilla*costoMinutos;
        System.out.println("El costo de la plantilla a pagar es" +totalPagar);    
    }
    
}
