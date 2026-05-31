package Easy;

import java.util.Arrays;
import java.util.Scanner;

// Build Array from Permutation
public class BuildArray {
//   Using Memory Method
    public static int[] arrayMemory(int[] num){
        int n = num.length;
        int[] ans = new int[n];
        for(int i = 0; i < n ; i++){
            ans[i] = num[num[i]];
        }
        return ans;
    }
    public static int[] arrayWithoutMemory (int[] nums){
        int n = nums.length;
        for ( int i = 0 ; i < n ; i ++){
            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }
        for (int i = 0 ; i < n ; i ++){
            nums[i] = nums[i]/ n ;
        }
        return nums;
    }
//    Main Function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for( int i = 0; i < arr.length ; i++){
            System.out.println("Enter the Value of the Element : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Using Array With Memory ");
        System.out.println(Arrays.toString(arrayMemory(arr)));
        System.out.println("Using Array without Memory ");
        System.out.println(Arrays.toString(arrayWithoutMemory(arr)));
    }
}
