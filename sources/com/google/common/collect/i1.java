package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class i1 extends b1 implements NavigableSet, o2 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f11973h = 0;

    /* renamed from: f, reason: collision with root package name */
    public final transient Comparator f11974f;

    /* renamed from: g, reason: collision with root package name */
    public transient i1 f11975g;

    public i1(Comparator comparator) {
        this.f11974f = comparator;
    }

    public static g2 q(int i10, Comparator comparator, Object... objArr) {
        if (i10 == 0) {
            return r(comparator);
        }
        v8.u0.h(i10, objArr);
        Arrays.sort(objArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (comparator.compare(obj, objArr[i11 - 1]) != 0) {
                objArr[i11] = obj;
                i11++;
            }
        }
        Arrays.fill(objArr, i11, i10, (Object) null);
        if (i11 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new g2(r0.h(i11, objArr), comparator);
    }

    public static g2 r(Comparator comparator) {
        if (x1.f12053b.equals(comparator)) {
            return g2.f11960j;
        }
        return new g2(z1.f12062g, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f11974f;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        i1 i1Var = this.f11975g;
        if (i1Var == null) {
            g2 g2Var = (g2) this;
            Comparator reverseOrder = Collections.reverseOrder(g2Var.f11974f);
            if (g2Var.isEmpty()) {
                i1Var = r(reverseOrder);
            } else {
                i1Var = new g2(g2Var.f11961i.r(), reverseOrder);
            }
            this.f11975g = i1Var;
            i1Var.f11975g = this;
        }
        return i1Var;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        g2 g2Var = (g2) this;
        return g2Var.u(0, g2Var.v(obj, z10));
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
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final g2 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        boolean z12;
        obj.getClass();
        obj2.getClass();
        if (this.f11974f.compare(obj, obj2) <= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        v8.u0.f(z12);
        g2 t5 = ((g2) this).t(obj, z10);
        return t5.u(0, t5.v(obj2, z11));
    }

    public abstract g2 t(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        return t(obj, z10);
    }

    @Override // com.google.common.collect.b1, com.google.common.collect.k0
    public Object writeReplace() {
        return new h1(this.f11974f, toArray());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return t(obj, true);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        g2 g2Var = (g2) this;
        return g2Var.u(0, g2Var.v(obj, false));
    }
}
