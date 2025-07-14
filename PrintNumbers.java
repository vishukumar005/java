import java.util.*;
public class PrintNumbers {
  public static void  main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter range: ");
    int counter = 1;
    int n = sc.nextInt();
    while(counter <= n) {
      System.out.print(counter+" ");
      counter++;
    }
    sc.close();
  }
}
