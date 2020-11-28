package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] objects;

    public BaseArray(Object[] objects) {
        this.objects = new Object[objects.length];
        System.arraycopy(objects, 0, this.objects, 0, objects.length);
    }

    @Override
    public Object[] toArray() {
        return this.objects;
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
