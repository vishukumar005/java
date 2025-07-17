
public class PalindromeString {
  public static boolean isPalindrome(String str) {
    for(int i = 0; i<str.length() / 2; i++) {
      int n = str.length();
      if(str.charAt(i) != str.charAt(n-1-i)) {
        return false;
      }
    }
    return true;
  }
  /*
    Given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.
    "WNEENESENNN"
   */
  public static float getShortestPath(String path){ 
    int x = 0, y = 0;
    for(int i = 0; i<path.length(); i++) {
      char dir = path.charAt(i);
      //south
      if(dir == 'S') {
        y--;
      }
      //North
      else if(dir == 'N') {
        y++;
      }
      //East
      else if(dir == 'E') {
        x++;
      }
      //west
      else {
        x--;
      }
    }
    int x2 = x*x;
    int y2 = y*y;
    return (float) Math.sqrt(x2 + y2);
  }
  public static void main(String[] args) {
    String path = "WNEENESENNN";
    String path1 = "NS";
    System.out.println(getShortestPath(path1));
  }
}
