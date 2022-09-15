package by.bsuir.WT.lab1.task7.data;

public class DoubleArrayForTask7 {
    private static double[] _numbers;
    private static int SIZE = 15;

    static {
        _numbers = new double[] {4, 6, 48, 43, 53, 6, 7, 9, 11, 133, 230, 217, 200, 1010, 10020};
    }

    public static double[] getArray() { return _numbers; }
    public static int getSize() { return SIZE; }
}
