package ape_semana4_soluciones;
import java.util.Scanner;
public class TabladeMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int tabladeMultiplicar;
        System.out.println("Ingrese un numero ente 2 y 6");
        num = teclado.nextInt();
        for (int i = 0; i <= 12; i++) {
        tabladeMultiplicar = (num * i);
        System.out.println("La tabla de multiplicar es:" + tabladeMultiplicar);
        }        
    }   
}
