import java.util.Scanner;

public class ContandoEnLaArena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n, i;
        
        n = sc.nextShort();
        
        while(n != 0){
            for(i=0; i<n; i++){
                System.out.print("1");
            }
            System.out.println();
            
            n = sc.nextShort();
        }
    }
    
}