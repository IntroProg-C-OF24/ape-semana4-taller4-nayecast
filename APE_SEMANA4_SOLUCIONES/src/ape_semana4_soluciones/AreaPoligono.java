package ape_semana4_soluciones;
import java.util.Scanner;
public class AreaPoligono { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ladoCuadrado;
        double alturaTriangulo;
        double areaTotal;
        System.out.println("Ingresar lado del cuadrado");
        ladoCuadrado = teclado.nextDouble();
        System.out.println("Ingresar alturaTrianngulo");
        alturaTriangulo = teclado.nextDouble();
        areaTotal = (Math.pow(ladoCuadrado, 2)) +  (ladoCuadrado * alturaTriangulo) + ((ladoCuadrado * alturaTriangulo)/2)*3;
        System.out.println("El area del poligono es: " + areaTotal);   
    } 
}
