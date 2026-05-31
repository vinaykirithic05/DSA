package Easy;

public class NumIdenticalPairs {
    public static int numIdenticalPairs(int[] nums){
        int ans = 0;
        for(int i = 0 ; i < nums.length; i++){
            for (int j = i + 1 ; j < nums.length ; j ++ ){
                if(nums[i]  == nums[j]){
                    ans= ans + 1;
                }
            }
        }
        return ans;
    }
//    Main Function
    public static void main (String[] args){
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
