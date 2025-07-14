import java.util.*;
public class Functions {
  public static void printHelloWorld() {
    System.out.println("Hello world");
    System.out.println("Hello world");
    System.out.println("Hello world");
  }
  public static int calculateSum(int a, int b) { //parameters or formal parameter
    int sum = a+b;
    return sum;
  }
  public static boolean isPrime(int n) {
    boolean isPrime = true;
    if( n <= 1) {
      return false;
    }
    for(int i = 2; i<= Math.sqrt(n); i++) {
      if(n % i == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }
  public static int Factorial(int n) {
    int fact = 1;
    for(int i = 1; i<= n; i++) {
      fact *= i;
    }
    return fact;
  }
  public static int BinomialCoefficient(int n, int r) {
    int n_fact = Factorial(n);
    int r_fact = Factorial(r);
    int nmr_fact = Factorial(n-r);
    return (n_fact / (r_fact * nmr_fact));

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter two numbers: ");
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = calculateSum(a, b);//arguments or actual parameters
    // System.out.println("SUm = "+sum);
    // int num = sc.nextInt();
    // int fact = Factorial(num);
    // System.out.println(fact);
    // System.out.println(BinomialCoefficient(5, 2));
    System.out.println(isPrime(2));
    sc.close();

    //Methods are two type 
    //(i)UserDefined -> build by programmer
    //(ii)InbuildMehtod -> like Math

    //Function Overloading
    //Multiple Functions with the same name but different parameters
   }
}

