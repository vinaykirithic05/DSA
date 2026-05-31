package Easy;

import java.util.Arrays;
import java.util.Scanner;

//Concatenation Of Array
public class getConcatenation {
//    using Loop Method
    public static int[] concatenationArray(int[] num){
        int n = num.length;
        int[] ans = new int[2*n];
        for (int i = 0 ; i < n ;i++){
            ans[i] = num[i];
            ans[i + n] = num[i];
        }
        return ans;
    }
//    Main Function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length of the Array : ");
        int length = input.nextInt();
        int[] arr = new int[length];
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print("Enter the Value of the Element : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Concatenation of Array using Loop Method : ");
        System.out.println(Arrays.toString(concatenationArray(arr)));
    }
}
