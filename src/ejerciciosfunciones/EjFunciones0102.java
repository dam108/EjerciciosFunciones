package ejerciciosfunciones;
import java.util.Scanner;
public class EjFunciones0102 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int dia, mes, year;
        
        System.out.println("Introduce un año: ");
        year = teclado.nextInt();
        System.out.println("Introduce un mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce un dia: ");
        dia = teclado.nextInt();
        
        int calculoDias = calcularDias(year, mes, dia);

        System.out.println("Han pasado "+calculoDias+" desde el 1/1/"+year+" hasta "+dia+"/"+mes+"/"+year);
        
        //hacer un programa que nos informe de los dias desde el 1 de enero hasta el dia introducido

    }
    
    public static int calcularDias(int yy, int mm, int dd){
        int acumuladorDias = 0, totalDias;
        for (int i = 1 ; i < mm ; i++){
            
            acumuladorDias += CalcularDiasMes(i, yy);
            
        }
        
        totalDias = acumuladorDias + dd;

        return totalDias;
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