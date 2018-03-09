import java.util.Scanner;

public class Problema171 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int cimas;
		int cord;

		int casos = entrada.nextInt();
		while (casos > 0) {

			int cordillera[] = new int[casos];

			for (int i = 0; i < cordillera.length; i++) {
				cordillera[i] = entrada.nextInt();
			}

			cimas = 1;
			cord = cordillera[cordillera.length - 1];

			for (int i = cordillera.length - 2; i >= 0; i--) {

				if (cordillera[i] > cord) {
					cord = cordillera[i];
					cimas++;
				}

			}

			System.out.println(cimas);

			casos = entrada.nextInt();
		}

	}
}