import java.util.*;
public class largestOfTwoNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two number: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a > b) {
      System.out.println("A is largest of 2");
    } else if(a == b) {
      System.out.println("Both are Equal");
    } else {
      System.out.println("B is larges of 2");
    }
    sc.close();
  }
}
