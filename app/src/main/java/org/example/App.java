package org.example;
import java.util.Scanner;
public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Ounce Conversion Program!\n");
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many oz do you have?");
    int ounces = scanner.nextInt();
    System.out.println("Converting oz to lbs!");
    System.out.println(Converter.toPoundsAndOunces(ounces));
    System.out.println(Converter.toPounds(ounces));
    System.out.println("Thank you for using the Ounce Conversion Program!");
    scanner.close();
  }
}
