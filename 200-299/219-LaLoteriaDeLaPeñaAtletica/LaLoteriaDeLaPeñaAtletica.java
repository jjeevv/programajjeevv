import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema219 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		int cases = Integer.parseInt(entrada.readLine());

		for (int i = 0; i < cases; i++) {

			count = 0;

			int quantity = Integer.parseInt(entrada.readLine());
			String decimos[] = entrada.readLine().split(" ");

			for (int j = 0; j < quantity; j++) {

				int num = Integer.parseInt(decimos[j]);

				if (num % 2 == 0) {
					count++;
				}
			}

			System.out.println(count);
		}
	}
}