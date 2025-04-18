package org.objectweb.asm.tree.analysis;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
final class SmallSet<T> extends AbstractSet<T> {
    private final T element1;
    private final T element2;

    /* loaded from: classes3.dex */
    public static class IteratorImpl<T> implements Iterator<T> {
        private T firstElement;
        private T secondElement;

        public IteratorImpl(T t2, T t3) {
            this.firstElement = t2;
            this.secondElement = t3;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.firstElement != null;
        }

        @Override // java.util.Iterator
        public T next() {
            T t2 = this.firstElement;
            if (t2 == null) {
                throw new NoSuchElementException();
            }
            this.firstElement = this.secondElement;
            this.secondElement = null;
            return t2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public SmallSet() {
        this.element1 = null;
        this.element2 = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        return new IteratorImpl(this.element1, this.element2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (this.element1 == null) {
            return 0;
        }
        return this.element2 == null ? 1 : 2;
    }

    public Set<T> union(SmallSet<T> smallSet) {
        T t2;
        T t3 = smallSet.element1;
        T t4 = this.element1;
        if ((t3 == t4 && smallSet.element2 == this.element2) || ((t3 == (t2 = this.element2) && smallSet.element2 == t4) || t3 == null)) {
            return this;
        }
        if (t4 == null) {
            return smallSet;
        }
        T t5 = smallSet.element2;
        if (t5 == null) {
            if (t2 == null) {
                return new SmallSet(t4, t3);
            }
            if (t3 == t4 || t3 == t2) {
                return this;
            }
        }
        if (t2 == null && (t4 == t3 || t4 == t5)) {
            return smallSet;
        }
        HashSet hashSet = new HashSet(4);
        hashSet.add(this.element1);
        T t6 = this.element2;
        if (t6 != null) {
            hashSet.add(t6);
        }
        hashSet.add(smallSet.element1);
        T t7 = smallSet.element2;
        if (t7 != null) {
            hashSet.add(t7);
        }
        return hashSet;
    }

    public SmallSet(T t2) {
        this.element1 = t2;
        this.element2 = null;
    }

    private SmallSet(T t2, T t3) {
        this.element1 = t2;
        this.element2 = t3;
    }
}
