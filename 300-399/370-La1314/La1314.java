import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema370 {

	static final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	static int ladoIzquierdo;
	static int ladoDerecho;

	public static int[] integerSplit(String split) {

		int ladoIzquierdo = 0;
		int ladoDerecho = 0;

		int i = 0;
		while (split.charAt(i) != '-') {
			int num = split.charAt(i) - '0';
			ladoIzquierdo = ladoIzquierdo * 10 + num;
			i++;
		}

		i++;
		while (i < split.length()) {
			int num = split.charAt(i) - '0';
			ladoDerecho = ladoDerecho * 10 + num;
			i++;
		}

		return new int[] { ladoIzquierdo, ladoDerecho };
	}

	public static int integer(String entrada) {

		int numInteger = 0;

		int i = 0;
		while (i < entrada.length()) {
			int num = entrada.charAt(i) - '0';
			numInteger = numInteger * 10 + num;
			i++;
		}

		return numInteger;
	}

	public static void main(String[] args) throws IOException {

		int casos = integer(entrada.readLine());

		for (int i = 0; i < casos; i++) {

			String llave = entrada.readLine();

			int numeros[] = integerSplit(llave);

			ladoIzquierdo = numeros[0];
			ladoDerecho = numeros[1];

			if (ladoDerecho < ladoIzquierdo) {
				int aux = ladoDerecho;
				ladoDerecho = ladoIzquierdo;
				ladoIzquierdo = aux;
			}

			if (ladoIzquierdo % 2 == 0 && (ladoIzquierdo + 1) == ladoDerecho) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}

		}
		entrada.close();
	}
}