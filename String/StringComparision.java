

public class StringComparision {
  public static void main(String[] args) {
    String s1 = "vishal";
    String s3 = new String("vishal");
    if(s1.equals(s3)) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }
  }
}
