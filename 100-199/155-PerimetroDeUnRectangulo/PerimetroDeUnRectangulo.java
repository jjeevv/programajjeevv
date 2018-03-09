import java.util.Scanner;

public class Perimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        
        while((n1 >= 0) && (n2 >= 0)){
            System.out.println((n1*2) + (n2*2));
            
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        }
    }
}