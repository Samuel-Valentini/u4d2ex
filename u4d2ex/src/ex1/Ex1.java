package ex1;

public class Ex1 {
    static void main(String[] args) {

        System.out.println("ciao è pari? " + oddEvenString("ciao"));
        System.out.println("bau è pari? " + oddEvenString("bau"));

        System.out.println("2000 è bisestile? " + leapYear(2000));
        System.out.println("2300 è bisestile? " + leapYear(2300));
        System.out.println("2026 è bisestile? " + leapYear(2026));
        System.out.println("2028 è bisestile? " + leapYear(2028));
    }

    static boolean oddEvenString(String str) {
        return str.length() % 2 == 0;
    }

    static boolean leapYear(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return year % 4 == 0;
        }
    }


}
