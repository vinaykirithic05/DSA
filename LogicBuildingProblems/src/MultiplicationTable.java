import java.util.Scanner;

public class MultiplicationTable {
//    Using Normal method
    public static void printTable (int n){
        for( int i = 0 ; i <= 10 ; i ++ ){
            System.out.println( n + " x " + i + " = " + n * i);
        }
    }
//    Using Recursive Case
    public static void multiplicationTable (int n , Integer... val){
        int i = 0;
        if( val.length != 0){
            i = val[0];
        }
        if(i == 11){
            return;
        }
        System.out.println( n + " x " + i + " = " + n * i);
        i++;
        multiplicationTable(n,i);
    }
//    Main Function
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the Number to Print the Multiplication table : ");
        int num = input.nextInt();
        System.out.println("Using Normal Method  ");
        printTable(num);
        System.out.println("Using Recursive Method : ");
        multiplicationTable(num);
    }
}
