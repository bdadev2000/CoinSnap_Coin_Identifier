package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.go;

/* renamed from: com.applovin.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0672b extends go {

    /* renamed from: c, reason: collision with root package name */
    private final int f6784c;

    /* renamed from: d, reason: collision with root package name */
    private final tj f6785d;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6786f;

    public AbstractC0672b(boolean z8, tj tjVar) {
        this.f6786f = z8;
        this.f6785d = tjVar;
        this.f6784c = tjVar.a();
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public static Object c(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object d(Object obj) {
        return ((Pair) obj).first;
    }

    public abstract int b(Object obj);

    @Override // com.applovin.impl.go
    public int b(boolean z8) {
        int i9 = this.f6784c;
        if (i9 == 0) {
            return -1;
        }
        if (this.f6786f) {
            z8 = false;
        }
        int c9 = z8 ? this.f6785d.c() : i9 - 1;
        while (i(c9).c()) {
            c9 = b(c9, z8);
            if (c9 == -1) {
                return -1;
            }
        }
        return i(c9).b(z8) + h(c9);
    }

    public abstract int d(int i9);

    public abstract int e(int i9);

    public abstract Object f(int i9);

    public abstract int g(int i9);

    public abstract int h(int i9);

    public abstract go i(int i9);

    @Override // com.applovin.impl.go
    public int a(boolean z8) {
        if (this.f6784c == 0) {
            return -1;
        }
        if (this.f6786f) {
            z8 = false;
        }
        int b = z8 ? this.f6785d.b() : 0;
        while (i(b).c()) {
            b = a(b, z8);
            if (b == -1) {
                return -1;
            }
        }
        return i(b).a(z8) + h(b);
    }

    private int b(int i9, boolean z8) {
        if (z8) {
            return this.f6785d.b(i9);
        }
        if (i9 > 0) {
            return i9 - 1;
        }
        return -1;
    }

    @Override // com.applovin.impl.go
    public final int a(Object obj) {
        int a6;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object d2 = d(obj);
        Object c9 = c(obj);
        int b = b(d2);
        if (b == -1 || (a6 = i(b).a(c9)) == -1) {
            return -1;
        }
        return g(b) + a6;
    }

    @Override // com.applovin.impl.go
    public int b(int i9, int i10, boolean z8) {
        if (this.f6786f) {
            if (i10 == 1) {
                i10 = 2;
            }
            z8 = false;
        }
        int e4 = e(i9);
        int h6 = h(e4);
        int b = i(e4).b(i9 - h6, i10 != 2 ? i10 : 0, z8);
        if (b != -1) {
            return h6 + b;
        }
        int b8 = b(e4, z8);
        while (b8 != -1 && i(b8).c()) {
            b8 = b(b8, z8);
        }
        if (b8 != -1) {
            return i(b8).b(z8) + h(b8);
        }
        if (i10 == 2) {
            return b(z8);
        }
        return -1;
    }

    private int a(int i9, boolean z8) {
        if (z8) {
            return this.f6785d.a(i9);
        }
        if (i9 < this.f6784c - 1) {
            return i9 + 1;
        }
        return -1;
    }

    @Override // com.applovin.impl.go
    public int a(int i9, int i10, boolean z8) {
        if (this.f6786f) {
            if (i10 == 1) {
                i10 = 2;
            }
            z8 = false;
        }
        int e4 = e(i9);
        int h6 = h(e4);
        int a6 = i(e4).a(i9 - h6, i10 != 2 ? i10 : 0, z8);
        if (a6 != -1) {
            return h6 + a6;
        }
        int a9 = a(e4, z8);
        while (a9 != -1 && i(a9).c()) {
            a9 = a(a9, z8);
        }
        if (a9 != -1) {
            return i(a9).a(z8) + h(a9);
        }
        if (i10 == 2) {
            return a(z8);
        }
        return -1;
    }

    @Override // com.applovin.impl.go
    public final Object b(int i9) {
        int d2 = d(i9);
        return a(f(d2), i(d2).b(i9 - g(d2)));
    }

    @Override // com.applovin.impl.go
    public final go.b a(int i9, go.b bVar, boolean z8) {
        int d2 = d(i9);
        int h6 = h(d2);
        i(d2).a(i9 - g(d2), bVar, z8);
        bVar.f7934c += h6;
        if (z8) {
            bVar.b = a(f(d2), AbstractC0669a1.a(bVar.b));
        }
        return bVar;
    }

    @Override // com.applovin.impl.go
    public final go.b a(Object obj, go.b bVar) {
        Object d2 = d(obj);
        Object c9 = c(obj);
        int b = b(d2);
        int h6 = h(b);
        i(b).a(c9, bVar);
        bVar.f7934c += h6;
        bVar.b = obj;
        return bVar;
    }

    @Override // com.applovin.impl.go
    public final go.d a(int i9, go.d dVar, long j7) {
        int e4 = e(i9);
        int h6 = h(e4);
        int g9 = g(e4);
        i(e4).a(i9 - h6, dVar, j7);
        Object f9 = f(e4);
        if (!go.d.f7943s.equals(dVar.f7947a)) {
            f9 = a(f9, dVar.f7947a);
        }
        dVar.f7947a = f9;
        dVar.f7958p += g9;
        dVar.f7959q += g9;
        return dVar;
    }
}
