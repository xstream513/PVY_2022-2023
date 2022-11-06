package cz.educanet.pvy.basics;

import java.util.InputMismatchException;

public class MethodPractice {

    public static void main(String[] args) {
        String nazevDne = getDay(3);
        System.out.println(nazevDne);
        System.out.println(jeDelitelneDvema(3));
    }

    public static String getDay(Integer dayNumber) {
        if (dayNumber == 1) {
            return "Pondělí";
        } else if (dayNumber == 2) {
            return "Úterý";
        } else if (dayNumber == 3) {
            return "Středa";
        }
        throw new InputMismatchException("The day number is invalid");
    }

    public static Boolean jeDelitelneDvema(Integer num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
