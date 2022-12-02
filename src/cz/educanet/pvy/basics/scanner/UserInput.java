package cz.educanet.pvy.basics.scanner;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Enter username and press Enter
        System.out.print("Enter username: ");
        String userName = myScanner.nextLine();

        System.out.print("Enter password: ");
        String password = myScanner.nextLine();

        if (userName.equals("admin") && password.equals("admin12345")) {
            System.out.println("User admin logged in.");
        } else {
            System.out.println("Unknown username/password combination");
        }
    }

}
