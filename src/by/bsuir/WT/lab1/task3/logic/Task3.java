package by.bsuir.WT.lab1.task3.logic;


import by.bsuir.WT.lab1.General.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static List<Coordinate> calculateCoordinates(double first, double last, double step){
        List<Coordinate> coordinates = new ArrayList<>();
        if (validateInput(first, last, step)){
            if (first == last){
                coordinates.add(new Coordinate(first, mainFunction(first)));
            }
            else {
                if (step < 0) {
                    double[] swappedValues = SwapValues(first, last);
                    first = swappedValues[0];
                    last = swappedValues[1];
                    step *= -1;
                }

                coordinates.add(new Coordinate(first, mainFunction(first)));
                for (double i = first + step; last - i > 0.001; i += step) {
                    coordinates.add(new Coordinate(i, mainFunction(i)));
                }
                coordinates.add(new Coordinate(last, mainFunction(last)));
            }
        }

        return coordinates;
    }

    private static boolean validateInput(double first, double last, double step){
        return (last > first && step > 0) || (first > last && step < 0) || (first == last && step != 0);
    }

    private static double mainFunction(double x) { return Math.tan(x); }

    private static double[] SwapValues(double x, double y){
        return new double[] {y, x};
    }
}
