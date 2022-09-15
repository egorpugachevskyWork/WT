package by.bsuir.WT.lab1.task4;

import by.bsuir.WT.lab1.task4.data.IntegerArrayForTask4;
import by.bsuir.WT.lab1.task4.logic.Task4;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] numbers = IntegerArrayForTask4.getArray();
        int size = IntegerArrayForTask4.getSize();
        List<Integer> primeIndexes = Task4.getPrimeIndexesFromArray(numbers, size);
        DisplayPrimeElements(primeIndexes);
    }

    private static void DisplayPrimeElements(List<Integer> primeIndexes){
        if (primeIndexes.isEmpty()){
            System.out.println("There are no such elements");
        }
        else {
            System.out.println("Indexes of such elements: ");
            for (int index : primeIndexes) {
                System.out.print(index + " ");
            }
        }
    }
}
