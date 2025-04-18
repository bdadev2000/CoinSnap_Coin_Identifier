package androidx.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.e;
import r0.a;
import r0.c;

/* loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {

    /* loaded from: classes.dex */
    public static final class MutableObjectListIterator<T> implements ListIterator<T>, a {

        /* renamed from: a, reason: collision with root package name */
        public final List f1481a;

        /* renamed from: b, reason: collision with root package name */
        public int f1482b;

        public MutableObjectListIterator(List list, int i2) {
            p0.a.s(list, "list");
            this.f1481a = list;
            this.f1482b = i2 - 1;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            int i2 = this.f1482b + 1;
            this.f1482b = i2;
            this.f1481a.add(i2, obj);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f1482b < this.f1481a.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f1482b >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i2 = this.f1482b + 1;
            this.f1482b = i2;
            return this.f1481a.get(i2);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f1482b + 1;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            int i2 = this.f1482b;
            this.f1482b = i2 - 1;
            return this.f1481a.get(i2);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f1482b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f1481a.remove(this.f1482b);
            this.f1482b--;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.f1481a.set(this.f1482b, obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectListMutableList<T> implements List<T>, c {
        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            throw null;
        }

        @Override // java.util.List
        public final boolean addAll(int i2, Collection collection) {
            p0.a.s(collection, "elements");
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            p0.a.s(collection, "elements");
            throw null;
        }

        @Override // java.util.List
        public final Object get(int i2) {
            ObjectListKt.a(i2, this);
            throw null;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            throw null;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            throw null;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            p0.a.s(collection, "elements");
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            p0.a.s(collection, "elements");
            throw null;
        }

        @Override // java.util.List
        public final Object set(int i2, Object obj) {
            ObjectListKt.a(i2, this);
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            throw null;
        }

        @Override // java.util.List
        public final List subList(int i2, int i3) {
            ObjectListKt.b(i2, i3, this);
            return new SubList(i2, i3, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return e.C(this);
        }

        @Override // java.util.List
        public final void add(int i2, Object obj) {
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            p0.a.s(collection, "elements");
            throw null;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        @Override // java.util.List
        public final Object remove(int i2) {
            ObjectListKt.a(i2, this);
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            p0.a.s(objArr, "array");
            return e.D(this, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class SubList<T> implements List<T>, c {

        /* renamed from: a, reason: collision with root package name */
        public final List f1483a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1484b;

        /* renamed from: c, reason: collision with root package name */
        public int f1485c;

        public SubList(int i2, int i3, List list) {
            p0.a.s(list, "list");
            this.f1483a = list;
            this.f1484b = i2;
            this.f1485c = i3;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            int i2 = this.f1485c;
            this.f1485c = i2 + 1;
            this.f1483a.add(i2, obj);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i2, Collection collection) {
            p0.a.s(collection, "elements");
            this.f1483a.addAll(i2 + this.f1484b, collection);
            this.f1485c = collection.size() + this.f1485c;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i2 = this.f1485c - 1;
            int i3 = this.f1484b;
            if (i3 <= i2) {
                while (true) {
                    this.f1483a.remove(i2);
                    if (i2 == i3) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            this.f1485c = i3;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i2 = this.f1485c;
            for (int i3 = this.f1484b; i3 < i2; i3++) {
                if (p0.a.g(this.f1483a.get(i3), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            p0.a.s(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i2) {
            ObjectListKt.a(i2, this);
            return this.f1483a.get(i2 + this.f1484b);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i2 = this.f1485c;
            int i3 = this.f1484b;
            for (int i4 = i3; i4 < i2; i4++) {
                if (p0.a.g(this.f1483a.get(i4), obj)) {
                    return i4 - i3;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f1485c == this.f1484b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i2 = this.f1485c - 1;
            int i3 = this.f1484b;
            if (i3 > i2) {
                return -1;
            }
            while (!p0.a.g(this.f1483a.get(i2), obj)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - i3;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i2 = this.f1485c;
            for (int i3 = this.f1484b; i3 < i2; i3++) {
                List list = this.f1483a;
                if (p0.a.g(list.get(i3), obj)) {
                    list.remove(i3);
                    this.f1485c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            p0.a.s(collection, "elements");
            int i2 = this.f1485c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i2 != this.f1485c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            p0.a.s(collection, "elements");
            int i2 = this.f1485c;
            int i3 = i2 - 1;
            int i4 = this.f1484b;
            if (i4 <= i3) {
                while (true) {
                    List list = this.f1483a;
                    if (!collection.contains(list.get(i3))) {
                        list.remove(i3);
                        this.f1485c--;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3--;
                }
            }
            return i2 != this.f1485c;
        }

        @Override // java.util.List
        public final Object set(int i2, Object obj) {
            ObjectListKt.a(i2, this);
            return this.f1483a.set(i2 + this.f1484b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f1485c - this.f1484b;
        }

        @Override // java.util.List
        public final List subList(int i2, int i3) {
            ObjectListKt.b(i2, i3, this);
            return new SubList(i2, i3, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return e.C(this);
        }

        @Override // java.util.List
        public final void add(int i2, Object obj) {
            this.f1483a.add(i2 + this.f1484b, obj);
            this.f1485c++;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            p0.a.s(objArr, "array");
            return e.D(this, objArr);
        }

        @Override // java.util.List
        public final Object remove(int i2) {
            ObjectListKt.a(i2, this);
            this.f1485c--;
            return this.f1483a.remove(i2 + this.f1484b);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            p0.a.s(collection, "elements");
            this.f1483a.addAll(this.f1485c, collection);
            this.f1485c = collection.size() + this.f1485c;
            return collection.size() > 0;
        }
    }

    public MutableObjectList(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = ObjectListKt.f1552a;
        } else {
            objArr = new Object[i2];
        }
        this.f1549a = objArr;
    }

    public final void b(Object obj) {
        c(this.f1550b + 1);
        Object[] objArr = this.f1549a;
        int i2 = this.f1550b;
        objArr[i2] = obj;
        this.f1550b = i2 + 1;
    }

    public final void c(int i2) {
        Object[] objArr = this.f1549a;
        if (objArr.length < i2) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i2, (objArr.length * 3) / 2));
            p0.a.r(copyOf, "copyOf(this, newSize)");
            this.f1549a = copyOf;
        }
    }

    public /* synthetic */ MutableObjectList() {
        this(16);
    }
}
