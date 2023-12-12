package genealogy;

import java.util.Iterator;

public interface GenealogicalTree<T> extends Iterable<T> {
    void add(T item);
    void remove(T item);
    boolean contains(T item);

    @Override
    Iterator<T> iterator();
}