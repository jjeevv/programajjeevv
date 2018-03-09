import java.util.Scanner;

public class Hyperpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, l, i, d, x=0;
        String numb;
        
        number = sc.nextInt();
        
        while(number >= 0){
            x=0;
           
            numb = String.valueOf(number);
            
            for(i=numb.length()-1; i>=0; i--){
                d = number/(int)Math.pow(10, i);
                
                if(d%2 != 0){
                    x=1;
                    break;
                }
            }
            
            if(x==0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            
            number = sc.nextInt();
        }
    }
    
}