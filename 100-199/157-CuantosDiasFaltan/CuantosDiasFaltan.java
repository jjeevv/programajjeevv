/**
 *
 * Programa: Cuantos dias faltan
 *
 */

package diasfaltancorrecto;

import java.util.Scanner;

/**
 *
 * @author Jose Espinosa Vazquez
 *
 */

public class DiasFaltanCorrecto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int a = 0; a < n; a++){
        
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            int muestra = 0;
            
            int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            
            for (int i = mes - 1; i < meses.length; i++){
                
                muestra = muestra + meses[i];
                
            }
            
            muestra -= dia;
            System.out.println(muestra);
            
        }

        
    }
    
}