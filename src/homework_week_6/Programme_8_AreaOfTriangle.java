package homework_week_6;
/**
 * Write a program to calculate the area of triangle
 */

import java.util.Scanner;

public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        //Scanner declaration fro reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the triangle : ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of triangle : ");
        int height = scanner.nextInt();

        areaOfTriangle(height, length);
        //closing the scanner object
        scanner.close();

    }

    //calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height) {
        int area = (length * height) / 2;
        System.out.println("The Area of a triangle is : " + area);
    }
}
