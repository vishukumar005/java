

public class ReverseArray {
  public static void reverseArray(int arr[]) {
    for(int i = 0, j = arr.length-1; i<j; i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
  public static void main(String[] args) {
    int array[] = {2, 4, 6, 8, 10};
    reverseArray(array);
    System.out.print("Reversed array: ");
    for(int i = 0; i<array.length; i++) {
      System.out.print(array[i]+" ");
    }
  }
}
