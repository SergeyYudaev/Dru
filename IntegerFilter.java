public class IntegerFilter<T extends Number> implements Filter<T> {
    @Override
    public boolean apply(T o) {
        if (o.doubleValue() <= 10) return true;
        return false;
    }
}
