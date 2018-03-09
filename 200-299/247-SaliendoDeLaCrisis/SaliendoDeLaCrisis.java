import java.util.Scanner;

public class SaliendoDeLaCrisis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n, i, x=0;
        int m1, m2;
        
        n = sc.nextShort();
        
        while(n != 0){
            x=0; 
            
            m1 = sc.nextInt();
            
            for(i=1; i<n; i++){
                m2 = sc.nextInt();
                
                if((m1 >= m2) && (x==0)){
                    x=1;
                    System.out.println("NO");
                }
                
                m1 = m2;
            }
            
            if(x==0){
                System.out.println("SI");
            }
            
            n = sc.nextShort();
        }
    }
    
}