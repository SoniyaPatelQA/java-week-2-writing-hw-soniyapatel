package homework_week_6;

/**
 * Write a Java program to convert a decimal number to binary number
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is : 101
 */

import java.util.Scanner;

public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {

        //scanner declaration for reading input from console
        System.out.println("Welcome to Java program to convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number : ");
        int number = scanner.nextInt();

        convertDecimalToBinary(number);

        //closing the scanner object
        scanner.close();
    }

    //Converting the decimal to binary
    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }
}
