package by.bsuir.WT.lab1.task3.data;

public class Sequence {
    private double _initialValue;
    private double _endValue;
    private double _step;

    public Sequence(double first, double last, double step){
        this._initialValue = first;
        this._endValue = last;
        this._step = step;
    }

    public double getFirst() { return this._initialValue; }
    public double getLast() { return this._endValue; }
    public double getStep() { return this._step;}
}
