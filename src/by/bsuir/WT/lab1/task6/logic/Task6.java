package by.bsuir.WT.lab1.task6.logic;

public class Task6 {
    public static double[][] makeSquareMatrix(double[] numbers, int size){
        double[][] matrix = new double[size][];
        for (int i = 0; i < size; ++i){
            matrix[i] = getShiftedArray(numbers, size, i);
        }

        return matrix;
    }

    private static double[] getShiftedArray(double[] numbers, int size, int shiftDegree){
        double[] newNumbers = new double[size];
        for (int i = 0; i < size; ++i) {
            newNumbers[i] =  numbers[(i + shiftDegree) % size];
        }

        return newNumbers;
    }
}
