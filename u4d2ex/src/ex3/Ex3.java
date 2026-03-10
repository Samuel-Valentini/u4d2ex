package ex3;

import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci una stringa per dividerla in caratteri, quando vuoi uscire digita :q");
            String str = scanner.nextLine();
            if (":q".equals(str)) break;
            System.out.println(printChar(stringDivider(str)));
        }


    }

    static char[] stringDivider(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;

    }

    static String printChar(char[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i != (arr.length - 1)) {
                result.append(arr[i]).append(", ");
            } else {
                result.append(arr[i]);
            }
        }
        return result.toString();
    }
}
