public class Triple <T,U,V>
{
    public T val1;
    public U val2;
    public V val3;

    public Triple(T val1, U val2, V val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public T getFirst() {
        return val1;
    }

    public U getSecond() {
        return val2;
    }

    public V getThird() {
        return val3;
    }

}
