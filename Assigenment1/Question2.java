import java.util.*;
public class Question2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //program to calculate area of square
    System.out.print("Enter the side of square: ");
    int side = sc.nextInt();
    int area = side * side;
    System.out.println("Area: "+area);
  }
}