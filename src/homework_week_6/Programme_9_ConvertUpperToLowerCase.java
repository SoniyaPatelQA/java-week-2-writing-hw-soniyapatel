package homework_week_6;

/**
 * Write a program to convert the upper case to lower case
 */

import java.util.Scanner;

public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String upperCase = scanner.nextLine();

        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(upperCase);

        //closing the scanner object
        scanner.close();

    }

    //Conversion of Uppercase to Lower Case method
    public void convertUppercaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
