package by.bsuir.WT.lab1.task5;

import by.bsuir.WT.lab1.task5.data.IntegerArrayForTask5;
import by.bsuir.WT.lab1.task5.logic.Task5;

public class Main {
    public static void main(String[] args){
        int[] numbers = IntegerArrayForTask5.getArray();
        int size = IntegerArrayForTask5.getSize();

        int amountOfSequence = size - Task5.findAmountOfMaxIncreasingSubsequence(numbers, size);
        DisplayAmountOfErasedElements(amountOfSequence);
    }

    public static void DisplayAmountOfErasedElements(int amount){
        System.out.println("Amount of erased elements for max increasing subsequence: " + amount);
    }
}
