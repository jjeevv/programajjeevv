import java.util.Locale;
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String[] day = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
        double[] amount = new double[6];
        double sum, max=0, min=0, average=0, n;
        short i, max_pos=0, min_pos=0;
        
        n = sc.nextDouble();
        
        while(n != -1){
            amount[0] = n;
            min = amount[0];
            min_pos = 0;
            max = amount[0];
            max_pos = 0;
            sum = amount[0];
        
            for(i=1; i<6; i++){
                amount[i] = sc.nextDouble();

                if(max < amount[i]){
                    max = amount[i];
                    max_pos = i;
                }

                if(min > amount[i]){
                    min = amount[i];
                    min_pos = i;
                }

                if(i<5){
                    sum = sum + amount[i];
                }
            }

            average = sum/5;

            if(max == min){
                System.out.println("EMPATE");
            }else{
                System.out.print(day[max_pos] + " " + day[min_pos] + " ");

                if(average < amount[5]){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }
            }
            
            n = sc.nextDouble();
        }
        
    }
    
}