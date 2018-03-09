import java.util.Scanner;

public class Navidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        short n, i, d, m;
        
        n = sc.nextShort();
        
        for(i=0; i<n; i++){
            d = sc.nextShort();
            m = sc.nextShort();
            
            if((d == 25) && (m == 12)){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
    
}