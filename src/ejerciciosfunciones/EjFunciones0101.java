package ejerciciosfunciones;
import java.util.Scanner;
public class EjFunciones0101 {
    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion; // si pido caracteres a, b, c, d casca el programa
 
        do{
          opcion = pedirOpcion();
          switch (opcion){
            case 1:
                double radio = pedirRadio();
                System.out.println("El area del circulo es : "+areaCirculo(radio));System.out.println("\n"); break;
            case 2:
                int lado = pedirLado();
                System.out.println("El area del cuadrado es: "+areaCuadrado(lado));System.out.println("\n"); break;
            case 3:
                double base = pedirBase();
                double altura = pedirAltura();
                System.out.println("El area del triangulo es "+areaTriangulo(base, altura));System.out.println("\n"); break;
          }
  
        } while(opcion != 4);
        
    }
    
    private static int pedirOpcion(){
        System.out.println("Opcion 1 : Calcular el area de un circulo");
        System.out.println("Opcion 2 : Calcular el area de un cuadrado");
        System.out.println("Opcion 3 : Calcular el area de un triangulo");
        System.out.println("Opcion 4 : salir del programa");
        return teclado.nextInt();
    }
    
    private static double pedirRadio(){
        System.out.println("Introduce el radio de un circulo: ");
        return teclado.nextDouble();
    }
    
    private static double areaCirculo(double r){
        double area = Math.PI * (r * r);
        return area;
    }
    
    private static int pedirLado(){
        System.out.println("Introduce el lado del cuadrado: ");
        return teclado.nextInt();
    }
    
    private static int areaCuadrado(int lado){
        return lado*lado;
    }
    
    private static double pedirBase(){
        System.out.println("Introduce la base del triangulo");
        return teclado.nextDouble();
    }
    
    private static double pedirAltura(){
        System.out.println("Introduce la altura del triangulo");
        return teclado.nextDouble();
    }
    
    private static double areaTriangulo(double bb, double aa){
        return ( bb * aa )/2;
    }
}