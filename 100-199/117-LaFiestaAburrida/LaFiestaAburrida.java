import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaFiestaAburrida {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        int n, i;
        String name, name2;
        
        n = Integer.parseInt (br.readLine());
        
        for(i=0; i<n; i++){
            name = br.readLine();
            name2 = name.substring(4);
            System.out.println("Hola, "+name2+".");
        }
    }
}