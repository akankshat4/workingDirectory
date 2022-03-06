package string;

/*
*
* This program finds out the index of last occurance of a character in a string.
*
 */

import java.util.Scanner;

public class LastOccuranceOfAlphabetInString {
    public static void main(String args[]){
        String string = null;
        char alphabet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string : ");
        string = scanner.nextLine();
        System.out.println("Please enter the character : ");
        alphabet = scanner.next().charAt(0);
        int lastOccurance = -1;
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i)==alphabet){
                lastOccurance = i;
            }
        }

        System.out.println("The last occurance of alphabet '"+alphabet+"' in string '"+string+"' is at : "+lastOccurance);
    }
}
