package by.bsuir.WT.lab1.task7.logic;

public class Task7 {
    public static void sortNumbers(double[] numbers, int size){
        int i = 0;
        while (i < size - 1){
            while(i < size - 1 && numbers[i] - numbers[i + 1] <= 0.001 ){
                i++;
            }
            if (i < size - 1){
                swapNumbers(numbers, i);
                if (i > 0) i--;
            }
        }
    }

    private static void swapNumbers(double numbers[], int index){
        double tmp = numbers[index];
        numbers[index] = numbers[index + 1];
        numbers[index + 1] = tmp;
    }
}
