import java.util.Scanner;

public class Ascensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        short st, ini=0, end=0;
        
        st = sc.nextShort();
        
        while(st >= 0){
            ini = st;
            total = 0;
            
            end = sc.nextShort();
            
            while(end >= 0){
                if(ini > end){
                    total = total + (ini-end);
                }else{
                    total = total + (end-ini);
                }
                
                ini = end;
                end = sc.nextShort();
                
            }
            
            System.out.println(total);
            
            st = sc.nextShort();
        }
    }
    
}