package ua.edu.ucu.smartarr;


import java.util.ArrayList;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        ArrayList<Object> arr = new ArrayList<>();
        int j;

        for (int i = 0; i < this.smartArray.size(); i++) {
            for (j = i + 1; j < this.smartArray.size(); j++) {
                if (this.smartArray.toArray()[i].toString().equals(
                        this.smartArray.toArray()[j].toString()
                )) {
                    break;
                }
            }

            if (j == this.smartArray.size()) {
                arr.add(this.smartArray.toArray()[i]);
            }
        }

        this.smartArray = new BaseArray(arr.toArray());
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "Duplicate items removal";
    }

    @Override
    public int size() {
        return this.smartArray.size();
    }
}
