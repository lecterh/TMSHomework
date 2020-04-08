package Task28;

public class MyClass<T> {
    private T[] el;

    public T getEl(int index) {
        return el[index];
    }

    public void setEl(T[] el) {
        this.el = el;
    }
}
