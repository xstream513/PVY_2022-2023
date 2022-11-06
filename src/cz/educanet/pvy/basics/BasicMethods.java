package cz.educanet.pvy.basics;

public class BasicMethods {

    public static void main(String[] args) {
        ahoj();
        ahoj2("Michal");
        String pozdrav = ahoj3("Petr");
        System.out.println(pozdrav);

    }

    public static void ahoj() {
        System.out.println("Ahoj, jmenuji se Honza.");
    }

    public static void ahoj2(String jmeno) {
        System.out.println("Ahoj, jmenuji se " + jmeno);
    }

    public static String ahoj3(String jmeno) {
        return "Ahoj, jmenuji se " + jmeno;
    }

}
