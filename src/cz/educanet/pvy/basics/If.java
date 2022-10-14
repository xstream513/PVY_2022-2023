package cz.educanet.pvy.basics;

public class If {

    public static void main(String[] args) {
        /*

        if ([Podmínka]) {
          [Akce]
        }

         */

        int vek = 50;

        if (vek >= 18 && vek <= 130) {
            System.out.println("Osoba je plnoletá");
        } else if (vek > 130) {
            System.out.println("Věk je neplatný");
        } else {
            System.out.println("Osoba není plnoletá");
        }

        String barvaAuta = "červená";

        if (barvaAuta.equals("modrá")) {
            System.out.println("Barva auta je modrá");
        } else if (barvaAuta.equals("zelená")) {
            System.out.println("Barva auta je zelená");
        } else if (barvaAuta.equals("fialová")) {
            System.out.println("Barva auta je fialová");
        } else {
            System.out.println("Neznám barvu už mě bolí ruce.");
        }

        String novaBarvaAuta = "černá";

        System.out.println("Barva auta je " + novaBarvaAuta);

    }

}
