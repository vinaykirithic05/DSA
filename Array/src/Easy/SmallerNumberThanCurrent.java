package Easy;

import java.util.Arrays;

public class SmallerNumberThanCurrent {
    public static int[] smallerNumberThanCurrent(int[] num) {
        int n = num.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int least = 0;
            for (int j = 0; j < n; j++) {

                if (num[j] < num[i]) {
                    least = least + 1;
                }

            }
            ans[i] = least;
        }
        return ans;
    }

    //    Main Function
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumberThanCurrent(arr)));
    }
}
