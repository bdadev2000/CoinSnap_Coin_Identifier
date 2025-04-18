package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.ya;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class ab extends ya implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final rp f3633b = new b(ii.f5343f, 0);

    /* loaded from: classes.dex */
    public static final class a extends ya.a {
        public a() {
            this(4);
        }

        public ab a() {
            this.f9166c = true;
            return ab.b(this.a, this.f9165b);
        }

        public a b(Object obj) {
            super.a(obj);
            return this;
        }

        public a(int i10) {
            super(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends com.applovin.impl.c {

        /* renamed from: c, reason: collision with root package name */
        private final ab f3634c;

        public b(ab abVar, int i10) {
            super(abVar.size(), i10);
            this.f3634c = abVar;
        }

        @Override // com.applovin.impl.c
        public Object a(int i10) {
            return this.f3634c.get(i10);
        }
    }

    /* loaded from: classes.dex */
    public class c extends ab {

        /* renamed from: c, reason: collision with root package name */
        final transient int f3635c;

        /* renamed from: d, reason: collision with root package name */
        final transient int f3636d;

        public c(int i10, int i11) {
            this.f3635c = i10;
            this.f3636d = i11;
        }

        @Override // com.applovin.impl.ab, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ab subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, this.f3636d);
            ab abVar = ab.this;
            int i12 = this.f3635c;
            return abVar.subList(i10 + i12, i11 + i12);
        }

        @Override // com.applovin.impl.ya
        public Object[] b() {
            return ab.this.b();
        }

        @Override // com.applovin.impl.ya
        public int c() {
            return ab.this.d() + this.f3635c + this.f3636d;
        }

        @Override // com.applovin.impl.ya
        public int d() {
            return ab.this.d() + this.f3635c;
        }

        @Override // com.applovin.impl.ya
        public boolean e() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            Preconditions.checkElementIndex(i10, this.f3636d);
            return ab.this.get(i10 + this.f3635c);
        }

        @Override // com.applovin.impl.ab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.applovin.impl.ab, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f3636d;
        }

        @Override // com.applovin.impl.ab, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    public static ab b(Object[] objArr, int i10) {
        if (i10 == 0) {
            return h();
        }
        return new ii(objArr, i10);
    }

    public static ab c(Object[] objArr) {
        if (objArr.length == 0) {
            return h();
        }
        return b((Object[]) objArr.clone());
    }

    public static a f() {
        return new a();
    }

    public static ab h() {
        return ii.f5343f;
    }

    @Override // com.applovin.impl.ya
    public final ab a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return dc.a(this, obj);
    }

    @Override // java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public rp listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return dc.b(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public qp iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return dc.d(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static ab a(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    private static ab b(Object... objArr) {
        return a(cg.a(objArr));
    }

    @Override // com.applovin.impl.ya
    public int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    public ab b(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    public static ab a(Collection collection) {
        if (collection instanceof ya) {
            ab a10 = ((ya) collection).a();
            return a10.e() ? a(a10.toArray()) : a10;
        }
        return b(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rp listIterator(int i10) {
        Preconditions.checkPositionIndex(i10, size());
        if (isEmpty()) {
            return f3633b;
        }
        return new b(this, i10);
    }

    public static ab a(Object obj) {
        return b(obj);
    }

    public static ab a(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    public static ab a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return b(obj, obj2, obj3, obj4, obj5);
    }

    public static ab a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return b(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static ab a(Comparator comparator, Iterable iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] c10 = rb.c(iterable);
        cg.a(c10);
        Arrays.sort(c10, comparator);
        return a(c10);
    }

    @Override // java.util.List
    /* renamed from: a */
    public ab subList(int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return h();
        }
        return b(i10, i11);
    }
}
