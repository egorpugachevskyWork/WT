package by.bsuir.WT.lab1.task8;

import by.bsuir.WT.lab1.task8.data.SequencesForTask8;
import by.bsuir.WT.lab1.task8.logic.Task8;

import java.text.DecimalFormat;
import java.util.List;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args){
        List<Double> aSeq = SequencesForTask8.getASequence();
        DisplaySequence(aSeq);
        List<Double> bSeq = SequencesForTask8.getBSequence();
        DisplaySequence(bSeq);
        aSeq = Task8.mergeSequences(aSeq, bSeq);
        DisplaySequence(aSeq);
    }

    private static void DisplaySequence(List<Double> sequence){
        for (double element : sequence){
            System.out.print(df.format(element) + " ");
        }
        System.out.println();
    }
}
