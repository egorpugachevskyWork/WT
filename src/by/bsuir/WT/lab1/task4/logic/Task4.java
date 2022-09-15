package by.bsuir.WT.lab1.task4.logic;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static List<Integer> getPrimeIndexesFromArray(int[] numbers, int size){
        List<Integer> primeIndexes = new ArrayList<>();
        for (int i = 0; i < size; ++i){
            if(checkPrime(numbers[i])){
                primeIndexes.add(i);
            }
        }

        return primeIndexes;
    }

    private static boolean checkPrime(int number){
        int lastNumber = (int) Math.round(Math.sqrt(number));
        boolean isPrime = true;
        for (int i = 2; i <= lastNumber; ++i) {
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime && number != 1;
    }
}
