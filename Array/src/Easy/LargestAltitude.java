package Easy;

import java.util.Arrays;

public class LargestAltitude {
    public static int largestAltitude(int[] gain){
        int n = gain.length;
        int[] altitude = new int[n + 1];
        altitude[0] = 0;
        for(int i = 1 ; i <= n ; i ++){
            altitude[i] = altitude[i - 1] + gain[i - 1];

        }
        int max = altitude[0];
        for(int h:altitude){
            if(h > max){
                max = h;
            }

        }
        return max;
    }
//    Main Function
    public static void main(String[] args){
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
