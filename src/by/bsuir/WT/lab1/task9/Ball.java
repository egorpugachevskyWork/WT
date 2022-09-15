package by.bsuir.WT.lab1.task9;

public class Ball {
    private int weight = 500; // weight in gramms
    private Color color = Color.RED;

    public Ball(int weight, Color color){
        if (weight > 0)
            this.weight = weight;
        else
            this.weight = 1;
        this.color = color;
    }

    public int getWeight() { return weight; }
    public Color getColor() { return color; }
}
