
import java.util.*;
public class Strings {
  public static void printLetters(String str) {
    for(int i = 0; i<str.length(); i++) {
      System.out.print(str.charAt(i)+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    char arr[] = {'a','b', 'c', 'd'};
    String str = "abcd";
    String str2 =  new String("xyz");

    //* Strings are IMMUTABLE
    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();
    // System.out.println(name);

    // String fullName = "tony stark";
    // System.out.println(fullName.length());

    //* concatenatioin 
    String firstName = "Vishal";
    String lastName = "Singh";
    String fullName = firstName + " "+lastName;
    printLetters(fullName);
  }
}
