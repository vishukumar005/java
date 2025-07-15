import java.util.*;
public class Array {
  public static void update(int marks[]) {
    for(int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;
    }
  }
  public static void main(String[] args) {
    int marks[] = new int[40];

    int numbers[] = {1, 2, 3};

    String fruits[] = {"apple", "mango", "grapes"};
    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println("phy: "+marks[0]+" chem: "+marks[1]+" math: "+marks[2]);
    int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    System.out.println("Percentage: "+percentage+"%");
    System.out.println();
    System.out.println("Length of array = "+marks.length);
    sc.close();
    update(marks);
    System.out.println("phy: "+marks[0]+" chem: "+marks[1]+" math: "+marks[2]);


  }
}

/*
 *List of elements of the same type placed in a contiguous memory location
 *Operation in Arrays
 Create
 Input 
 Output
 update
 */

 /*
  * Passing arrays as argument -> done by call by reference
  */
