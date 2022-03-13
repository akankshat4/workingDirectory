package stringOperationsExamples;

import java.util.Scanner;

public class ReverseStringByWords {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String baseString = scanner.nextLine();

        String[] charArray = baseString.split(" ");
        System.out.println(charArray.length);

        StringBuilder builder = new StringBuilder();

        for(int i=charArray.length-1; i>=0; i--){
            builder.append(charArray[i]);
            if (i!=0)
                builder.append(" ");
        }

        System.out.println(builder);
    }
}
