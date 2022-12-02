package cz.educanet.pvy.basics.scanner;


import cz.educanet.pvy.basics.MethodPractice;

import java.util.Scanner;

public class ScannerUsingMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte číslo k určení dělitelnosti: ");
        String cisloRetezec = sc.nextLine();
        Integer cisloInt = Integer.parseInt(cisloRetezec);
        Boolean delitelnost = MethodPractice.jeDelitelneDvema(cisloInt);

        if (delitelnost == true) {
            System.out.println("Číslo je dělitelné dvěma.");
        } else {
            System.out.println("Číslo není dělitelné dvěma.");
        }
    }
}
