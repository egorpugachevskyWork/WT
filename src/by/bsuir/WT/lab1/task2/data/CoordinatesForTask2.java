package by.bsuir.WT.lab1.task2.data;

import by.bsuir.WT.lab1.General.Coordinate;

public class CoordinatesForTask2 {
    private static Coordinate[] _coordinates;

    static {
        _coordinates = new Coordinate[] {
                new Coordinate(-1.5, 7.6),
                new Coordinate(0, 0),
                new Coordinate(-4, 4),
                new Coordinate(20, -11),
                new Coordinate(0, -3.1)

        };
    }

    public static Coordinate[] getCoordinates() { return _coordinates; }
}
