package esercizio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 String num;

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Inserisci un numero da 0 - 3");
	        num = scanner.nextLine();
	        scanner.close();

	        switch (num) {
	        case "0":
	            System.out.println("Hai zero €");
	            break;
	        case "1":
	            System.out.println("Hai uno €");
	            break;
	        case "2":
	            System.out.println("Hai due €");
	            break;
	        case "3":
	            System.out.println("Hai tre €");
	            break;
	        default:
	            System.err.println("Errore, input non valido.");

	        }

	}

}
