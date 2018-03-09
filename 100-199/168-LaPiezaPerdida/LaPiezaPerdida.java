import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema168 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		int cantidad = Integer.parseInt(teclado.readLine());

		while (cantidad > 0) {

			int piezas[] = new int[cantidad];

			String partes[] = teclado.readLine().split(" ");

			for (int i = 0; i < cantidad - 1; i++) {
				int num = Integer.parseInt(partes[i]);
				piezas[num - 1] = 1;
			}

			for (int i = 0; i < cantidad; i++) {
				if (piezas[i] == 0) {
					System.out.println(i + 1);
					break;
				}
			}

			cantidad = Integer.parseInt(teclado.readLine());
		}
	}
}