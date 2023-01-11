package esercizio1;

public class Bisestile {

	public static void verificaBisestile(int anno) {
		if (anno % 4 == 0) {
			if (anno % 100 == 0) {
				System.out.println("L'anno è 0");
			} else {
				System.out.println("L'anno è bisestile | " + true);
			}
		} else {
			System.out.println("L'anno non è bisestile | " + false);
		}
	}

}
