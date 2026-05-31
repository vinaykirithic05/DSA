package Easy;

import java.util.Scanner;

//Richest Customer wealth
public class RichestWealth {
    public static int richestWealth (int[][] account){
        int wealth = 0;
        for(int i = 0;i<account.length; i++){
            int sum = 0;
            for (int j = 0 ; j < account[i].length ; j++){
                sum = sum + account[i][j];
            }
            if(wealth < sum) {
                wealth = sum;
            }
        }
        return wealth;
    }
//    Main Function
    public  static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght of the 2d Array : ");
        int lenOne = input.nextInt();
        int lenTwo = input.nextInt();
        int arr[][] = new int[lenOne][lenTwo];
        for (int i = 0; i < lenOne; i++) {
            for ( int j = 0; j < lenTwo ; j ++){
                System.out.print("Enter the Value of the Element : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Richest Wealth : " + richestWealth(arr));
    }
}
