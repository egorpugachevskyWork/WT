package by.bsuir.WT.lab1.task3;

import by.bsuir.WT.lab1.General.Coordinate;
import by.bsuir.WT.lab1.task3.data.Sequence;
import by.bsuir.WT.lab1.task3.data.SequencesDataForTask3;
import by.bsuir.WT.lab1.task3.logic.Task3;

import java.text.DecimalFormat;
import java.util.List;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args){
        Sequence[] sequences = SequencesDataForTask3.getSequences();
        for (Sequence sequence : sequences){
            double first = sequence.getFirst();
            double last = sequence.getLast();
            double step = sequence.getStep();
            List<Coordinate> coordinates = Task3.calculateCoordinates(first, last, step);
            DisplayCoordinates(coordinates, first, last, step);
        }
    }

    private static void DisplayHeader(){
        System.out.println("-------------------------" +
                           "\nx                    F(x)");
    }

    private static void DisplayCoordinates(List<Coordinate> coordinates, double first, double last, double step){
        System.out.println("New table:");
        System.out.println("a = " + df.format(first) + " , b = " + df.format(last) +
                " , step = " + df.format(step));
        if (coordinates.isEmpty()){
            System.out.println("This values is incorrect");
        }
        else {
            DisplayHeader();
            for (Coordinate coordinate : coordinates){
                double x = coordinate.getX();
                double y = coordinate.getY();
                System.out.println(df.format(x) + "             " + df.format(y));
                System.out.println("_________________________");
            }
        }

        System.out.println("\n");
    }
}
