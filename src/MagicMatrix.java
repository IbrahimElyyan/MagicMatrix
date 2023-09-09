// -------------------------------------------------------
// Assignment (#3 Q1)
// Written by: (Ibrahim Elyyan)
// For COMP 248 Section (U) – Winter 2021
// --------------------------------------------------------

//Author: Ibrahim Elyyan

//Date: March 12, 2021

// PURPOSE: Randomly generate a 3X3 magic matrix where the sum of the rows, columns and diagonals is the same

// Note: May take a couple of seconds

public class MagicMatrix {
    public static void main(String[] args) {
        // Variable declarations
        // The variable check is an integer used to determine the amount of correct conditions met
        int sumOfRow1, sumOfRow2, sumOfRow3, sumOfCol1, sumOfCol2, sumOfCol3, sumOfDiagonal1, sumOfDiagonal2, check = 0;
        // Creating a two dimensional array that will store the values of the matrix
        int[][] matrix = new int[3][3];
        do {
            // Filling up the array with random integer values from 1 to 9
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random()*(9) + 1);
                }
            }
            // Setting the rows, columns, and diagonals as sums of their respective numbers in the matrix
            sumOfRow1 = matrix[0][0] + matrix[0][1] + matrix[0][2];
            sumOfRow2 = matrix[1][0] + matrix[1][1] + matrix[1][2];
            sumOfRow3 = matrix[2][0] + matrix[2][1] + matrix[2][2];
            sumOfCol1 = matrix[0][0] + matrix[1][0] + matrix[2][0];
            sumOfCol2 = matrix[0][1] + matrix[1][1] + matrix[2][1];
            sumOfCol3 = matrix[0][2] + matrix[1][2] + matrix[2][2];
            sumOfDiagonal1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
            sumOfDiagonal2 = matrix[0][2] + matrix[1][1] + matrix[2][0];
            // Setting the conditions for a magic matrix using if statements
            // Incrementing the variable check for each condition met
            if (sumOfRow1 == 15 && sumOfRow2 == 15 && sumOfRow3 == 15) {
                check++;
            }
            if (sumOfCol1 == 15 && sumOfCol2 == 15 && sumOfCol3 == 15) {
                check++;
            }
            if (sumOfDiagonal1 == 15 && sumOfDiagonal2 == 15) {
                check++;
            }
            if (matrix[0][0]%2==0 && matrix[0][2]%2==0) {
                check++;
            }
            if (matrix[0][0]!=matrix[0][2]){
                check++;
            }
            if (matrix[0][1]!=5) {
                check++;
            }
            if (matrix[1][0]!=matrix[1][2]) {
                check++;
            }
            // Resetting the variable check to 0 if the current iteration does not match the requirements
            if (check!=7) {
                check=0;
            }
        } while (check!=7);
        // Displaying the resulting matrix
        System.out.println("The randomly generated matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}
