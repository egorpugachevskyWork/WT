package by.bsuir.WT.lab1.task7;

import by.bsuir.WT.lab1.task7.data.DoubleArrayForTask7;
import by.bsuir.WT.lab1.task7.logic.Task7;

import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args){
        double[] numbers = DoubleArrayForTask7.numbers;
        int size = DoubleArrayForTask7.SIZE;
        DisplayNumbers(numbers, size);
        Task7.sortNumbers(numbers, size);
        DisplayNumbers(numbers, size);
    }

    private static void DisplayNumbers(double[] numbers, int size){
        System.out.println("Numbers: ");
        for (int i = 0; i < size; ++i){
            System.out.print(df.format(numbers[i]) + "  ");
        }
        System.out.println();
    }
}
