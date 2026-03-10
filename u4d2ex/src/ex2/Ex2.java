package ex2;

import java.util.Scanner;

public class Ex2 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero da 0 a 3");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(letterNotation0to3(num));

    }

    static String letterNotation0to3(int n) {
        return switch (n) {
            case 0 -> "zero";
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "numero fuori range";
        };

    }
}
