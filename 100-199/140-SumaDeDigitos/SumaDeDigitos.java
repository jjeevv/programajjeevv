import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumaDigitos {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        String number;
        int[] n;
        int i, sum;
        
        do{
            number = br.readLine();
            
            if(Integer.parseInt(number) > -1){
                n = new int[number.length()];
                sum=0;

                for(i=0; i<number.length(); i++){
                    n[i] = Character.getNumericValue(number.charAt(i));
                    System.out.print(n[i]);
                    sum = sum + n[i];

                    if(i == n.length - 1){
                        System.out.print(" = ");
                    }else{
                        System.out.print(" + ");
                    }
                }

                System.out.println(sum);
            }
            
        }while(Integer.parseInt(number) > -1);
    }
    
}