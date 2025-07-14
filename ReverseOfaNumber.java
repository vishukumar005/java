import java.util.*;
public class ReverseOfaNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n = sc.nextInt();
    int reverseNumber = 0;
    while(n > 0) {
      int lastDigit = n % 10;
      reverseNumber = reverseNumber * 10 + lastDigit;
      n /= 10;
    }
    System.out.println("Reverse number: "+reverseNumber);
    sc.close();
  }
}
