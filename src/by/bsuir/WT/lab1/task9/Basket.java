package by.bsuir.WT.lab1.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;
    {
        balls = new ArrayList<>();
    }

    public Basket(List<Ball> balls){
        this.balls = balls;
    }

    public void addBalls(List<Ball> balls){
        this.balls.addAll(balls);
    }

    public int calculateSummaryWeight() {
        int sum = 0;
        for (Ball ball : balls){
            sum += ball.getWeight();
        }

        return sum;
    }

    public int calculateAmountBlueBalls(){
        int amount = 0;
        for (Ball ball : balls){
            if (ball.getColor() == Color.BLUE) amount++;
        }

        return amount;
    }
}
