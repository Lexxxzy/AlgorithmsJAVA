/*
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
*/
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
  public static String createPhoneNumber(int[] numbers) {
      StringBuilder sb = new StringBuilder();
      for (int element: numbers)
        sb.append(element);
    
      String number = String.valueOf(sb);
      
     return "(" + number.substring(0,3) +  ") "
      + number.substring(3, 6) + "-"
      + number.substring(6);
}

}
