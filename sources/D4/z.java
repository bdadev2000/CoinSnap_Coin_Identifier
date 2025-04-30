package d4;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class z extends u implements NavigableSet, N {

    /* renamed from: f, reason: collision with root package name */
    public final transient Comparator f19889f;

    /* renamed from: g, reason: collision with root package name */
    public transient z f19890g;

    public z(Comparator comparator) {
        this.f19889f = comparator;
    }

    public static L k(Comparator comparator, int i9, Object... objArr) {
        if (i9 == 0) {
            return l(comparator);
        }
        R2.b.i(i9, objArr);
        Arrays.sort(objArr, 0, i9, comparator);
        int i10 = 1;
        for (int i11 = 1; i11 < i9; i11++) {
            Object obj = objArr[i11];
            if (comparator.compare(obj, objArr[i10 - 1]) != 0) {
                objArr[i10] = obj;
                i10++;
            }
        }
        Arrays.fill(objArr, i10, i9, (Object) null);
        if (i10 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new L(AbstractC2186n.h(i10, objArr), comparator);
    }

    public static L l(Comparator comparator) {
        if (C.b.equals(comparator)) {
            return L.f19848i;
        }
        return new L(E.f19825g, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f19889f;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        z zVar = this.f19890g;
        if (zVar == null) {
            L l = (L) this;
            Comparator reverseOrder = Collections.reverseOrder(l.f19889f);
            if (l.isEmpty()) {
                zVar = l(reverseOrder);
            } else {
                zVar = new L(l.f19849h.k(), reverseOrder);
            }
            this.f19890g = zVar;
            zVar.f19890g = this;
        }
        return zVar;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z8) {
        obj.getClass();
        L l = (L) this;
        return l.m(0, l.n(obj, z8));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z8, Object obj2, boolean z9) {
        obj.getClass();
        obj2.getClass();
        if (this.f19889f.compare(obj, obj2) <= 0) {
            L l = (L) this;
            L m = l.m(l.o(obj, z8), l.f19849h.size());
            return m.m(0, m.n(obj2, z9));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z8) {
        obj.getClass();
        L l = (L) this;
        return l.m(l.o(obj, z8), l.f19849h.size());
    }

    @Override // d4.u, d4.AbstractC2180h
    public Object writeReplace() {
        return new y(this.f19889f, toArray(AbstractC2180h.b));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        L l = (L) this;
        return l.m(0, l.n(obj, false));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        L l = (L) this;
        return l.m(l.o(obj, true), l.f19849h.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.f19889f.compare(obj, obj2) <= 0) {
            L l = (L) this;
            L m = l.m(l.o(obj, true), l.f19849h.size());
            return m.m(0, m.n(obj2, false));
        }
        throw new IllegalArgumentException();
    }
}
