package ejerciciosfunciones;
import java.util.Scanner;
public class EjFunciones0108 {
   // public static Scanner teclado = new Scanner(System.in); // si se usa de forma global
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // si se usa en el main
        int num1, num2;
        
        System.out.println("Introduce un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce un numero: ");
        num2 = teclado.nextInt();
        
        if( cantidadDivisores(num1) == cantidadDivisores(num2) ){
            System.out.println("Tienen los mismos divisores.");
        }
        else {
            if ( cantidadDivisores(num1) > cantidadDivisores(num2)  ){
                System.out.println("El numero "+num1+ " tiene mas divisores que "+num2);
            }
            else System.out.println("El numero "+num2+ " tiene mas divisores que "+num1);
        }

    }
    
    public static int cantidadDivisores(int nn){
        int contador = 0;
        
        // crear bucle para sacar los divisores de un numero 
        // bucle sera desde 1 a la mitad del numero 
        for (int i = 1; i <= (nn /2); i++){
            if (nn % i == 0){
                contador++;
            }
        }
        return contador + 1;
    }
    
}