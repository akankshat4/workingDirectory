package string;

import java.util.Scanner;

/*
    *
    * This program demonstrates how to find of a sub-string is occuring in a string.
    * The program looks up for sub-string in a case sensitive manner.
    *
 */

public class OccurencesOfSubStringInString {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string = null;
        String subString = null;
        boolean exist = false;

        System.out.println("Please enter the string : ");
        string = scanner.nextLine();
        System.out.println("***********************************");
        System.out.println("Please enter sub-string : ");
        subString = scanner.nextLine();
        exist = string.contains(subString);

        if(exist){
            System.out.println("The string '"+string+"' contains sub-string '"+subString+"'.");
        }else{
            System.out.println("The string '"+string+"' does not contains sub-string '"+subString+"'.");
        }


    }
}
