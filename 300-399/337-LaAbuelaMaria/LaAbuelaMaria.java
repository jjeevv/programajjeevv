import java.util.Scanner;

public class Abuela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up[] = new int[6];
        int down[] = new int[6];
        int i, j, n, x;
        
        n = sc.nextInt();
        
        for(i=0; i<n; i++){
            x=0;
            
            for(j=0; j<6; j++){
                up[j] = sc.nextInt();
            }
            
            for(j=0; j<6; j++){
                down[j] = sc.nextInt();
            }
            
            for(j=0; j<6; j++){
                if((up[0] + down[0]) != up[j] + down[j]){
                    x = 1;
                    break;
                }
            }
            
            if(x==0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}