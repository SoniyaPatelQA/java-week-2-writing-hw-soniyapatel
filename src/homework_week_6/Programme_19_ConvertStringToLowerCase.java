package homework_week_6;

/**
 * Write a Java program to convert a given string into lowercase
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;

public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();

        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);

        //closing the scanner object
        scanner.close();

    }

    //convert the  string to lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lower of the string is = " + str.toLowerCase());
    }
}
