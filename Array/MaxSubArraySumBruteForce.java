public class MaxSubArraySumBruteForce {
  //first calculate sub array sum then check 
  //if currSum > max Sum update

  public static void MaxSubArraySum(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for(int i = 0; i<arr.length; i++) {
      for(int j = i; j< arr.length; j++) {
        currSum = 0;
        for(int k = i; k<= j; k++) {
          //subarray sum calculate
          currSum += arr[k];
        }
        System.out.println("currentSum: "+currSum);
        if(currSum > maxSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max sum = "+maxSum);
  }
  public static void main(String[] args) {
    int arr[] = {2, 4, 6, 8, 10};
    MaxSubArraySum(arr);
  }
}
