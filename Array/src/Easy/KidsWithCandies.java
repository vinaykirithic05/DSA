package Easy;

import java.util.Arrays;
//Kids with the Greatest Number of Candies
public class KidsWithCandies {
    public static boolean[] kidsWithCandies(int[] candies , int extraCandies){
        int max = 0;
        boolean[] ans = new boolean[candies.length];
        for(int i = 0; i< candies.length; i++){
            if(candies[i] >=  max){
                max = candies[i];
            }
        }
        for (int i = 0 ; i < candies.length ; i++){
            int totalcandies = candies[i] + extraCandies;
            if(totalcandies >= max){
                ans[i] = true;
            }
            else {
                ans[i] = false;
            }
        }
        return ans;
    }
//    Main Function
    public static  void main (String[] args){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(Arrays.toString(kidsWithCandies(candies , extraCandies)));
    }
}
