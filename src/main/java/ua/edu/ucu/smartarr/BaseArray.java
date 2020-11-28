package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] objects;

    public BaseArray(Object[] objects) {
        this.objects = new Object[objects.length];
        System.arraycopy(objects, 0, this.objects, 0, objects.length);
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(this.objects, this.objects.length);
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return this.objects.length;
    }
}
