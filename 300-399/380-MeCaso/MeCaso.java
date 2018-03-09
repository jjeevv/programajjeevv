import java.util.Scanner;

public class MeCaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, total;
        
        n = sc.nextInt();
        
        while(n != 0){
            total = 0;
            
            for(i=0; i<n; i++){
                 
                total = total + sc.nextInt();
            }
            
            System.out.println(total);
            
            n = sc.nextInt();
        }
    }
    
}