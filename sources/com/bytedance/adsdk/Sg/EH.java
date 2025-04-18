package com.bytedance.adsdk.Sg;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class EH<K, V> {
    EH<K, V>.Sg Sg;

    /* loaded from: classes.dex */
    public final class Sg implements Set<K> {
        public Sg() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            EH.this.tN();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return EH.this.YFl(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return EH.YFl(EH.this.Sg(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return EH.YFl(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i10 = 0;
            for (int YFl = EH.this.YFl() - 1; YFl >= 0; YFl--) {
                Object YFl2 = EH.this.YFl(YFl, 0);
                if (YFl2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = YFl2.hashCode();
                }
                i10 += hashCode;
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return EH.this.YFl() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new YFl(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int YFl = EH.this.YFl(obj);
            if (YFl >= 0) {
                EH.this.YFl(YFl);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return EH.Sg(EH.this.Sg(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return EH.tN(EH.this.Sg(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return EH.this.YFl();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return EH.this.Sg(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) EH.this.YFl(tArr, 0);
        }
    }

    /* loaded from: classes.dex */
    public final class YFl<T> implements Iterator<T> {
        boolean AlY = false;
        int Sg;
        final int YFl;
        int tN;

        public YFl(int i10) {
            this.YFl = i10;
            this.Sg = EH.this.YFl();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.tN < this.Sg;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t5 = (T) EH.this.YFl(this.tN, this.YFl);
                this.tN++;
                this.AlY = true;
                return t5;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.AlY) {
                int i10 = this.tN - 1;
                this.tN = i10;
                this.Sg--;
                this.AlY = false;
                EH.this.YFl(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static <K, V> boolean Sg(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean YFl(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean tN(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Set<K> AlY() {
        if (this.Sg == null) {
            this.Sg = new Sg();
        }
        return this.Sg;
    }

    public abstract Map<K, V> Sg();

    public abstract int YFl();

    public abstract int YFl(Object obj);

    public abstract Object YFl(int i10, int i11);

    public abstract void YFl(int i10);

    public abstract void tN();

    public <T> T[] YFl(T[] tArr, int i10) {
        int YFl2 = YFl();
        if (tArr.length < YFl2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), YFl2));
        }
        for (int i11 = 0; i11 < YFl2; i11++) {
            tArr[i11] = YFl(i11, i10);
        }
        if (tArr.length > YFl2) {
            tArr[YFl2] = null;
        }
        return tArr;
    }

    public Object[] Sg(int i10) {
        int YFl2 = YFl();
        Object[] objArr = new Object[YFl2];
        for (int i11 = 0; i11 < YFl2; i11++) {
            objArr[i11] = YFl(i11, i10);
        }
        return objArr;
    }

    public static <T> boolean YFl(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
