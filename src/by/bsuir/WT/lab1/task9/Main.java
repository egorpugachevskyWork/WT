package by.bsuir.WT.lab1.task9;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args){
        List<Ball> balls = new ArrayList<Ball>(Arrays.asList(
                new Ball(1200, Color.RED),
                new Ball(500, Color.GREEN),
                new Ball(800, Color.RED),
                new Ball(700, Color.BLUE),
                new Ball(200, Color.BLUE)
        ));

        Basket basket = new Basket(new ArrayList<>());
        DisplayBasketInfo(basket);
        basket.addBalls(balls);
        DisplayBasketInfo(basket);
    }

    private static void DisplayBasketInfo(Basket basket){
        System.out.println("Summary weight: " + basket.calculateSummaryWeight() +
                " , Amount of blue balls: " + basket.calculateAmountBlueBalls());
        System.out.println();
    }
}
