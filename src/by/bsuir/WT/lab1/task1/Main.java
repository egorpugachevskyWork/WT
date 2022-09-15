package by.bsuir.WT.lab1.task1;

import by.bsuir.WT.lab1.General.Coordinates;
import by.bsuir.WT.lab1.task1.data.CoordinatesForTask1;
import by.bsuir.WT.lab1.task1.logic.Task1;

import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {
        Coordinates[] coordinates = CoordinatesForTask1.GetCoordinates();
        for (Coordinates coordinate: coordinates) {
            double x = coordinate.GetX();
            double y = coordinate.GetY();
            System.out.println("x = " + df.format(x) + ", y = " + df.format(y) +
                               ", result = " + df.format(Task1.MainFunction(x, y))
                    );
        }
    }
}
