import java.util.*;
public class OddAndEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    if(num % 2 == 0) {
      System.out.println("Even number");
    } else {
      System.out.println("odd");
    }
    sc.close();
  }
}
