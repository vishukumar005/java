import java.util.*;
public class BasicProblem {
  public static void main(String[] args) {
    //object for takin input
    Scanner sc = new Scanner(System.in);
    //program to find sum and product of two numbers
    System.out.print("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    int product = a * b;
    System.out.println("sum = "+sum);
    System.out.println("Product = "+product);
    //program to find Area of circle
    System.out.print("Enter Radius of Circle: ");
    float radius = sc.nextFloat();
    float area  = 3.14f * radius * radius;
    System.out.println("Area = "+ area);
    sc.close();
  }
}