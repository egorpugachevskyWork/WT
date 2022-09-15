package by.bsuir.WT.lab1.task6.data;

public class IntegerArrayForTask6 {
    private static int[] _numbers;
    private static int SIZE = 15;

    static {
        _numbers = new int[] {4, 6, 48, 43, 53, 6, 7, 9, 11, 133, 230, 217, 200, 1010, 10020};
    }

    public static int[] getArray() { return _numbers; }
    public static int getSize() { return SIZE; }
}
