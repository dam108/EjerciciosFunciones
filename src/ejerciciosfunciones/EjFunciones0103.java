package ejerciciosfunciones;
import java.util.Scanner;
public class EjFunciones0103 {
    public static void main(String[] args) {
        int dia, mes, year, acumuladorDiaSemana, acumuladorDias = 0, totalDias;
        Scanner teclado = new Scanner(System.in);
        // pedir fecha
        // pedir dia de la semana de el 1 de enero de ese año 
        // calcular el dia de la semana de la fecha introducida
        
        System.out.println("intoduce un dia: ");
        dia = teclado.nextInt();
        System.out.println("intoduce un mes: ");
        mes = teclado.nextInt();
        System.out.println("intoduce un año: ");
        year = teclado.nextInt();
        System.out.println("intoduce que dia de la semana era el 1 de enero de este año (utiliza numeros del 1 al 7): ");
        acumuladorDiaSemana = teclado.nextInt();
        
        for ( int i =  1; i < mes; i++){
            acumuladorDias += CalcularDiasMes(i, year); 
           // System.out.println(acumuladorDias);
        }
        totalDias = acumuladorDias + dia;
        
        // iteramos de uno en uno hasta llegar al total de los dias -1 para que no cuente el mismo dia
        for ( int i = 1; i <= totalDias - 1; i++ ){
            if (acumuladorDiaSemana < 7 ){ // si el numero es menor que 7 (domingo)
                acumuladorDiaSemana++; // avanza un dia
            }
            else acumuladorDiaSemana = 1; // si no resetea el contador
        }
        System.out.println("El dia de la semana de la fecha introducida es: "+acumuladorDiaSemana);
    }
    
    // hacer una funcion que se llame calcularDiasMes y que si le pasamos un mes y un año nos diga los dias de ese mes
    public static int CalcularDiasMes ( int m, int a ){
        
        if (m == 2 ){
            if (yearBisiesto(a)){
                return 29;
            } 
            else {
                return 28;
            }
        }
        
        if ( m == 4 || m == 6 || m == 9 || m == 11 ){
            return 30;
        }
        else {
            return 31;
        }
    }
    
    // calculamos si el año es bisiesto 
    
    public static boolean yearBisiesto(int a){
        
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
            return true;
        } 
        else {
            return false;
        }
    }
    
}