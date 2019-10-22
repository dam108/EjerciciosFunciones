package ejerciciosfunciones;
import java.util.Scanner;
public class EjFunciones0104 {
    public static void main(String[] args) {
        int dia1, dia2, mes1, mes2, year, dias1, dias2;
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
        
        dias1 = calcularDias(year, mes1, dia1);
        System.out.println(dias1);
        dias2 = calcularDias(year, mes2, dia2);
        System.out.println(dias2);
        
        int resta = Math.abs(dias1 - dias2);
        
        System.out.println("La Diferencia entre fechas es de : "+resta+" dias");
        

    }
    
    public static int calcularDias(int yy, int mm, int dd){
        int acumuladorDias = 0, totalDias;
        for (int i = 1 ; i < mm ; i++){
            
            acumuladorDias += CalcularDiasMes(i, yy);
            
        }
        
        totalDias = acumuladorDias + dd;

        return totalDias;
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
