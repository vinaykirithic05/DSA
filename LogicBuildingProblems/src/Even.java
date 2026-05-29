import java.util.Scanner;

public class Even {
//     Using Remainder Method
    public static boolean isEven(int n){
         int rem = n % 2 ;
        if(rem == 0){
            return true;
        }
        else {
            return false;
        }
    }
//    Using Bitwise Operator
    public  static boolean isOdd(int n){
        if((n & 1) == 0){
            return true;
        }
        else
            return false;
    }
//    Main Function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to Check Odd or Even : ");
        int num = input.nextInt();
        System.out.println("By Finding the Remainder method  and Bitwise Operator method   ");
        if(isEven(num) == true && isOdd(num) == true){
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
    }
}
