/*
 * Author: Aubrie McIntyre
 * Date: 8/25/2024
 * Description: This program will accept two entries of arrays by the user and compare them,
 * determining if the two arrays are identical or not.
 */
import java.util.Scanner;

public class myArrays {

    public static String compareArrays(int[][] firstArray, int[][] secondArray) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /** Prompts the user for the dimensions of the first array */
        System.out.print("Enter the number of rows for the first array: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first array: ");
        int columns1 = scanner.nextInt();
 
        /** Creates the 2D array for the first array */
        int[][] array1 = new int[rows1][columns1];
 
        /** Prompts the user to enter values for the first array */
        System.out.println("Enter the elements of the first array:");
 
        /** Input loop to populate the first array */
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                array1[i][j] = scanner.nextInt();
            }
        }
 
        /** Prompts the user for the dimensions of the second array */
        System.out.print("Enter the number of rows for the second array: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second array: ");
        int columns2 = scanner.nextInt();

        /** Creates the 2D array for the second array */
        int[][] array2 = new int[rows2][columns2];

        /** Prompts the user to enter values for the second array */
        System.out.println("Enter the elements of the second array:");

        /** Input loop to populate the second array */
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                array2[i][j] = scanner.nextInt();
            }
        }

        /** Output the first array */
        System.out.println("The first entered 2D array is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
        /** Output the second array */
        System.out.println("The second entered 2D array is:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }

        /** Compares the arrays and outputs the results */


        // Close the Scanner object
        scanner.close();
    }
}