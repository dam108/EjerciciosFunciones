package ejerciciosfunciones;
import java.util.Scanner;
public class EjFunciones0105 {
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        long factorial = 1;
        long num = pedirNum();

        while ( num > 1 && num <=100){
            System.out.println("El factorial de "+num+" es: "+calcularFactorial(num));
            factorial = 1;
            num = pedirNum();
        }

    }
    
    public static long pedirNum(){
        System.out.println("Introduce un numero. ( menor que 1 o mayor que 100 para terminar): ");
        return teclado.nextLong();
    }
    
    public static long calcularFactorial(long nn){
        long totalFactorial = 1;
        for ( int i = 1 ; i <= nn; i++){
            totalFactorial *= i;
           // System.out.println("i"+i);
           // System.out.println("f"+totalFactorial);
        }
        return totalFactorial;
    }

}