package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayForm {
    public static List<Integer> addToArrayForm(int[] num , int k){
        int n = num.length;
         int sum = 0;
         List<Integer> newArray = new ArrayList<>() ;
//         To find the sum of the Given Array
        for (int i = 0 ; i < num.length ; i++){
            sum = sum * 10 + num[i];
        }
        int totalSum = sum + k;
        while(totalSum > 0){
            int lastDigit = totalSum % 10 ;
            newArray.add(0,lastDigit);
            totalSum = totalSum / 10 ;
        }
        return newArray;
    }
//    Main Function
    public static void main(String[] args){
        int[] num = {2,7,4};
        int k = 181;
        List<Integer> answer = addToArrayForm(num,k);
        System.out.println(answer);
    }
}
