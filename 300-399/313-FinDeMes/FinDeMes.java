import java.util.Scanner;

public class FinDeMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, s, c;
        
        n = sc.nextInt();
        
        for(i=0; i<n; i++){
            s = sc.nextInt();
            c = sc.nextInt();
            
            if(s + c >= 0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
    
}