package ejerciciosfunciones;
import java.util.Scanner;
public class EjFunciones0102 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int dia, mes, year;
        int acumuladorDias = 0, totalDias = 0;
        System.out.println("Introduce un año: ");
        year = teclado.nextInt();
        System.out.println("Introduce un mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce un dia: ");
        dia = teclado.nextInt();
        
        for (int i = 1 ; i < mes ; i++){
            
            
            acumuladorDias += CalcularDiasMes(i, year);
            
        }
        
        totalDias = acumuladorDias + dia;
        System.out.println("Han pasado "+totalDias+" desde el 1/1/"+year+" hasta "+dia+"/"+mes+"/"+year);
        
        //hacer un programa que nos informe de los dias desde el 1 de enero hasta el dia introducido

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