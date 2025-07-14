import java.util.*;
public class SumOfFirstnNaturalNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Range: ");
    int n = sc.nextInt();
    int counter = 1, sum = 0;
    while(counter <= n) {
      sum += counter;
      counter ++;
    }
    sc.close();
    System.out.println("Sum of number from 1 to "+n+" = "+sum);
  }
}
