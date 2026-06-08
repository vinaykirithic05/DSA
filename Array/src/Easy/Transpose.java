package Easy;

import java.util.Arrays;

public class Transpose {
    public static int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int [][] transposeMat = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for(int j = 0 ; j < cols ; j ++){
                transposeMat[j][i] = matrix[i][j];
            }
        }
        return transposeMat;
    }
//    Main Function
    public static void main(String[] args){
        int[][] matrix = {{1,2,3}, {4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
}
