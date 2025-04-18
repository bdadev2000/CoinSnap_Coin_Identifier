package androidx.collection;

import e0.u;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.e;
import p0.a;
import r0.b;

/* loaded from: classes2.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1 implements Collection<Object>, b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap f1515a = null;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        a.s(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f1515a.e();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1515a.b(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        a.s(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f1515a.b(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f1515a.d();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new MutableScatterMap$MutableMapWrapper$values$1$iterator$1(this.f1515a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        MutableScatterMap mutableScatterMap = this.f1515a;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (a.g(mutableScatterMap.f1559c[i5], obj)) {
                                mutableScatterMap.j(i5);
                                return true;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        a.s(collection, "elements");
        MutableScatterMap mutableScatterMap = this.f1515a;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        boolean z2 = false;
        if (length >= 0) {
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (u.A0(collection, mutableScatterMap.f1559c[i5])) {
                                mutableScatterMap.j(i5);
                                z3 = true;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return z3;
                    }
                }
                if (i2 == length) {
                    z2 = z3;
                    break;
                }
                i2++;
            }
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        a.s(collection, "elements");
        MutableScatterMap mutableScatterMap = this.f1515a;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        boolean z2 = false;
        if (length >= 0) {
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!u.A0(collection, mutableScatterMap.f1559c[i5])) {
                                mutableScatterMap.j(i5);
                                z3 = true;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return z3;
                    }
                }
                if (i2 == length) {
                    z2 = z3;
                    break;
                }
                i2++;
            }
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f1515a.e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return e.C(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        a.s(objArr, "array");
        return e.D(this, objArr);
    }
}
