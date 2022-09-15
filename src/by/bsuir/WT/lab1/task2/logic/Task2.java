package by.bsuir.WT.lab1.task2.logic;

public class Task2 {
    public static boolean IsCoordinateInMainArea(double x, double y){
        return IsCoordinateInFirstArea(x, y) || IsCoordinateInSecondArea(x, y);
    }

    private static boolean IsCoordinateInFirstArea(double x, double y){
        return x >= -4 && x <= 4 && y >= 0 && y <= 5;
    }

    private static boolean IsCoordinateInSecondArea(double x, double y){
        return x >= -6 && x <= 6 && y >=-3 && y <= 0;
    }
}
