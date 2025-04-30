package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class sb {

    /* loaded from: classes.dex */
    public class a extends qp {

        /* renamed from: a, reason: collision with root package name */
        boolean f10613a;
        final /* synthetic */ Object b;

        public a(Object obj) {
            this.b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f10613a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f10613a) {
                this.f10613a = true;
                return this.b;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends AbstractC0677c {

        /* renamed from: f, reason: collision with root package name */
        static final rp f10614f = new b(new Object[0], 0, 0, 0);

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f10615c;

        /* renamed from: d, reason: collision with root package name */
        private final int f10616d;

        public b(Object[] objArr, int i9, int i10, int i11) {
            super(i10, i11);
            this.f10615c = objArr;
            this.f10616d = i9;
        }

        @Override // com.applovin.impl.AbstractC0677c
        public Object a(int i9) {
            return this.f10615c[this.f10616d + i9];
        }
    }

    /* loaded from: classes.dex */
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
            n3.a(false);
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= collection.add(it.next());
        }
        return z8;
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
        boolean z8 = true;
        while (it.hasNext()) {
            if (!z8) {
                sb.append(", ");
            }
            sb.append(it.next());
            z8 = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static rp b() {
        return b.f10614f;
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
        boolean z8 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    public static qp a() {
        return b();
    }

    public static qp a(Object obj) {
        return new a(obj);
    }
}
