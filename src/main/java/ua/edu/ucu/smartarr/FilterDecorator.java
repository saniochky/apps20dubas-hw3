package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {
        super(smartArray);
        int arraySize = 0;

        for (Object e: this.smartArray.toArray()) {
            if (pr.test(e)) {
                arraySize += 1;
            }
        }

        Object[] newArray = new Object[arraySize];

        for (Object e: this.smartArray.toArray()) {
            if (pr.test(e)) {
                newArray[newArray.length - arraySize] = e;
                arraySize -= 1;
            }
        }

        this.smartArray = new BaseArray(newArray);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Filter";
    }

    @Override
    public int size() {
        return this.smartArray.size();
    }
}
