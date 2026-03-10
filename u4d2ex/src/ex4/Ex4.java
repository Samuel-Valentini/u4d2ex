package ex4;

import java.util.Scanner;

public class Ex4 {
    static void main(String[] args) {

        Scanner launcher = new Scanner(System.in);
        System.out.println("Inserire i secondi per il conto alla rovescia");

        System.out.println(countdown(numberValidator(Integer.parseInt(launcher.nextLine()))));

    }

    static int numberValidator(int num) {
        num = Math.abs(num);
        if (num > 20) {
            num = 20;
        }
        return num;
    }

    static String countdown(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = num; i > 0; i--) {
            if (i % 2 == 0) {
                result.append("[OK] Secondo ").append(i).append("\n");
                if (i == 10) {
                    result.append("--- SEPARAZIONE STADIO ---\n");
                }

            } else {
                result.append("[CHECK] Secondo ").append(i).append("\n");
            }

        }
        result.append("--- IGNITION ---\n");
        return result.toString();
    }
}
