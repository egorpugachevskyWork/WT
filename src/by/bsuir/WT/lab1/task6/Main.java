package by.bsuir.WT.lab1.task6;

import by.bsuir.WT.lab1.task6.data.DoubleArrayForTask6;
import by.bsuir.WT.lab1.task6.logic.Task6;

import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args){
        double[] numbers = DoubleArrayForTask6.numbers;
        int size = DoubleArrayForTask6.SIZE;
        double[][] squareMatrix = Task6.makeSquareMatrix(numbers, size);
        DisplayMatrix(squareMatrix, size);
    }

    private static void DisplayMatrix(double[][] matrix, int size) {
        System.out.println("Received matrix: ");
        for (int i = 0; i < size; ++i){
            for (int j = 0; j < size; ++j){
                System.out.printf("%6s ", df.format(matrix[i][j]));
            }
            System.out.println();
        }
    }
}
