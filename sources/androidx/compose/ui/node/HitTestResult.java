package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import b1.f0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.e;

@StabilityInferred
/* loaded from: classes.dex */
public final class HitTestResult implements List<Modifier.Node>, r0.a {
    public int d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f15916a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public long[] f15917b = new long[16];

    /* renamed from: c, reason: collision with root package name */
    public int f15918c = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15919f = true;

    /* loaded from: classes.dex */
    public final class SubList implements List<Modifier.Node>, r0.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15923a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15924b;

        public SubList(int i2, int i3) {
            this.f15923a = i2;
            this.f15924b = i3;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i2, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof Modifier.Node) && indexOf((Modifier.Node) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((Modifier.Node) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Modifier.Node get(int i2) {
            Object obj = HitTestResult.this.f15916a[i2 + this.f15923a];
            p0.a.q(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return -1;
            }
            Modifier.Node node = (Modifier.Node) obj;
            int i2 = this.f15923a;
            int i3 = this.f15924b;
            if (i2 > i3) {
                return -1;
            }
            int i4 = i2;
            while (!p0.a.g(HitTestResult.this.f15916a[i4], node)) {
                if (i4 == i3) {
                    return -1;
                }
                i4++;
            }
            return i4 - i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            int i2 = this.f15923a;
            return new HitTestResultIterator(i2, i2, this.f15924b);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return -1;
            }
            Modifier.Node node = (Modifier.Node) obj;
            int i2 = this.f15924b;
            int i3 = this.f15923a;
            if (i3 > i2) {
                return -1;
            }
            while (!p0.a.g(HitTestResult.this.f15916a[i2], node)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - i3;
        }

        @Override // java.util.List
        public final ListIterator<Modifier.Node> listIterator() {
            int i2 = this.f15923a;
            return new HitTestResultIterator(i2, i2, this.f15924b);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ Modifier.Node remove(int i2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ Modifier.Node set(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f15924b - this.f15923a;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<Modifier.Node> subList(int i2, int i3) {
            int i4 = this.f15923a;
            return new SubList(i2 + i4, i4 + i3);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return e.C(this);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<Modifier.Node> listIterator(int i2) {
            int i3 = this.f15923a;
            int i4 = this.f15924b;
            return new HitTestResultIterator(i2 + i3, i3, i4);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return e.D(this, objArr);
        }
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long a2 = HitTestResultKt.a(Float.POSITIVE_INFINITY, false);
        int i2 = this.f15918c + 1;
        int p2 = f0.p(this);
        if (i2 <= p2) {
            while (true) {
                long j2 = this.f15917b[i2];
                if (DistanceAndInLayer.a(j2, a2) < 0) {
                    a2 = j2;
                }
                if (Float.intBitsToFloat((int) (a2 >> 32)) < 0.0f && ((int) (4294967295L & a2)) != 0) {
                    return a2;
                }
                if (i2 == p2) {
                    break;
                }
                i2++;
            }
        }
        return a2;
    }

    public final void c(Modifier.Node node, float f2, boolean z2, q0.a aVar) {
        int i2 = this.f15918c;
        int i3 = i2 + 1;
        this.f15918c = i3;
        Object[] objArr = this.f15916a;
        if (i3 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            p0.a.r(copyOf, "copyOf(this, newSize)");
            this.f15916a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f15917b, length);
            p0.a.r(copyOf2, "copyOf(this, newSize)");
            this.f15917b = copyOf2;
        }
        Object[] objArr2 = this.f15916a;
        int i4 = this.f15918c;
        objArr2[i4] = node;
        this.f15917b[i4] = HitTestResultKt.a(f2, z2);
        d();
        aVar.invoke();
        this.f15918c = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f15918c = -1;
        d();
        this.f15919f = true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof Modifier.Node) && indexOf((Modifier.Node) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Modifier.Node) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        int i2 = this.f15918c + 1;
        int p2 = f0.p(this);
        if (i2 <= p2) {
            while (true) {
                this.f15916a[i2] = null;
                if (i2 == p2) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.d = this.f15918c + 1;
    }

    @Override // java.util.List
    public final Modifier.Node get(int i2) {
        Object obj = this.f15916a[i2];
        p0.a.q(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Modifier.Node)) {
            return -1;
        }
        Modifier.Node node = (Modifier.Node) obj;
        int p2 = f0.p(this);
        if (p2 < 0) {
            return -1;
        }
        int i2 = 0;
        while (!p0.a.g(this.f15916a[i2], node)) {
            if (i2 == p2) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new HitTestResultIterator(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Modifier.Node)) {
            return -1;
        }
        Modifier.Node node = (Modifier.Node) obj;
        for (int p2 = f0.p(this); -1 < p2; p2--) {
            if (p0.a.g(this.f15916a[p2], node)) {
                return p2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Modifier.Node remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Modifier.Node set(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<Modifier.Node> subList(int i2, int i3) {
        return new SubList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return e.C(this);
    }

    /* loaded from: classes.dex */
    public final class HitTestResultIterator implements ListIterator<Modifier.Node>, r0.a {

        /* renamed from: a, reason: collision with root package name */
        public int f15920a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15921b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15922c;

        public HitTestResultIterator(HitTestResult hitTestResult, int i2, int i3) {
            this((i3 & 1) != 0 ? 0 : i2, 0, (i3 & 4) != 0 ? hitTestResult.d : 0);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f15920a < this.f15922c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f15920a > this.f15921b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            Object[] objArr = HitTestResult.this.f15916a;
            int i2 = this.f15920a;
            this.f15920a = i2 + 1;
            Object obj = objArr[i2];
            p0.a.q(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f15920a - this.f15921b;
        }

        @Override // java.util.ListIterator
        public final Modifier.Node previous() {
            Object[] objArr = HitTestResult.this.f15916a;
            int i2 = this.f15920a - 1;
            this.f15920a = i2;
            Object obj = objArr[i2];
            p0.a.q(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f15920a - this.f15921b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public HitTestResultIterator(int i2, int i3, int i4) {
            this.f15920a = i2;
            this.f15921b = i3;
            this.f15922c = i4;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<Modifier.Node> listIterator(int i2) {
        return new HitTestResultIterator(this, i2, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return e.D(this, objArr);
    }
}
