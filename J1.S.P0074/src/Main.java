
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Validate v = new Validate();
        Calculator c = new Calculator();
        int row1;
        int col1;
        int row2 = 0;
        int col2 = 0;
        int[][] matrix1;
        int[][] matrix2;
        do {
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            int choice = v.getChoice();
            switch (choice) {
                case 1:
                    row1 = v.getSize("Enter row of matrix 1: ");
                    col1 = v.getSize("Enter cols of matrix 1: ");
                    matrix1 = v.getMatrix(row1, col1);
                    do {
                        row2 = v.getSize("Enter row of matrix 2: ");
                        if (row2!=row1) {
                            System.out.println("Row 2 must equal row 1:");
                            continue;
                        }
                        col2 = v.getSize("Enter cols of matrix 2: ");
                        if (col2!=col1) {
                            System.out.println("Col 2 must equal col 1:");
                            continue;
                        }
                        break;
                    } while (true);
                    matrix2 = v.getMatrix(row2, col2);
                    v.displayMatrix(matrix1);
                    System.out.println("+");
                    v.displayMatrix(matrix2);
                    System.out.println("=");
                    c.additionMatrix(matrix1, matrix2);
                    break;
                case 2:
                    row1 = v.getSize("Enter row of matrix 1: ");
                    col1 = v.getSize("Enter cols of matrix 1: ");
                    matrix1 = v.getMatrix(row1, col1);
                    do {
                        row2 = v.getSize("Enter row of matrix 2: ");
                        if (row2!=row1) {
                            System.out.println("Row 2 must equal row 1:");
                            continue;
                        }
                        col2 = v.getSize("Enter cols of matrix 2: ");
                        if (row2!=row1) {
                            System.out.println("Col 2 must equal col 1:");
                            continue;
                        }
                        break;
                    } while (true);
                    matrix2 = v.getMatrix(row2, col2);
                    v.displayMatrix(matrix1);
                    System.out.println("+");
                    v.displayMatrix(matrix2);
                    System.out.println("=");
                    c.subtractionMatrix(matrix1, matrix2);
                    break;
                case 3:
                    row1 = v.getSize("Enter row of matrix 1: ");
                    col1 = v.getSize("Enter cols of matrix 1: ");
                    matrix1 = v.getMatrix(row1, col1);
                    do {
                        row2 = v.getSize("Enter row of matrix 2: ");
                        if (row2 != col1) {
                            System.out.println("row 2 must equal col 1:");
                            continue;
                        }
                        col2 = v.getSize("Enter col of matrix 2: ");
                        break;
                    } while (true);
                    matrix2 = v.getMatrix(row2, col2);
                    v.displayMatrix(matrix1);
                    System.out.println("*");
                    v.displayMatrix(matrix2);
                    System.out.println("=");
                    c.multiplicationMatrix(matrix1, matrix2);
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
