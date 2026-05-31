package Easy;

import java.util.Arrays;
import java.util.Scanner;

//Running Sum of 1d Array
public class RunningSum {
//    Using Loop Method
    public static int[] runningSum(int[] num){
        int n = num.length;
        for (int i =1 ; i< n;i++){
            num[i] = num[i] + num[i -1 ];
        }
        return num;
    }
//    Main Function
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Array : ");
        int length = input.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length ; i ++){
            System.out.print("Enter the Value of the Element : ");
            arr[i]  = input.nextInt() ;
        }
        System.out.println("Running Sum of the Array : ");
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
