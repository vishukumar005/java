import java.util.*;
public class Question3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter pencil price: ");
    float pencilPrice = sc.nextFloat();
    System.out.print("Enter pen price: ");
    float penPrice = sc.nextFloat();
    System.out.print("Enter Eraser price: ");
    float eraserPrice = sc.nextFloat();

    float totalBill = (pencilPrice + penPrice + eraserPrice) * 1.18f;
    System.out.println("Total Bill: "+totalBill);
  }
}