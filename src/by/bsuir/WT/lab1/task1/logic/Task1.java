package by.bsuir.WT.lab1.task1.logic;

public class Task1 {
    public static double mainFunction(double x, double y){
        return (1 + squareSinSumFunction(x, y)) / (2 + absFunction(x, y)) + x;
    }

    private static double absFunction(double x, double y){
        return Math.abs(x - (2 * x) / (1 + x * x * y * y));
    }

    private static double squareSinSumFunction(double x, double y){
        double resultSinFunction = Math.sin(x + y);
        return resultSinFunction * resultSinFunction;
    }
}
