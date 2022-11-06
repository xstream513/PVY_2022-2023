package cz.educanet.pvy.basics;

public class AgeVerification {

    public static void main(String[] args) {
        validateAge(40);
        String ageValidation = validateAgeWithReturn(50);
        System.out.println(ageValidation);
    }

    public static String validateAgeWithReturn(int vek) {
        if (vek >= 18 && vek <= 130) {
            return "Osoba je plnoletá";
        } else if (vek > 130) {
            return "Věk je neplatný";
        } else {
            return "Osoba není plnoletá";
        }
    }

    public static void validateAge(int vek) {
        if (vek >= 18 && vek <= 130) {
            System.out.println("Osoba je plnoletá");
        } else if (vek > 130) {
            System.out.println("Věk je neplatný");
        } else {
            System.out.println("Osoba není plnoletá");
        }
    }
}
