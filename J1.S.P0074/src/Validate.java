
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Validate {

    Scanner in = new Scanner(System.in);

    public int getChoice() {
        int number = 0;
        System.out.print("Enter your choice: ");
        do {
            try {
                number = Integer.parseInt(in.nextLine());
                if (number < 1 && number > 4) {
                    System.out.print("Input number 1-4: ");
                    continue;
                }
            } catch (Exception e) {
                System.out.print("Please input valid number: ");
                continue;
            }
            break;
        } while (true);
        return number;
    }

    public int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }

    }

    public int getNumber(int i, int j) {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        while (true) {
            try {
                System.out.format("Enter matrix[%d][%d]: ", i, j);
                id = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("please try again ");
                continue;
            }
            break;
        }
        return id;
    }
    public int[][] getMatrix(int row, int col) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = getNumber(i + 1, j + 1);
            }
        }
        return matrix;
    }

    public void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
    public int getSize(String mess) {
        while (true) {
            try {

                System.out.format(mess);
                int result = Integer.parseInt(in.nextLine());
                if (result > 0) {
                    return result;
                }
                else{
                    System.out.println("Number must be greater than 0");
                }
            } catch (Exception e) {
                System.out.println("please try again ");
            }
        }
    }
}
