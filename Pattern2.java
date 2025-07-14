public class Pattern2 {
  public static void HollowRectangle (int row, int col) {
    for(int i = 1; i<= row; i++) {
      for(int j = 1; j <= col; j++) {
        if(i == 1 || i == row || j == 1 || j == col) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
  public static void InvertedAndRotatedHalfPyramid (int row) {
    for(int i = 1; i<= row; i++) {
      for(int j = 1; j<= row -i; j++) {
        System.out.print("  ");
      }
      for(int k = 1; k<= i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void InvertedHalfPyramidWithNUmbers(int row) {
    for(int i = 1; i<= row; i++) {
      for(int j = 1; j<= row -i +1; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
  public static void FloydSTriangle(int row) {
    int x = 1;
    for(int i = 1; i<= row; i++) {
      for(int j = 1; j<= i; j++) {
        System.out.print(x+" ");
        x++;
      }
      System.out.println();
    }
  }
  public static void zeroOneTriangle(int row) {
    for(int i = 1; i<= 5; i++) {
      for(int j = 1; j<=i; j++) {
        if((i + j) % 2 == 0) {
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }
  public static void ButterFlyPattern(int row) {
    //first half
    for(int i = 1; i<= row; i++) {
      //stars - i
      for(int j = 1; j<= i; j++) {
        System.out.print("* ");
      }
      //space - 2*(n - i)
      for(int j = 1; j<= 2 * (row - i); j++) {
        System.out.print("  ");
      }
      //stars - i
      for(int j = 1; j<= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i = row-1; i>= 1; i--) {
      //stars - i
      for(int j = 1; j<= i; j++) {
        System.out.print("* ");
      }
      //space - 2*(n - i)
      for(int j = 1; j<= 2 * (row - i); j++) {
        System.out.print("  ");
      }
      //stars - i
      for(int j = 1; j<= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void SolidRhombus(int row) {
    for(int i = 1; i<= row; i++) {
      //spaces
      for(int j = 1; j <= (row - i); j++) {
        System.out.print("  ");
      }
      //stars
      for(int j = 1; j<= row; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void HollowRhombus(int row) {
    for(int i = 1; i<= row; i++) {
      //spaces
      for(int j = 1; j <= (row - i); j++) {
        System.out.print("  ");
      }
      //stars
      for(int j = 1; j<= row; j++) {
        if(i == 1 || j == 1 || i == row || j == row) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
        
      }
      System.out.println();
    }
  }
  public static void DiamondPattern(int row) {
    for(int i = 1; i<= row; i++) {
      //spaces
      for(int j = 1; j<= 15+row-i; j++) {
        System.out.print("  ");
      }
      //stars
      for(int j = 1; j<= 2 * i - 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i = row-1; i>= 1; i--) {
      //spaces
      for(int j = 1; j<= 15+row-i; j++) {
        System.out.print("  ");
      }
      //stars
      for(int j = 1; j<= 2 * i - 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
   DiamondPattern(10);
  }
  
}
