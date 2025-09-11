import java.util.Scanner;
import java.util.Arrays;

public class Ar{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking Jagged array as input and printing
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt(); 

        int[][] arr = new int[rows][];

        for (int row = 0; row < rows; row++) {
            System.out.print("Enter number of columns for row " + row + ": ");
            int cols = in.nextInt();
            arr[row] = new int[cols]; 
        }

        System.out.println("Enter the elements:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println("The jagged array is:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}

