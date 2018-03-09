import java.util.Scanner;

public class Problema158 {

	static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int muros = entrada.nextInt();

		for (int i = 0; i < muros; i++) {

			int saltosArriba = 0;
			int saltosAbajo = 0;

			int altura = entrada.nextInt();

			int auxAltura = entrada.nextInt();

			for (int j = 0; j < altura - 1; j++) {

				int a = entrada.nextInt();

				if (auxAltura > a) {
					saltosAbajo++;
				} else if (auxAltura < a) {
					saltosArriba++;
				}

				auxAltura = a;

			}

			System.out.println(saltosArriba + " " + saltosAbajo);

		}
		entrada.close();
	}
}