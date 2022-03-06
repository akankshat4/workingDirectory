package string;

import java.util.Scanner;


/*
    *
    * This program demonstrates how to find occurances of a alphabet in the string.
    *
 */

public class OccurancesOfAlphabetInString {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String string = scanner.nextLine();
        System.out.println("*********************************");

        System.out.println("Enter the character");
        char character = scanner.nextLine().charAt(0);
        System.out.println("*********************************");

        int count = 0;
        for (int i=0; i<string.length(); i++){
            if (string.charAt(i)==character){
                count++;
            }
        }

        System.out.println("The character '"+character+"' occurs '"+count+"' times in the string '"+string+"'.");
    }
}
