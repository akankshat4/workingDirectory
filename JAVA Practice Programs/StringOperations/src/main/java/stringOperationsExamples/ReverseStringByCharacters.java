package stringOperationsExamples;

import java.util.Scanner;

public class ReverseStringByCharacters {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String parentstring = scanner.nextLine();
        StringBuilder reveseString = new StringBuilder();

        for (int i=parentstring.length()-1; i>=0; i--){
            reveseString = reveseString.append(parentstring.charAt(i));
        }

        System.out.println("*********************************");
        System.out.println("The base String is : "+parentstring);
        System.out.println("The reverse string is : "+reveseString);
    }
}
