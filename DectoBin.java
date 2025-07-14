public class DectoBin {
  public static void DecToBin(int n) {
    int pow = 0;
    int binNum = 0;
    while(n > 0) {
      int rem = n % 2;
      binNum +=  (rem * (int)Math.pow(10, pow));
      n /= 2;
      pow++;
    }
    System.out.println("Binary num: "+binNum);
  }
  public static void main(String[]args) {
    DecToBin(8);
  }
}
