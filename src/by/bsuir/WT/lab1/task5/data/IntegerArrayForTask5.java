package by.bsuir.WT.lab1.task5.data;

public class IntegerArrayForTask5 {
    private static int[] _numbers;
    private static int SIZE = 10;

    static {
        _numbers = new int[] {5, 1, 8, 12, 4, 5, 5, 5, 6, 14};
    }

    public static int[] getArray() { return _numbers; }
    public static int getSize() { return SIZE; }

}
