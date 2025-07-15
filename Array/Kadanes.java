public class Kadanes {
  public static void MaxSubArray(int arr[]) {
    int maxSum = arr[0];
    int currSum = arr[0];
    for(int i = 1; i<arr.length; i++) {
      currSum = Math.max(arr[i], currSum + arr[i]);
      maxSum = Math.max(currSum, maxSum);
    }
    System.out.println("MaxSum: "+maxSum);
  }
  public static void main(String[] args) {
    int arr[] = {2, 4, 6, 0, 3, -1};
    MaxSubArray(arr);
  }
  
}
