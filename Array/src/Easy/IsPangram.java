package Easy;

import java.util.Scanner;

public class IsPangram {
    public static boolean isPangram(String sentence){
        sentence = sentence.toLowerCase();
        for (char ch = 'a' ; ch <= 'z' ; ch++){
            if(sentence.indexOf(ch) == -1){
                return false;
            }
        }
        return true;
    }
//    Main Function
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String sentence = input.nextLine();

        if(isPangram(sentence) == true){
            System.out.println("The Given Sentence is pangram");
        }
        else {
            System.out.println("The Given Sentence is not Pangram");
        }

    }
}
