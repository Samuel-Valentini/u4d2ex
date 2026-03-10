package ex4;

import java.util.Scanner;

public class Ex4 {
    static void main(String[] args) {

        Scanner launcher = new Scanner(System.in);
        System.out.println("Inserire i secondi per il conto alla rovescia");
        System.out.println(countdown(Integer.parseInt(launcher.nextLine())));

    }

    static int numberValidator(int num) {
        return Math.min(Math.abs(num), 20);
    }

    static String countdown(int num) {
        num = numberValidator(num);
        StringBuilder result = new StringBuilder();
        for (int i = num; i > 0; i--) {
            result.append("[").append(i % 2 == 0 ? "OK" : "CHECK").append("] Secondo ").append(i).append("\n");
            if (i == 10) {
                result.append("--- SEPARAZIONE STADIO ---\n");
            }
        }
        result.append("--- IGNITION ---\n");
        return result.toString();
    }
}
