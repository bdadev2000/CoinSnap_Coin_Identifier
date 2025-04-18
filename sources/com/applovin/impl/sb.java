package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public abstract class sb {

    /* loaded from: classes.dex */
    public class a extends qp {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f7472b;

        public a(Object obj) {
            this.f7472b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.a) {
                this.a = true;
                return this.f7472b;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.applovin.impl.c {

        /* renamed from: f, reason: collision with root package name */
        static final rp f7473f = new b(new Object[0], 0, 0, 0);

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f7474c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7475d;

        public b(Object[] objArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f7474c = objArr;
            this.f7475d = i10;
        }

        @Override // com.applovin.impl.c
        public Object a(int i10) {
            return this.f7474c[this.f7475d + i10];
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
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
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
        StringBuilder sb2 = new StringBuilder("[");
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public static rp b() {
        return b.f7473f;
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
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static qp a() {
        return b();
    }

    public static qp a(Object obj) {
        return new a(obj);
    }
}
