import java.util.*;
public class AverageOf3Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    float avg = (a + b + c) / 3.0f;
    System.out.println("Average of these 3 numbers = "+avg);

  }
}