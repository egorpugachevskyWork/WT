package by.bsuir.WT.lab1.task1.data;

import by.bsuir.WT.lab1.General.Coordinate;

public class CoordinatesForTask1 {
    private static Coordinate[] _coordinates;

    static {
        _coordinates = new Coordinate[] {
                new Coordinate(-1, 1),
                new Coordinate(0.5, 20),
                new Coordinate(-10, 11),
                new Coordinate(2, 2.1),
                new Coordinate(0.4, 0)

        };
    }

    public static Coordinate[] getCoordinates() { return _coordinates; }
}


