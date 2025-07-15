public class Stocks { 
  public static int buyAndSellStocks(int arr[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i = 0; i<arr.length; i++) {
      if(arr[i] > buyPrice) {
        int profit = arr[i] - buyPrice;
        maxProfit = Math.max(profit, maxProfit);
      }else {
        buyPrice = arr[i];
      }
    }
    return maxProfit;
  }
  public static void main(String[] args) {
    int prices[] = {50, 40, 30 , 20, 10};
    System.out.println("max profit: "+(buyAndSellStocks(prices)));
  }
}