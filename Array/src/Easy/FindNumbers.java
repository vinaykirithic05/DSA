package Easy;

public class FindNumbers {
    public static int findNumber(int[] nums){
        int n = nums.length;
        int count = 0;
        for (int i  = 0 ; i < nums.length ; i ++){
            int num = nums[i];
            int digitCount = 0;

            while(num >  0){

                digitCount ++;
                num /= 10;
            }
            if(digitCount % 2 == 0){
                count++;
            }
        }
        return count;
    }
//    Main Function
    public static  void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));
    }
}
