import java.util.Scanner;

public class ladoCalle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short num;
        
        num = sc.nextShort();
        
        while(num != 0){
            if(num%2 == 0){
                System.out.println("DERECHA");
            }else{
                System.out.println("IZQUIERDA");
            }
            
            num = sc.nextShort();
        }
    }
}