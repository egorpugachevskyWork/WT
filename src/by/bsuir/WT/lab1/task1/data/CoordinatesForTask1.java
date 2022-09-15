package by.bsuir.WT.lab1.task1.data;

import by.bsuir.WT.lab1.General.Coordinates;

public class CoordinatesForTask1 {
    private static final Coordinates[] _coordinates;

    static {
        _coordinates = new Coordinates[] {
                new Coordinates(-1, 1),
                new Coordinates(0.5, 20),
                new Coordinates(-10, 11),
                new Coordinates(2, 2.1),
                new Coordinates(0.4, 0)

        };
    }

    public static Coordinates[] getCoordinates() { return _coordinates; }
}


