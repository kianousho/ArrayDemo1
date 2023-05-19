
package arraysdemo;

import java.util.Scanner;


public class ArraysDemo {


    public static void main(String[] args) {
        System.out.print("enter a word :");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char[]myLetters = new char[word.length()];
        for (int i = 0 ; i < myLetters.length; i++){
            myLetters[i] = word.charAt(i);
            System.out.print(myLetters[i]);
        }//end of for loop
        System.out.println();
        System.out.println("reverse is ");
        for (int i = myLetters.length - 1 ; i >= 0; i--){
            System.out.print(myLetters[i]);
        }
    }
    
}
