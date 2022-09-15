package by.bsuir.WT.lab1.task8.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequencesForTask8 {
    private static List<Double> _aSequence;
    private static List<Double> _bSequence;

    static {
        _bSequence = new ArrayList<Double>(Arrays.asList(2.0, 4.0, 6.0, 8.0, 10.0, 12.0));
        _aSequence = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 5.0, 7.0, 9.0, 11.0));
    }

    public static List<Double> getASequence() { return _aSequence; }
    public static List<Double> getBSequence() { return _bSequence; }
}
