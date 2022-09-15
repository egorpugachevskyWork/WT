package by.bsuir.WT.lab1.task6;

import by.bsuir.WT.lab1.task6.data.IntegerArrayForTask6;
import by.bsuir.WT.lab1.task6.logic.Task6;

public class Main {
    public static void main(String[] args){
        int[] numbers = IntegerArrayForTask6.getArray();
        int size = IntegerArrayForTask6.getSize();
        int[][] squareMatrix = Task6.makeSquareMatrix(numbers, size);
        DisplayMatrix(squareMatrix, size);
    }

    private static void DisplayMatrix(int[][] matrix, int size) {
        System.out.println("Received matrix: ");
        for (int i = 0; i < size; ++i){
            for (int j = 0; j < size; ++j){
                System.out.printf("%6d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
