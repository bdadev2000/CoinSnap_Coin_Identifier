package com.bytedance.adsdk.lottie;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class rV<K, V> {
    rV<K, V>.lMd lMd;

    /* loaded from: classes.dex */
    public final class lMd implements Set<K> {
        public lMd() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k6) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            rV.this.KS();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (rV.this.zp(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return rV.zp(rV.this.lMd(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return rV.zp(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i9 = 0;
            for (int zp = rV.this.zp() - 1; zp >= 0; zp--) {
                Object zp2 = rV.this.zp(zp, 0);
                if (zp2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = zp2.hashCode();
                }
                i9 += hashCode;
            }
            return i9;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            if (rV.this.zp() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new zp(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int zp = rV.this.zp(obj);
            if (zp >= 0) {
                rV.this.zp(zp);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return rV.lMd(rV.this.lMd(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return rV.KS(rV.this.lMd(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return rV.this.zp();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return rV.this.lMd(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) rV.this.zp(tArr, 0);
        }
    }

    /* loaded from: classes.dex */
    public final class zp<T> implements Iterator<T> {
        int KS;
        boolean jU = false;
        int lMd;
        final int zp;

        public zp(int i9) {
            this.zp = i9;
            this.lMd = rV.this.zp();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.KS < this.lMd) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t9 = (T) rV.this.zp(this.KS, this.zp);
                this.KS++;
                this.jU = true;
                return t9;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.jU) {
                int i9 = this.KS - 1;
                this.KS = i9;
                this.lMd--;
                this.jU = false;
                rV.this.zp(i9);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static <K, V> boolean KS(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean lMd(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean zp(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract void KS();

    public Set<K> jU() {
        if (this.lMd == null) {
            this.lMd = new lMd();
        }
        return this.lMd;
    }

    public abstract Map<K, V> lMd();

    public abstract int zp();

    public abstract int zp(Object obj);

    public abstract Object zp(int i9, int i10);

    public abstract void zp(int i9);

    public <T> T[] zp(T[] tArr, int i9) {
        int zp2 = zp();
        if (tArr.length < zp2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), zp2));
        }
        for (int i10 = 0; i10 < zp2; i10++) {
            tArr[i10] = zp(i10, i9);
        }
        if (tArr.length > zp2) {
            tArr[zp2] = null;
        }
        return tArr;
    }

    public Object[] lMd(int i9) {
        int zp2 = zp();
        Object[] objArr = new Object[zp2];
        for (int i10 = 0; i10 < zp2; i10++) {
            objArr[i10] = zp(i10, i9);
        }
        return objArr;
    }

    public static <T> boolean zp(Set<T> set, Object obj) {
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
