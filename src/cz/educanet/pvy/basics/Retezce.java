package cz.educanet.pvy.basics;

import java.util.Locale;

public class Retezce {

    public static void main(String[] args) {
        String str = "Ahoj, ";
        String str2 = "Dnes je ";
        String spojeni = str + str2;
        System.out.println(spojeni);
        System.out.println(spojeni.toUpperCase());
        System.out.println(spojeni.toLowerCase());
        String patek = "Pátek";
        String vypis = patek.substring(2,3);
        String prvniZnak = String.valueOf(patek.charAt(0));
        String posledniZnak = String.valueOf(patek.charAt(patek.length()-1));
        String prvniZnakSubstring = patek.substring(0,1);
        System.out.println(vypis);

        String a = "Pondělí";
        String b = "Pátek";
        boolean c = a.equals(b);



        char ch = 'A';
        String s = String.valueOf(ch);

        StringBuilder sb = new StringBuilder();

    }

}
