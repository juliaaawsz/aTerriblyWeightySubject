package org.example;

public class Converter {
  public static String toPounds(int ounces){
    double pounds = ounces/16.0;
    return String.format("%.4f lbs", pounds);
  }
  public static String toPoundsAndOunces(int ounces){
    int pounds = ounces/16;
    int remainder = ounces%16;
    return pounds+"lbs "+remainder+"oz.";
  }

  
}
