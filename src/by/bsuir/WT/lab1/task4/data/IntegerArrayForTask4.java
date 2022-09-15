package by.bsuir.WT.lab1.task4.data;

public class IntegerArrayForTask4 {
    private static int[] _numbers;
    private static int SIZE = 3; //16;

    static {
        _numbers = new int[] {4, 6, 8};//{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 20, 17, 200, 100, 1000};
    }

    public static int[] getArray() { return _numbers; }
    public static int getSize() { return SIZE; }
}
