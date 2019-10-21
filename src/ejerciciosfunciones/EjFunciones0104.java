package ejerciciosfunciones;
import java.util.Scanner;
public class EjFunciones0104 {
    public static void main(String[] args) {
        int dia1, dia2, mes1, mes2, year, totalDias = 0, diasSueltosMes1, diasSueltosMes2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("introduce el dia de la primera fecha: ");
        dia1 = teclado.nextInt();
        System.out.println("introduce el mes de la primera fecha: ");
        mes1 = teclado.nextInt();
        
        System.out.println("introduce el dia de la segunda fecha: ");
        dia2 = teclado.nextInt();
        System.out.println("introduce el mes de la segunda fecha: ");
        mes2 = teclado.nextInt();
        System.out.println("introduce el año: ");
        year = teclado.nextInt();
        
        if (mes2 == mes1 + 1){ 
            // hacer esto en una funcion
           diasSueltosMes1 = CalcularDiasMes (mes1, year) - dia1;
            System.out.println(diasSueltosMes1);
           diasSueltosMes2 = dia2;
           System.out.println(diasSueltosMes2);
           totalDias = diasSueltosMes1 + diasSueltosMes2;
        }
        else { // si no son consecutivos y son direntes 
           if ( mes1 != mes2){ //
               for (int i = mes1 + 1; i < mes2; i++){
                   
                   totalDias += CalcularDiasMes (i, year);
               }
               diasSueltosMes1 = CalcularDiasMes (mes1, year) - dia1;
               diasSueltosMes2 = dia2;
               totalDias = totalDias + diasSueltosMes1 + diasSueltosMes2;
           } 
           else {
               totalDias = dia2 - dia1;
           }
        }
        System.out.println("Dias entre fechas: "+totalDias);

    }
    
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
