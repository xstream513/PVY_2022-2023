package cz.educanet.pvy.basics;

public class AgeVerification {

    public static void main(String[] args) {
        validateAge(40);
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
