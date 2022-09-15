package by.bsuir.WT.lab1.task1.logic;

public class Task1 {
    public static double MainFunction(double x, double y){
        return (1 + SquareSinSumFunction(x, y)) / (2 + AbsFunction(x, y)) + x;
    }

    private static double AbsFunction(double x, double y){
        return Math.abs(x - (2 * x) / (1 + x * x * y * y));
    }

    private static double SquareSinSumFunction(double x, double y){
        double resultSinFunction = Math.sin(x + y);
        return resultSinFunction * resultSinFunction;
    }
}
