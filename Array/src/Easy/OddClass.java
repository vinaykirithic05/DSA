package Easy;

import java.util.Arrays;

public class OddClass {
    public static int oddCells(int m , int n , int[][] indicies){
        int[] rows = new int[m];
        int[] cols = new int[n];
        for(int[] index : indicies){
            rows[index[0]] ++ ;
            cols[index[1]] ++;
        }
        int count = 0 ;
        for( int i = 0 ; i < m ; i++){
            for( int j = 0 ; j < n ; j ++){
                if((rows[i] + cols[j]) % 2 != 0 ){
                    count++;
                }
            }
        }
        return count;
    }
//    Main Function
    public static void main(String[] args){
        int[][] indicies = {{0,1},{1,1}};
        int m = 2;
        int n = 3;
        System.out.println(oddCells(m,n,indicies));
    }
}
