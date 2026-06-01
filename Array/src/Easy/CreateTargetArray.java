package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums , int[] index){
        ArrayList <Integer> target = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i ++){
            target.add(index[i] , nums[i]);
        }
        int[] result = new int[target.size()];
        for(int i = 0 ; i < target.size() ; i ++){
            result[i] = target.get(i);
        }
        return result;
    }
//    Main Function
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums , index)));
    }
}
