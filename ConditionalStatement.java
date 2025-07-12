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
    //ternary Operator
    //variable = condition ? statement1 : statement2;
    int larger = ( 5 > 3) ? 5: 3;
    System.out.println(larger);
    sc.close();
  }
}