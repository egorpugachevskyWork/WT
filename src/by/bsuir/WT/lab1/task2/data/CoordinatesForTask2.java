package by.bsuir.WT.lab1.task2.data;

import by.bsuir.WT.lab1.General.Coordinates;

public class CoordinatesForTask2 {
    private static final Coordinates[] _coordinates;

    static {
        _coordinates = new Coordinates[] {
                new Coordinates(-1.5, 7.6),
                new Coordinates(0, 0),
                new Coordinates(-4, 4),
                new Coordinates(20, -11),
                new Coordinates(0, -3.1)

        };
    }

    public static Coordinates[] getCoordinates() { return _coordinates; }
}
