import java.util.*;
public class ConditionalStatement {
  public static void main(String[] args) {
    //Conditional Statements
    /*if-else statements
      if(condition) {
      }else {
      }
     */
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    if(age >= 18) {
      System.out.println("Adult: Vote, Drive");
    }
    if(age > 13 && age < 18) {
      System.out.println("Teenager");
    }
     else {
      System.out.println("NOt adult");
    }
    sc.close();
  }
}