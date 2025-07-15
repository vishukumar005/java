public class DiagonalSum {
  public static int diagonalSum(int matrix[][]){
    int sum = 0; 
    //applicable for matrix of order n * n or n = m
    //i == j for principal diagonal
    // i + j = n - 1
    for(int i = 0; i < matrix.length; i++) {
      //principal diagonal
      sum += matrix[i][i];
      //secondary diagonal
      if(i != matrix.length-1-i) {
        sum += matrix[i][matrix.length-1-i];
      }
    }
    return sum;
  }
  public static void main(String[] args) {
    int martix[][] = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
    System.out.println(diagonalSum(martix));
  }
  
}
