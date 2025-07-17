

public class SubString {
  public static String substring(String str, int si, int ei) {
    String subString = "";
    for(int i = si; i<ei; i++) {
      subString += str.charAt(i);
    }
    return subString;
  }
  public static void main(String[] args) {
    String str = "Hello world";
    String subString = str.substring(0, 4); //inbuild funtion
    System.out.println(subString);
  }
  
}
