public class Pattern {
  public static void InvertedStarPattern(int num) {
    for(int i = 1; i<= 4; i++) {
      for(int j = 4; j >= i; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void StarPattern(int number) {
    for(int i = 1; i<= 4; i++) {
      for(int j = 1; j<= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void HalfPyramid(int num) {
    for(int i = 1; i<= 4; i++)  {
      for(int j = 1; j<= i; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
  public static void CharacterPattern(int num) {
    char ch = 'A';
    for(int i = 1; i<= 4; i++) {
      for(int j = 1; j<= i; j++) {
        System.out.print(ch+" ");
        ch++;
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    CharacterPattern(4);
  }
}
