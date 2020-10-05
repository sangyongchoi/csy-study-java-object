package chapter_10;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public void printSize(){
        System.out.println(addCount);
    }
}
