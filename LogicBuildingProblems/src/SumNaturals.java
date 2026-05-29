import java.util.Scanner;

public class SumNaturals {
//    Using Loop Method
    public static int findSum (int n) {
        int sum = 0;
        for (int i = 0 ; i <= n ; i ++){
            sum = sum + i ;
        }
        return  sum;
    }
//    Using Recursive Function
    public static int recursiveSum ( int n){
        if(n == 1){
            return 1;
        }
        return n + recursiveSum( n- 1);
    }
//    Using the Formula method : n * ( n + 1 ) /2
    public static int formulaSum (int n){
        return  n * (n + 1 ) / 2 ;
    }
//    Main Function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the Sum :  ");
        int num = input.nextInt();
        System.out.println("Using Loop Method : ");
        System.out.println(findSum(num));
        System.out.println("Using Recursive Method : ");
        System.out.println(recursiveSum(num));
        System.out.println("Using Formula Method : ");
        System.out.println(formulaSum(num));
    }
}
