public class PrimeInRange {
  public static boolean isPrime(int n) {
    if(n <= 1) {
      return false;
    }
    for(int i = 2; i<= Math.sqrt(n); i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static void PrintPrimeNumber(int start, int end) {
    System.out.print("Prime Number between "+start+" to "+end+" : ");
    for(int i = start; i<= end; i++) {
      if(isPrime(i)) {
        System.out.print(i+" ");
      }
    }
  }
  public static void main(String[] args) {
    PrintPrimeNumber(1, 1000);
  }
}
