package by.bsuir.WT.lab1.task3.data;

public class SequencesDataForTask3 {
    private static final Sequence[] _sequences;

    static {
        _sequences = new Sequence[] {
                new Sequence(0, 0, 0),
                new Sequence(1.44, 2.55, 0.1),
                new Sequence(2, 3, 50),
                new Sequence(10, -3, -2),
                new Sequence(-10, -2, 0.5),
                new Sequence(-2, -10, -1),
                new Sequence(0.5, 0.5, 1)
        };
    }

    public static Sequence[] getSequences(){ return _sequences; }
}
