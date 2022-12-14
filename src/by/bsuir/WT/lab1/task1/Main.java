package by.bsuir.WT.lab1.task1;

import by.bsuir.WT.lab1.General.Coordinate;
import by.bsuir.WT.lab1.task1.data.CoordinatesForTask1;
import by.bsuir.WT.lab1.task1.logic.Task1;

import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {
        Coordinate[] coordinates = CoordinatesForTask1.coordinates;
        for (Coordinate coordinate: coordinates) {
            double x = coordinate.getX();
            double y = coordinate.getY();
            System.out.println("x = " + df.format(x) + ", y = " + df.format(y) +
                               ", result = " + df.format(Task1.mainFunction(x, y))
                    );
        }
    }
}
