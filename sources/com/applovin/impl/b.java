package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.go;

/* loaded from: classes.dex */
public abstract class b extends go {

    /* renamed from: c, reason: collision with root package name */
    private final int f3800c;

    /* renamed from: d, reason: collision with root package name */
    private final tj f3801d;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3802f;

    public b(boolean z10, tj tjVar) {
        this.f3802f = z10;
        this.f3801d = tjVar;
        this.f3800c = tjVar.a();
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
    public int b(boolean z10) {
        int i10 = this.f3800c;
        if (i10 == 0) {
            return -1;
        }
        if (this.f3802f) {
            z10 = false;
        }
        int c10 = z10 ? this.f3801d.c() : i10 - 1;
        while (i(c10).c()) {
            c10 = b(c10, z10);
            if (c10 == -1) {
                return -1;
            }
        }
        return i(c10).b(z10) + h(c10);
    }

    public abstract int d(int i10);

    public abstract int e(int i10);

    public abstract Object f(int i10);

    public abstract int g(int i10);

    public abstract int h(int i10);

    public abstract go i(int i10);

    @Override // com.applovin.impl.go
    public int a(boolean z10) {
        if (this.f3800c == 0) {
            return -1;
        }
        if (this.f3802f) {
            z10 = false;
        }
        int b3 = z10 ? this.f3801d.b() : 0;
        while (i(b3).c()) {
            b3 = a(b3, z10);
            if (b3 == -1) {
                return -1;
            }
        }
        return i(b3).a(z10) + h(b3);
    }

    private int b(int i10, boolean z10) {
        if (z10) {
            return this.f3801d.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // com.applovin.impl.go
    public final int a(Object obj) {
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object d10 = d(obj);
        Object c10 = c(obj);
        int b3 = b(d10);
        if (b3 == -1 || (a = i(b3).a(c10)) == -1) {
            return -1;
        }
        return g(b3) + a;
    }

    @Override // com.applovin.impl.go
    public int b(int i10, int i11, boolean z10) {
        if (this.f3802f) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int e2 = e(i10);
        int h10 = h(e2);
        int b3 = i(e2).b(i10 - h10, i11 != 2 ? i11 : 0, z10);
        if (b3 != -1) {
            return h10 + b3;
        }
        int b10 = b(e2, z10);
        while (b10 != -1 && i(b10).c()) {
            b10 = b(b10, z10);
        }
        if (b10 != -1) {
            return i(b10).b(z10) + h(b10);
        }
        if (i11 == 2) {
            return b(z10);
        }
        return -1;
    }

    private int a(int i10, boolean z10) {
        if (z10) {
            return this.f3801d.a(i10);
        }
        if (i10 < this.f3800c - 1) {
            return i10 + 1;
        }
        return -1;
    }

    @Override // com.applovin.impl.go
    public int a(int i10, int i11, boolean z10) {
        if (this.f3802f) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int e2 = e(i10);
        int h10 = h(e2);
        int a = i(e2).a(i10 - h10, i11 != 2 ? i11 : 0, z10);
        if (a != -1) {
            return h10 + a;
        }
        int a10 = a(e2, z10);
        while (a10 != -1 && i(a10).c()) {
            a10 = a(a10, z10);
        }
        if (a10 != -1) {
            return i(a10).a(z10) + h(a10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // com.applovin.impl.go
    public final Object b(int i10) {
        int d10 = d(i10);
        return a(f(d10), i(d10).b(i10 - g(d10)));
    }

    @Override // com.applovin.impl.go
    public final go.b a(int i10, go.b bVar, boolean z10) {
        int d10 = d(i10);
        int h10 = h(d10);
        i(d10).a(i10 - g(d10), bVar, z10);
        bVar.f4958c += h10;
        if (z10) {
            bVar.f4957b = a(f(d10), a1.a(bVar.f4957b));
        }
        return bVar;
    }

    @Override // com.applovin.impl.go
    public final go.b a(Object obj, go.b bVar) {
        Object d10 = d(obj);
        Object c10 = c(obj);
        int b3 = b(d10);
        int h10 = h(b3);
        i(b3).a(c10, bVar);
        bVar.f4958c += h10;
        bVar.f4957b = obj;
        return bVar;
    }

    @Override // com.applovin.impl.go
    public final go.d a(int i10, go.d dVar, long j3) {
        int e2 = e(i10);
        int h10 = h(e2);
        int g10 = g(e2);
        i(e2).a(i10 - h10, dVar, j3);
        Object f10 = f(e2);
        if (!go.d.f4967s.equals(dVar.a)) {
            f10 = a(f10, dVar.a);
        }
        dVar.a = f10;
        dVar.f4983p += g10;
        dVar.f4984q += g10;
        return dVar;
    }
}
