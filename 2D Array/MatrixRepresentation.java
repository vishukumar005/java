import java.util.*;
public class MatrixRepresentation {
  public static void search(int matrix[][], int key) {
    for(int i = 0; i<3; i++) {
      for(int j = 0; j<3; j++) {
        if(matrix[i][j] == key) {
          System.out.println("Data found");
          return;
        }else {
          System.out.println("Data not found");
        }
      }
    }
  }
  public static void main(String args[]) {
    int matrix[][] = new int[3][3];
    int n = matrix.length, m = matrix[0].length;
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i<n; i++) {
      for(int j = 0; j<n; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    sc.close();

    //output
    for(int i = 0; i<n; i++) {
      for(int j = 0; j<m; j++) {
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
    search(matrix, 5);
  }
}
