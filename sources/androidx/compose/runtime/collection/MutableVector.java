package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import e0.q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.e;
import p0.a;
import r0.c;

@StabilityInferred
/* loaded from: classes.dex */
public final class MutableVector<T> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f14142a;

    /* renamed from: b, reason: collision with root package name */
    public List f14143b;

    /* renamed from: c, reason: collision with root package name */
    public int f14144c = 0;

    /* loaded from: classes.dex */
    public static final class MutableVectorList<T> implements List<T>, c {

        /* renamed from: a, reason: collision with root package name */
        public final MutableVector f14145a;

        public MutableVectorList(MutableVector mutableVector) {
            this.f14145a = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            this.f14145a.b(obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            MutableVector mutableVector = this.f14145a;
            return mutableVector.e(mutableVector.f14144c, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f14145a.g();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f14145a.h(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            MutableVector mutableVector = this.f14145a;
            mutableVector.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!mutableVector.h(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i2) {
            MutableVectorKt.a(i2, this);
            return this.f14145a.f14142a[i2];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f14145a.k(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f14145a.l();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            MutableVector mutableVector = this.f14145a;
            int i2 = mutableVector.f14144c;
            if (i2 > 0) {
                int i3 = i2 - 1;
                Object[] objArr = mutableVector.f14142a;
                while (!a.g(obj, objArr[i3])) {
                    i3--;
                    if (i3 < 0) {
                    }
                }
                return i3;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f14145a.n(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            MutableVector mutableVector = this.f14145a;
            mutableVector.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i2 = mutableVector.f14144c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                mutableVector.n(it.next());
            }
            return i2 != mutableVector.f14144c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            MutableVector mutableVector = this.f14145a;
            int i2 = mutableVector.f14144c;
            for (int i3 = i2 - 1; -1 < i3; i3--) {
                if (!collection.contains(mutableVector.f14142a[i3])) {
                    mutableVector.o(i3);
                }
            }
            return i2 != mutableVector.f14144c;
        }

        @Override // java.util.List
        public final Object set(int i2, Object obj) {
            MutableVectorKt.a(i2, this);
            Object[] objArr = this.f14145a.f14142a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f14145a.f14144c;
        }

        @Override // java.util.List
        public final List subList(int i2, int i3) {
            MutableVectorKt.b(i2, i3, this);
            return new SubList(i2, i3, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return e.C(this);
        }

        @Override // java.util.List
        public final void add(int i2, Object obj) {
            this.f14145a.a(i2, obj);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i2) {
            return new VectorListIterator(this, i2);
        }

        @Override // java.util.List
        public final Object remove(int i2) {
            MutableVectorKt.a(i2, this);
            return this.f14145a.o(i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return e.D(this, objArr);
        }

        @Override // java.util.List
        public final boolean addAll(int i2, Collection collection) {
            return this.f14145a.e(i2, collection);
        }
    }

    /* loaded from: classes.dex */
    public static final class SubList<T> implements List<T>, c {

        /* renamed from: a, reason: collision with root package name */
        public final List f14146a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14147b;

        /* renamed from: c, reason: collision with root package name */
        public int f14148c;

        public SubList(int i2, int i3, List list) {
            this.f14146a = list;
            this.f14147b = i2;
            this.f14148c = i3;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            int i2 = this.f14148c;
            this.f14148c = i2 + 1;
            this.f14146a.add(i2, obj);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i2, Collection collection) {
            this.f14146a.addAll(i2 + this.f14147b, collection);
            this.f14148c = collection.size() + this.f14148c;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i2 = this.f14148c - 1;
            int i3 = this.f14147b;
            if (i3 <= i2) {
                while (true) {
                    this.f14146a.remove(i2);
                    if (i2 == i3) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            this.f14148c = i3;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i2 = this.f14148c;
            for (int i3 = this.f14147b; i3 < i2; i3++) {
                if (a.g(this.f14146a.get(i3), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
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
            MutableVectorKt.a(i2, this);
            return this.f14146a.get(i2 + this.f14147b);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i2 = this.f14148c;
            int i3 = this.f14147b;
            for (int i4 = i3; i4 < i2; i4++) {
                if (a.g(this.f14146a.get(i4), obj)) {
                    return i4 - i3;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f14148c == this.f14147b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i2 = this.f14148c - 1;
            int i3 = this.f14147b;
            if (i3 > i2) {
                return -1;
            }
            while (!a.g(this.f14146a.get(i2), obj)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - i3;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i2 = this.f14148c;
            for (int i3 = this.f14147b; i3 < i2; i3++) {
                List list = this.f14146a;
                if (a.g(list.get(i3), obj)) {
                    list.remove(i3);
                    this.f14148c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            int i2 = this.f14148c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i2 != this.f14148c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            int i2 = this.f14148c;
            int i3 = i2 - 1;
            int i4 = this.f14147b;
            if (i4 <= i3) {
                while (true) {
                    List list = this.f14146a;
                    if (!collection.contains(list.get(i3))) {
                        list.remove(i3);
                        this.f14148c--;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3--;
                }
            }
            return i2 != this.f14148c;
        }

        @Override // java.util.List
        public final Object set(int i2, Object obj) {
            MutableVectorKt.a(i2, this);
            return this.f14146a.set(i2 + this.f14147b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f14148c - this.f14147b;
        }

        @Override // java.util.List
        public final List subList(int i2, int i3) {
            MutableVectorKt.b(i2, i3, this);
            return new SubList(i2, i3, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return e.C(this);
        }

        @Override // java.util.List
        public final void add(int i2, Object obj) {
            this.f14146a.add(i2 + this.f14147b, obj);
            this.f14148c++;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i2) {
            return new VectorListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return e.D(this, objArr);
        }

        @Override // java.util.List
        public final Object remove(int i2) {
            MutableVectorKt.a(i2, this);
            this.f14148c--;
            return this.f14146a.remove(i2 + this.f14147b);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            this.f14146a.addAll(this.f14148c, collection);
            this.f14148c = collection.size() + this.f14148c;
            return collection.size() > 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class VectorListIterator<T> implements ListIterator<T>, r0.a {

        /* renamed from: a, reason: collision with root package name */
        public final List f14149a;

        /* renamed from: b, reason: collision with root package name */
        public int f14150b;

        public VectorListIterator(List list, int i2) {
            this.f14149a = list;
            this.f14150b = i2;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            this.f14149a.add(this.f14150b, obj);
            this.f14150b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f14150b < this.f14149a.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f14150b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i2 = this.f14150b;
            this.f14150b = i2 + 1;
            return this.f14149a.get(i2);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f14150b;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            int i2 = this.f14150b - 1;
            this.f14150b = i2;
            return this.f14149a.get(i2);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f14150b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i2 = this.f14150b - 1;
            this.f14150b = i2;
            this.f14149a.remove(i2);
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.f14149a.set(this.f14150b, obj);
        }
    }

    public MutableVector(Object[] objArr) {
        this.f14142a = objArr;
    }

    public final void a(int i2, Object obj) {
        j(this.f14144c + 1);
        Object[] objArr = this.f14142a;
        int i3 = this.f14144c;
        if (i2 != i3) {
            q.P(i2 + 1, i2, objArr, i3, objArr);
        }
        objArr[i2] = obj;
        this.f14144c++;
    }

    public final void b(Object obj) {
        j(this.f14144c + 1);
        Object[] objArr = this.f14142a;
        int i2 = this.f14144c;
        objArr[i2] = obj;
        this.f14144c = i2 + 1;
    }

    public final void c(int i2, MutableVector mutableVector) {
        if (mutableVector.l()) {
            return;
        }
        j(this.f14144c + mutableVector.f14144c);
        Object[] objArr = this.f14142a;
        int i3 = this.f14144c;
        if (i2 != i3) {
            q.P(mutableVector.f14144c + i2, i2, objArr, i3, objArr);
        }
        q.P(i2, 0, mutableVector.f14142a, mutableVector.f14144c, objArr);
        this.f14144c += mutableVector.f14144c;
    }

    public final void d(int i2, List list) {
        if (list.isEmpty()) {
            return;
        }
        j(list.size() + this.f14144c);
        Object[] objArr = this.f14142a;
        if (i2 != this.f14144c) {
            q.P(list.size() + i2, i2, objArr, this.f14144c, objArr);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = list.get(i3);
        }
        this.f14144c = list.size() + this.f14144c;
    }

    public final boolean e(int i2, Collection collection) {
        int i3 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size() + this.f14144c);
        Object[] objArr = this.f14142a;
        if (i2 != this.f14144c) {
            q.P(collection.size() + i2, i2, objArr, this.f14144c, objArr);
        }
        for (T t2 : collection) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                f0.D();
                throw null;
            }
            objArr[i3 + i2] = t2;
            i3 = i4;
        }
        this.f14144c = collection.size() + this.f14144c;
        return true;
    }

    public final List f() {
        List list = this.f14143b;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.f14143b = mutableVectorList;
        return mutableVectorList;
    }

    public final void g() {
        Object[] objArr = this.f14142a;
        int i2 = this.f14144c;
        while (true) {
            i2--;
            if (-1 >= i2) {
                this.f14144c = 0;
                return;
            }
            objArr[i2] = null;
        }
    }

    public final boolean h(Object obj) {
        int i2 = this.f14144c - 1;
        if (i2 >= 0) {
            for (int i3 = 0; !a.g(this.f14142a[i3], obj); i3++) {
                if (i3 != i2) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j(int i2) {
        Object[] objArr = this.f14142a;
        if (objArr.length < i2) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i2, objArr.length * 2));
            a.r(copyOf, "copyOf(this, newSize)");
            this.f14142a = copyOf;
        }
    }

    public final int k(Object obj) {
        int i2 = this.f14144c;
        if (i2 <= 0) {
            return -1;
        }
        Object[] objArr = this.f14142a;
        int i3 = 0;
        while (!a.g(obj, objArr[i3])) {
            i3++;
            if (i3 >= i2) {
                return -1;
            }
        }
        return i3;
    }

    public final boolean l() {
        return this.f14144c == 0;
    }

    public final boolean m() {
        return this.f14144c != 0;
    }

    public final boolean n(Object obj) {
        int k2 = k(obj);
        if (k2 < 0) {
            return false;
        }
        o(k2);
        return true;
    }

    public final Object o(int i2) {
        Object[] objArr = this.f14142a;
        Object obj = objArr[i2];
        int i3 = this.f14144c;
        if (i2 != i3 - 1) {
            q.P(i2, i2 + 1, objArr, i3, objArr);
        }
        int i4 = this.f14144c - 1;
        this.f14144c = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void p(int i2, int i3) {
        if (i3 > i2) {
            int i4 = this.f14144c;
            if (i3 < i4) {
                Object[] objArr = this.f14142a;
                q.P(i2, i3, objArr, i4, objArr);
            }
            int i5 = this.f14144c;
            int i6 = i5 - (i3 - i2);
            int i7 = i5 - 1;
            if (i6 <= i7) {
                int i8 = i6;
                while (true) {
                    this.f14142a[i8] = null;
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f14144c = i6;
        }
    }

    public final void q(Comparator comparator) {
        Object[] objArr = this.f14142a;
        int i2 = this.f14144c;
        a.s(objArr, "<this>");
        Arrays.sort(objArr, 0, i2, comparator);
    }
}
