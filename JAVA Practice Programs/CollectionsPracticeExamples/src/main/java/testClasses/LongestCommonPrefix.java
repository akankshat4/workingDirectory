package testClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Below code is incomplete
 */
public class LongestCommonPrefix {
    static List<String> stringArray = new ArrayList<>();
    static int lengthOfSmallestString = 0;
    public static void inputStringArray(){
        char decision = 'Y';
        while (decision=='Y') {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string : ");
            stringArray.add(scanner.next());
            System.out.println("Do you want to add more strings (Y/N) ? : ");
            decision = scanner.next().charAt(0);
        }
    }

    public static String largestCommonPrefix(){
        StringBuilder returnValue = new StringBuilder();
            Collections.sort(stringArray);
            lengthOfSmallestString = stringArray.get(0).length();

            for(int i=0; i<stringArray.size() - 2; i++){
                String temp1 = stringArray.get(i);
                String temp2 = stringArray.get(i+1);

                for (int j=0; j<lengthOfSmallestString; j++){
                    if(temp1.charAt(j)==temp2.charAt(j)){
                        if(j>=returnValue.length()){
                            returnValue.append(temp1.charAt(j));
                        }
                    }
                }
            }
        return new String(returnValue);
    }

    public static void main(String args[]){
        inputStringArray();

        System.out.println("Input Strings are : ");
        for (int i=0; i<stringArray.size(); i++ ){
            System.out.println(stringArray.get(i));
        }

        System.out.println("**************************");
        System.out.println("Longest Common SubString is :"+largestCommonPrefix());
    }

}
