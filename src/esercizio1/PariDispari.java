package esercizio1;

public class PariDispari {

	public static void stringaPariDispari(String abc) {

		int numero = abc.length();

		if (numero % 2 == 0) {
			System.out.println(true + " la lunghezza dei caratteri è di: " + numero);
		} else {
			System.out.println(false + " la lunghezza dei caratteri è di: " + numero);
		}

	}
}
