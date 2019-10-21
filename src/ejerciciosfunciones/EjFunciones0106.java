package ejerciciosfunciones;
import java.util.Scanner;
public class EjFunciones0106 {
   // public static Scanner teclado = new Scanner(System.in); // si se usa de forma global
    
    public static void main(String[] args) {
        int divisores, num;
        Scanner teclado = new Scanner(System.in); // si se usa en el main
        
        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();
        
        divisores =  cantidadDivisores(num);
        
        if ( num < 0 ){
            divisores = 0;// mostras cero si el numero introducido es negativo
            System.out.println("el numero "+num+" tiene "+divisores+" divisores"); 
        }
        else {
           System.out.println("el numero "+num+" tiene "+divisores+" divisores"); 
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