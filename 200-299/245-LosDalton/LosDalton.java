import java.util.Scanner;

public class Problema245 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		long dalton1, dalton2;

		boolean dalton, ascendiente, descendiente;

		int casos = entrada.nextInt();

		while (casos > 0) {

			dalton1 = entrada.nextLong();
			dalton2 = entrada.nextLong();

			dalton = true;
			ascendiente = false;
			descendiente = false;

			if (dalton1 < dalton2) {
				ascendiente = true;
			} else if (dalton1 > dalton2) {
				descendiente = true;
			} else {
				dalton = false;
			}

			for (int i = 2; i < casos; i++) {

				dalton1 = dalton2;
				dalton2 = entrada.nextLong();

				if (dalton2 >= dalton1 && descendiente || dalton2 <= dalton1 && ascendiente) {
					dalton = false;
				}

			}

			if (dalton) {
				System.out.println("DALTON");
			} else {
				System.out.println("DESCONOCIDOS");
			}

			casos = entrada.nextInt();
		}

	}
}