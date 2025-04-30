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
    private static final rp b = new b(ii.f8307f, 0);

    /* loaded from: classes.dex */
    public static final class a extends ya.a {
        public a() {
            this(4);
        }

        public ab a() {
            this.f12368c = true;
            return ab.b(this.f12367a, this.b);
        }

        public a b(Object obj) {
            super.a(obj);
            return this;
        }

        public a(int i9) {
            super(i9);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AbstractC0677c {

        /* renamed from: c, reason: collision with root package name */
        private final ab f6615c;

        public b(ab abVar, int i9) {
            super(abVar.size(), i9);
            this.f6615c = abVar;
        }

        @Override // com.applovin.impl.AbstractC0677c
        public Object a(int i9) {
            return this.f6615c.get(i9);
        }
    }

    /* loaded from: classes.dex */
    public class c extends ab {

        /* renamed from: c, reason: collision with root package name */
        final transient int f6616c;

        /* renamed from: d, reason: collision with root package name */
        final transient int f6617d;

        public c(int i9, int i10) {
            this.f6616c = i9;
            this.f6617d = i10;
        }

        @Override // com.applovin.impl.ab, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ab subList(int i9, int i10) {
            Preconditions.checkPositionIndexes(i9, i10, this.f6617d);
            ab abVar = ab.this;
            int i11 = this.f6616c;
            return abVar.subList(i9 + i11, i10 + i11);
        }

        @Override // com.applovin.impl.ya
        public Object[] b() {
            return ab.this.b();
        }

        @Override // com.applovin.impl.ya
        public int c() {
            return ab.this.d() + this.f6616c + this.f6617d;
        }

        @Override // com.applovin.impl.ya
        public int d() {
            return ab.this.d() + this.f6616c;
        }

        @Override // com.applovin.impl.ya
        public boolean e() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i9) {
            Preconditions.checkElementIndex(i9, this.f6617d);
            return ab.this.get(i9 + this.f6616c);
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
            return this.f6617d;
        }

        @Override // com.applovin.impl.ab, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i9) {
            return super.listIterator(i9);
        }
    }

    public static ab b(Object[] objArr, int i9) {
        if (i9 == 0) {
            return h();
        }
        return new ii(objArr, i9);
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
        return ii.f8307f;
    }

    @Override // com.applovin.impl.ya
    public final ab a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
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
        int i9 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = ~(~(get(i10).hashCode() + (i9 * 31)));
        }
        return i9;
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
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static ab a(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    private static ab b(Object... objArr) {
        return a(cg.a(objArr));
    }

    @Override // com.applovin.impl.ya
    public int a(Object[] objArr, int i9) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i9 + i10] = get(i10);
        }
        return i9 + size;
    }

    public ab b(int i9, int i10) {
        return new c(i9, i10 - i9);
    }

    public static ab a(Collection collection) {
        if (collection instanceof ya) {
            ab a6 = ((ya) collection).a();
            return a6.e() ? a(a6.toArray()) : a6;
        }
        return b(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rp listIterator(int i9) {
        Preconditions.checkPositionIndex(i9, size());
        if (isEmpty()) {
            return b;
        }
        return new b(this, i9);
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
        Object[] c9 = rb.c(iterable);
        cg.a(c9);
        Arrays.sort(c9, comparator);
        return a(c9);
    }

    @Override // java.util.List
    /* renamed from: a */
    public ab subList(int i9, int i10) {
        Preconditions.checkPositionIndexes(i9, i10, size());
        int i11 = i10 - i9;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return h();
        }
        return b(i9, i10);
    }
}
