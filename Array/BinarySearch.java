import java.util.*;
public class BinarySearch {
  public static int binarySearch(int num[], int key) {
    int start = 0, end = num.length-1;
    while(start <= end) {
      int mid = (start + end) / 2;
      if(num[mid] == key) {
        return mid;
      } else if(num[mid] > key) { //left
        end = mid-1;
      } else {
        start = mid+1; //right
      }
    }
    return -1;
  }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, result;
    System.out.print("Enter size of array: ");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter array elements in sorted order: ");
    for(int i = 0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    result = binarySearch(arr, 9);
    if(result == -1) {
      System.out.println("Data not found!");
    } else {
      System.out.println("Data found at : "+result);
    }
 }
}
