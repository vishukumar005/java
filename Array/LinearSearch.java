import java.util.*;
public class LinearSearch {
  public static int linearSearch(int arr[], int key) {
    for(int i = 0; i<arr.length; i++) {
      if(arr[i] == key) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[50], n,key;
    System.out.print("Enter the size of array: ");
    n = sc.nextInt();
    System.out.print("Enter the elements of array: ");
    for(int i = 0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the element you want to search: ");
    key = sc.nextInt();
    int searchResult = linearSearch(arr, key);
    if(searchResult == -1) {
      System.out.println("Data not found");
    } else {
      System.out.println("Data found at index: "+searchResult);
    }
    sc.close();
  }
}
