package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayForm {
    public static List<Integer> addToArrayForm(int[] num , int k){
      List<Integer> result = new ArrayList<>();
      int  i = num.length - 1 ;
      while ( i >= 0 || k > 0){
          if(i >=0){
              k += num[i];
              i--;
          }
          result.add(0 , k % 10);
          k /= 10;
      }
      return  result;

    }
//    Main Function
    public static void main(String[] args){
        int[] num = {2,1,5};
        int k = 806;
        List<Integer> answer = addToArrayForm(num,k);
        System.out.println(answer);
    }
}
