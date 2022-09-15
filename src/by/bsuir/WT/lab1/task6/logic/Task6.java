package by.bsuir.WT.lab1.task6.logic;

public class Task6 {
    public static int[][] makeSquareMatrix(int[] numbers, int size){
        int[][] matrix = new int[size][];
        for (int i = 0; i < size; ++i){
            matrix[i] = getShiftedArray(numbers, size, i);
        }

        return matrix;
    }

    private static int[] getShiftedArray(int[] numbers, int size, int shiftDegree){
        int[] newNumbers = new int[size];
        for (int i = 0; i < size; ++i) {
            newNumbers[i] =  numbers[(i + shiftDegree) % size];
        }

        return newNumbers;
    }
}
