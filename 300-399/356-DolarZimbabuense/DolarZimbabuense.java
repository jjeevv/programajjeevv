import java.util.Scanner;

public class Zimbabuense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, n;
        long num[] = new long[3];
        long aux;
        
        n = sc.nextInt();
        
        for(i=0; i<n; i++){
            num[0] = sc.nextLong();
            num[1] = sc.nextLong();
            num[2] = sc.nextLong();
            
            for(j=0; j<num.length-1; j++){
                for(k=0; k<num.length-j-1; k++){
                    if(num[k+1] < num[k]){
                        aux = num[k+1];
                        num[k+1] = num[k];
                        num[k] = aux;
                    }
                }
            }
            
            System.out.println(num[0] + " " + num[1] + " " + num[2]);
        }
    }
    
}