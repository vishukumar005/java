import java.util.*;
public class LargestNumber {
  public static int[] getLargest(int numbers[]) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i = 0; i<numbers.length; i++) {
      if(numbers[i] > max) {
        max = numbers[i];
      }
      if(numbers[i] < min) {
        min = numbers[i];
      }
    }
    return new int[]{min, max};
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter size of array: ");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter array elements: ");
    for(int i = 0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    int result[]= getLargest(arr);
    System.out.println("Smallest in array: "+result[0]+ "\nLargest in array: "+result[1]);
  }
}
