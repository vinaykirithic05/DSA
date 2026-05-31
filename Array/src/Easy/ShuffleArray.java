package Easy;

import java.util.Arrays;
import java.util.Scanner;
//Shuffle the Array

public class ShuffleArray {
    public static int[] shuffleArray (int[] nums  , int n){
        int[] ans = new int[2 * n];
        for (int i = 0 ; i < n ; i++){
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
//    Main Function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Give the nth value : ");
        int n = input.nextInt();
        System.out.println("Enter the Value for the Array : ");
        int[] arr = new int[2 * n];
        for (int i  = 0; i < arr.length; i ++) {
            System.out.print("Enter the Value of the Element : ");
            arr[i]  = input.nextInt();
        }
        System.out.println(Arrays.toString(shuffleArray(arr , n)));
    }

}
