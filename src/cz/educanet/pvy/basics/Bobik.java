package cz.educanet.pvy.basics;

public class Bobik {

    public static void main(String[] args) {
        mojePrvniMetoda();

        BasicMethods.ahoj();

        long cisloLong = Long.MAX_VALUE;
        Long cisloLong2 = Long.parseLong("31");

        double cislo2 = 3.0;

        boolean boolTrue = true;
        boolean boolFalse = false;

        char character = 'Y';

        Integer cisloInt = 5;
        Boolean boolCLass = true;
        Character ch = 'A';

        mojePrvniMetoda();
    }

    public static void mojePrvniMetoda() {
        System.out.println("Ahoj světe, učím se Javu.");
        System.out.println("Dnes je pátek.");
        System.out.println("Jsme ve škole.");
    }

}
