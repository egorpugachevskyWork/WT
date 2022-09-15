package by.bsuir.WT.lab1.task2.logic;

public class Task2 {
    public static boolean isCoordinateInMainArea(double x, double y){
        return isCoordinateInFirstArea(x, y) || isCoordinateInSecondArea(x, y);
    }

    private static boolean isCoordinateInFirstArea(double x, double y){
        return x >= -4 && x <= 4 && y >= 0 && y <= 5;
    }

    private static boolean isCoordinateInSecondArea(double x, double y){
        return x >= -6 && x <= 6 && y >=-3 && y <= 0;
    }
}
