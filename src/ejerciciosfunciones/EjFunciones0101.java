package ejerciciosfunciones;
import java.util.Scanner;
public class EjFunciones0101 {
    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        char opcion; // si pido caracteres a, b, c, d casca el programa
 
        do{
          opcion = pedirOpcion();
          switch (opcion){
            case 'a':
                double radio = pedirRadio();
                System.out.println("El area del circulo es : "+areaCirculo(radio));System.out.println("\n"); break;
            case 'b':
                int lado = pedirLado();
                System.out.println("El area del cuadrado es: "+areaCuadrado(lado));System.out.println("\n"); break;
            case 'c':
                double base = pedirBase();
                double altura = pedirAltura();
                System.out.println("El area del triangulo es "+areaTriangulo(base, altura));System.out.println("\n"); break;
          }
  
        } while(opcion != 'd');
        
    }
    
    private static char pedirOpcion(){
        System.out.println("Opcion 1 : Calcular el area de un circulo");
        System.out.println("Opcion 2 : Calcular el area de un cuadrado");
        System.out.println("Opcion 3 : Calcular el area de un triangulo");
        System.out.println("Opcion 4 : salir del programa");
        char r = teclado.nextLine().charAt(0);
        return r;
    }
    
    private static double pedirRadio(){
        System.out.println("Introduce el radio de un circulo: ");
        double n = teclado.nextDouble();
        teclado.nextLine();
        return n;
    }
    
    private static double areaCirculo(double r){
        double area = Math.PI * (r * r);
        return area;
    }
    
    private static int pedirLado(){
        System.out.println("Introduce el lado del cuadrado: ");
        int n = teclado.nextInt();
        teclado.nextLine();
        return n;
    }
    
    private static int areaCuadrado(int lado){
        return lado*lado;
    }
    
    private static double pedirBase(){
        System.out.println("Introduce la base del triangulo");
        double n = teclado.nextDouble();
        teclado.nextLine();
        return n;
    }
    
    private static double pedirAltura(){
        System.out.println("Introduce la altura del triangulo");
        double n = teclado.nextDouble();
        teclado.nextLine();
        return n;
    }
    
    private static double areaTriangulo(double bb, double aa){
        return ( bb * aa )/2;
    }
}