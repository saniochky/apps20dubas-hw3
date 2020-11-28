package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smartArray, MyComparator cmp) {
        super(smartArray);
        Object[] newArray = this.smartArray.toArray();
        Arrays.sort(newArray, cmp);
        this.smartArray = new BaseArray(newArray);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Sorting";
    }

    @Override
    public int size() {
        return this.smartArray.size();
    }
}
