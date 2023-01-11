package esercizio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("inserisci un numero intero");
            int num = Integer.valueOf(scanner.nextLine());
        scanner.close();

        System.out.println("Ecco il conto alla rovescia:");
        for (int i = num; i>=0; i--) {
            System.out.println(i);
        }
    }
}
