import java.util.Scanner;

public class Huevos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	short h, c;
	float t;

	h = sc.nextShort();
	c = sc.nextShort();

	while(h != 0 && c != 0){
            t = (float) h / c;

            if(t > (short)h/c){
	        t = t + 1;
	    }

            System.out.println((short)t * 10);

            h = sc.nextShort();
	    c = sc.nextShort();
	}
    }
}