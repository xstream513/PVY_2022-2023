package cz.educanet.pvy.basics;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello world.");
    printExtraMessage();
  }

  public static void printExtraMessage() {
    System.out.println();
    System.out.println("*".repeat(40));

    String currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    System.out.println("Today is: " + currentDate);

    DayOfWeek currentDay = LocalDateTime.now().getDayOfWeek();
    if (currentDay.equals(DayOfWeek.FRIDAY)) {
      System.out.println("Today we are learning Java.");
    } else {
      System.out.println("Today we are not learning Java.");
    }

    System.out.println("*".repeat(40));
  }

}