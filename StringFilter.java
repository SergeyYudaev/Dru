
public class StringFilter<T extends String> implements Filter<T> {
    @Override
    public boolean apply(T o) {
        if (!o.startsWith("i") && !o.startsWith("I")) return true;
        return false;
    }
}
