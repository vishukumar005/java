import java.util.Arrays;
public class BasicSorting {
  public static void BubbleSort(int arr[]) {
    int n = arr.length;
    boolean swapped;
    for(int i = 0; i<n-1; i++) {
      swapped = false;
      for(int j = 0; j < n-1-i; j++) {
        if(arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapped = true;
        }
      }
      if(!swapped) {
        break;
      }
    }
  }
  public static void selectionSort(int arr[]) {
    for(int i = 0; i<arr.length-1; i++) {
      int minPos = i;
      for(int j = i+1; j<arr.length; j++) {
        if(arr[j] < arr[minPos]) {
          minPos = j;
        }
      }
      if(minPos != i) {
        int temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
        
      }
    }
  }
  public static void InsersionSort(int arr[]) {
    for(int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int prev = i-1;
      //finding out the correct pos to insert
      while(prev >= 0 && arr[prev] > curr) {
        arr[prev+1] = arr[prev];
        prev--;
      }
      //insertion
      arr[prev+1] = curr;
    }
  }
  public static void main(String[] args) {
    int arr[] = {5, 4, 3, 2, 1};
    // InsersionSort(arr);
    //Arrays.sort(arr, starting, ending);
    Arrays.sort(arr);
    System.out.print("sorted: ");
    for(int i = 0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
