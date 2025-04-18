package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.cb;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class eb extends cb implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final qp f23672b = new b(mi.f25581f, 0);

    /* loaded from: classes2.dex */
    public static final class a extends cb.a {
        public a() {
            this(4);
        }

        public eb a() {
            this.f23263c = true;
            return eb.b(this.f23261a, this.f23262b);
        }

        public a b(Object obj) {
            super.a(obj);
            return this;
        }

        public a(int i2) {
            super(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends com.applovin.impl.c {

        /* renamed from: c, reason: collision with root package name */
        private final eb f23673c;

        public b(eb ebVar, int i2) {
            super(ebVar.size(), i2);
            this.f23673c = ebVar;
        }

        @Override // com.applovin.impl.c
        public Object a(int i2) {
            return this.f23673c.get(i2);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends eb {

        /* renamed from: c, reason: collision with root package name */
        final transient int f23674c;
        final transient int d;

        public c(int i2, int i3) {
            this.f23674c = i2;
            this.d = i3;
        }

        @Override // com.applovin.impl.eb, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public eb subList(int i2, int i3) {
            Preconditions.checkPositionIndexes(i2, i3, this.d);
            eb ebVar = eb.this;
            int i4 = this.f23674c;
            return ebVar.subList(i2 + i4, i3 + i4);
        }

        @Override // com.applovin.impl.cb
        public Object[] b() {
            return eb.this.b();
        }

        @Override // com.applovin.impl.cb
        public int c() {
            return eb.this.d() + this.f23674c + this.d;
        }

        @Override // com.applovin.impl.cb
        public int d() {
            return eb.this.d() + this.f23674c;
        }

        @Override // com.applovin.impl.cb
        public boolean e() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i2) {
            Preconditions.checkElementIndex(i2, this.d);
            return eb.this.get(i2 + this.f23674c);
        }

        @Override // com.applovin.impl.eb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.applovin.impl.eb, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.d;
        }

        @Override // com.applovin.impl.eb, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return super.listIterator(i2);
        }
    }

    public static eb b(Object[] objArr, int i2) {
        if (i2 == 0) {
            return h();
        }
        return new mi(objArr, i2);
    }

    public static eb c(Object[] objArr) {
        return objArr.length == 0 ? h() : b((Object[]) objArr.clone());
    }

    public static a f() {
        return new a();
    }

    public static eb h() {
        return mi.f25581f;
    }

    @Override // com.applovin.impl.cb
    public final eb a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.cb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return ic.a(this, obj);
    }

    @Override // java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public qp listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~(get(i3).hashCode() + (i2 * 31)));
        }
        return i2;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return ic.b(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public pp iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return ic.d(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static eb a(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    private static eb b(Object... objArr) {
        return a(gg.a(objArr));
    }

    @Override // com.applovin.impl.cb
    public int a(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    public eb b(int i2, int i3) {
        return new c(i2, i3 - i2);
    }

    public static eb a(Collection collection) {
        if (collection instanceof cb) {
            eb a2 = ((cb) collection).a();
            return a2.e() ? a(a2.toArray()) : a2;
        }
        return b(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qp listIterator(int i2) {
        Preconditions.checkPositionIndex(i2, size());
        return isEmpty() ? f23672b : new b(this, i2);
    }

    public static eb a(Object obj) {
        return b(obj);
    }

    public static eb a(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    public static eb a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return b(obj, obj2, obj3, obj4, obj5);
    }

    public static eb a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return b(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static eb a(Comparator comparator, Iterable iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] c2 = wb.c(iterable);
        gg.a(c2);
        Arrays.sort(c2, comparator);
        return a(c2);
    }

    @Override // java.util.List
    /* renamed from: a */
    public eb subList(int i2, int i3) {
        Preconditions.checkPositionIndexes(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return h();
        }
        return b(i2, i3);
    }
}
