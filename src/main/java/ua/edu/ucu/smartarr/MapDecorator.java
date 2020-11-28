package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        Object[] newArray = new Object[this.smartArray.size()];
        int index = 0;

        for (Object e: this.smartArray.toArray()) {
            newArray[index] = func.apply(e);
            index += 1;
        }

        this.smartArray = new BaseArray(newArray);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Map";
    }

    @Override
    public int size() {
        return this.smartArray.size();
    }
}
