package patternPrinter;

import java.util.*;

class patternSelector{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the pattern:");
        
        int rows=sc.nextInt();

        //User picks pattern
        System.out.println("Choose a pattern to print:");
        System.out.println("1. Pyramid");
        System.out.println("2. Right Triangle");
        System.out.println("3. Diamond");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        //Switch case to run appropriate method
        switch(choice){
            case 1:
            printPyramid(rows);
            break;

            case 2:
            printRightTriangle(rows);
            break;

            case 3:
            printDiamond(rows);
            break;

            default:
            System.out.println("INVALID. Enter choice from 1/2/3");
        }
        sc.close();

    }

    //Function to print pyramid pattern
    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Function to print a right triangle pattern
    public static void printRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Function to print a diamond pattern
    public static void printDiamond(int rows) {
        // Print the upper pyramid part
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower inverted pyramid part
        for (int i = rows - 1; i > 0; i--) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
