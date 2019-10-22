package ejerciciosfunciones;
//import java.util.Scanner;
public class EjFunciones0107 {
   // public static Scanner teclado = new Scanner(System.in); // si se usa de forma global
    public static int min = 1;
    public static int max = 1000;
    
    public static void main(String[] args) {
        // Scanner teclado = new Scanner(System.in); // si se usa en el main
        int totalSuma = sumarPrimos(min, max);
        System.out.println( "la suma de todos los numeros primos comprendidos estre " +min+ " y " +max+ " es: " +totalSuma);
    }
    
    public static int sumarPrimos(int min, int max){
        int acumulador = 0;
        for (int i=3 ; i <= 1000; i+=2){ // bucle de numeros impares desde el 3 al 1000 
            boolean primo = true; // inicializamos la variable primo como verdadera
            int contador = 2; // incializamos un contador en 2
            while( primo && contador < i){ // mientras primo sea verdadero y el contador no pase de el numero en el que estamos en cada momento
               if ( i % contador == 0){ // comprobamos si el el numero entre el contador nos da resto 0
                    primo = false; // en este caso no es un numero primo
                }
                else {
                   contador++; // en caso de que el resto no sea cero aumentamos el contador en uno 
                }
            } // el bucle while se repite hasta comprobar todos los restos de cada numero
            if (primo){
                acumulador +=i;
               // System.out.println(i + " Es un numero primo"); // y si es primo imprimimos el numero en pantalla
            }
        }
        return acumulador + 2;// se le suma dos por que el 2 es primo pero no estaba dentro del bucle  por que el bucle empezaba en 3
    }
    
}