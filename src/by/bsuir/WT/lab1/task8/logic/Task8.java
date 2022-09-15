package by.bsuir.WT.lab1.task8.logic;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static List<Double> mergeSequences(List<Double> aSeq, List<Double> bSeq){
        List<Double> mergedSeq = new ArrayList<>();
        int sizeA = aSeq.size();
        int sizeB = bSeq.size();
        int maxSize = Math.max(sizeA, sizeB);

        int indexA = 0;
        int indexB = 0;
        while (indexA + indexB < sizeA + sizeB){
            if (indexA < sizeA && indexB < sizeB){
                double aElement = aSeq.get(indexA);
                double bElement = bSeq.get(indexB);
                if (aElement <= bElement){
                    indexA++;
                    mergedSeq.add(aElement);
                }
                else {
                    indexB++;
                    mergedSeq.add(bElement);
                }
            }
            else if (indexA < sizeA){
                double aElement = aSeq.get(indexA);
                indexA++;
                mergedSeq.add(aElement);
            }
            else {
                double bElement = bSeq.get(indexB);
                indexB++;
                mergedSeq.add(bElement);
            }
        }

        return mergedSeq;
    }
}
