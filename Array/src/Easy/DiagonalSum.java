package Easy;

public class DiagonalSum {
    public static int diagonalSum(int[][] mat){
        int n = mat.length;
        int sum = 0;
        for (int i = 0 ; i < n ; i++){
//            Primary Diagonal
            sum += mat[i][i];
//            Secondary Diagonal
            sum += mat[i][n - 1 - i];
        }
//        If n is odd, subract the middle the element once
        if((n % 2) == 1){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
//    Main Function
    public static void main(String[] args){
        int[][] mat = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }
}
