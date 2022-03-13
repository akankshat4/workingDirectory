package stringOperationsExamples;

/*
    *
    * This programs demonstrates how to read string, int, double, long and char values from console.
    *
 */

import java.util.Scanner;

public class ScannerProgram {
    public static void main (String args[]){

        /*
        *
        * Scanner Class is used to read primitive datatypes from console
        * Below are the limitations :
        *   (1) next() : If you add String "Hello Akanksha" on the console only "Hello" is printed
        *   (2) nextLine : If you add String "Hello Akanksha" on the console "Hello Akanskha" is printed
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = scanner.nextLine();
        System.out.println("The Name is : "+name);
        System.out.println("*************************************");

        System.out.println("Please enter age :");
        int age = scanner.nextInt();
        System.out.println("The age is : "+age);
        System.out.println("*************************************");

        System.out.println("Please enter mobile number : ");
        long mobile = scanner.nextLong();
        System.out.println("The mobile number is : "+mobile);
        System.out.println("*************************************");

        System.out.println("Please enter cgpa : ");
        double cgpa = scanner.nextDouble();
        System.out.println("The cgpa is : "+cgpa);
        System.out.println("*************************************");

        System.out.println(("Please enter gender : "));
        char gender = scanner.next().charAt(0);
        System.out.println("The gender is : "+gender);

    }
}
