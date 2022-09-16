package by.bsuir.WT.lab1.task5.logic;

public class Task5 {
    public static int findAmountOfMaxIncreasingSubsequence(int[] numbers, int size){
        int[] lengthsOfSubSequences = new int[size];
        for (int i = 0; i < size; ++i){
            lengthsOfSubSequences[i] = 1;
        }

        for (int i = 1; i < size; ++i){
            for (int j = 0 ; j < i; ++j){
                if (numbers[i] > numbers[j]){
                    if (lengthsOfSubSequences[i] <= lengthsOfSubSequences[j]){
                        lengthsOfSubSequences[i] = lengthsOfSubSequences[j] + 1;
                    }
                }
            }
        }

        return findMaxElement(lengthsOfSubSequences, size);
    }

    private static int findMaxElement(int[] numbers, int size){
        if (size == 0){
            return 0;
        }
        int max = numbers[0];

        for (int i = 1; i < size; ++i){
            if (max < numbers[i]){
                max = numbers[i];
            }
        }

        return max;
    }
}
