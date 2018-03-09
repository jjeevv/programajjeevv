import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palabras {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        String word = "";
        int i, n;
        
        n = Integer.parseInt(br.readLine());
        
        for(i=0; i<n; i++){
            word = br.readLine();
            
            if((word.indexOf("a") != -1) && (word.indexOf("e") != -1) && (word.indexOf("i") != -1) && (word.indexOf("o") != -1) && (word.indexOf("u") != -1)){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}