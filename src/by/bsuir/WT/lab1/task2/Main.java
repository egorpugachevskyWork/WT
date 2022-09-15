package by.bsuir.WT.lab1.task2;

import by.bsuir.WT.lab1.General.Coordinates;
import by.bsuir.WT.lab1.task2.data.CoordinatesForTask2;
import by.bsuir.WT.lab1.task2.logic.Task2;

import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args){
        Coordinates[] coordinates = CoordinatesForTask2.getCoordinates();
        for (Coordinates coordinate : coordinates){
            double x = coordinate.getX();
            double y = coordinate.getY();
            System.out.print("Coordinate with x = " + df.format(x) + ", y = " + df.format(y));
            if (Task2.IsCoordinateInMainArea(x, y)){
                System.out.println(" is in function range");
            }
            else {
                System.out.println(" isn't in function range");
            }
        }
    }
}
