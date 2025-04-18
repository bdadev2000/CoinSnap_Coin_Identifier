package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class xb {

    /* loaded from: classes4.dex */
    public class a extends pp {

        /* renamed from: a, reason: collision with root package name */
        boolean f27874a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f27875b;

        public a(Object obj) {
            this.f27875b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f27874a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f27874a) {
                throw new NoSuchElementException();
            }
            this.f27874a = true;
            return this.f27875b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends com.applovin.impl.c {

        /* renamed from: f, reason: collision with root package name */
        static final qp f27876f = new b(new Object[0], 0, 0, 0);

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f27877c;
        private final int d;

        public b(Object[] objArr, int i2, int i3, int i4) {
            super(i3, i4);
            this.f27877c = objArr;
            this.d = i2;
        }

        @Override // com.applovin.impl.c
        public Object a(int i2) {
            return this.f27877c[this.d + i2];
        }
    }

    /* loaded from: classes4.dex */
    public enum c implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            p3.a(false);
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= collection.add(it.next());
        }
        return z2;
    }

    public static Object b(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object c(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static String d(Iterator it) {
        StringBuilder sb = new StringBuilder("[");
        boolean z2 = true;
        while (it.hasNext()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(it.next());
            z2 = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static qp b() {
        return b.f27876f;
    }

    public static Iterator c() {
        return c.INSTANCE;
    }

    public static void a(Iterator it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static Object a(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean a(Iterator it, Collection collection) {
        Preconditions.checkNotNull(collection);
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static pp a() {
        return b();
    }

    public static pp a(Object obj) {
        return new a(obj);
    }
}
