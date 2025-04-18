package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.fo;

/* loaded from: classes2.dex */
public abstract class b extends fo {

    /* renamed from: c, reason: collision with root package name */
    private final int f22968c;
    private final wj d;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f22969f;

    public b(boolean z2, wj wjVar) {
        this.f22969f = z2;
        this.d = wjVar;
        this.f22968c = wjVar.a();
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

    @Override // com.applovin.impl.fo
    public int b(boolean z2) {
        int i2 = this.f22968c;
        if (i2 == 0) {
            return -1;
        }
        if (this.f22969f) {
            z2 = false;
        }
        int c2 = z2 ? this.d.c() : i2 - 1;
        while (i(c2).c()) {
            c2 = b(c2, z2);
            if (c2 == -1) {
                return -1;
            }
        }
        return i(c2).b(z2) + h(c2);
    }

    public abstract int d(int i2);

    public abstract int e(int i2);

    public abstract Object f(int i2);

    public abstract int g(int i2);

    public abstract int h(int i2);

    public abstract fo i(int i2);

    @Override // com.applovin.impl.fo
    public int a(boolean z2) {
        if (this.f22968c == 0) {
            return -1;
        }
        if (this.f22969f) {
            z2 = false;
        }
        int b2 = z2 ? this.d.b() : 0;
        while (i(b2).c()) {
            b2 = a(b2, z2);
            if (b2 == -1) {
                return -1;
            }
        }
        return i(b2).a(z2) + h(b2);
    }

    private int b(int i2, boolean z2) {
        if (z2) {
            return this.d.b(i2);
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        return -1;
    }

    @Override // com.applovin.impl.fo
    public final int a(Object obj) {
        int a2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object d = d(obj);
        Object c2 = c(obj);
        int b2 = b(d);
        if (b2 == -1 || (a2 = i(b2).a(c2)) == -1) {
            return -1;
        }
        return g(b2) + a2;
    }

    @Override // com.applovin.impl.fo
    public int b(int i2, int i3, boolean z2) {
        if (this.f22969f) {
            if (i3 == 1) {
                i3 = 2;
            }
            z2 = false;
        }
        int e = e(i2);
        int h2 = h(e);
        int b2 = i(e).b(i2 - h2, i3 != 2 ? i3 : 0, z2);
        if (b2 != -1) {
            return h2 + b2;
        }
        int b3 = b(e, z2);
        while (b3 != -1 && i(b3).c()) {
            b3 = b(b3, z2);
        }
        if (b3 != -1) {
            return i(b3).b(z2) + h(b3);
        }
        if (i3 == 2) {
            return b(z2);
        }
        return -1;
    }

    private int a(int i2, boolean z2) {
        if (z2) {
            return this.d.a(i2);
        }
        if (i2 < this.f22968c - 1) {
            return i2 + 1;
        }
        return -1;
    }

    @Override // com.applovin.impl.fo
    public int a(int i2, int i3, boolean z2) {
        if (this.f22969f) {
            if (i3 == 1) {
                i3 = 2;
            }
            z2 = false;
        }
        int e = e(i2);
        int h2 = h(e);
        int a2 = i(e).a(i2 - h2, i3 != 2 ? i3 : 0, z2);
        if (a2 != -1) {
            return h2 + a2;
        }
        int a3 = a(e, z2);
        while (a3 != -1 && i(a3).c()) {
            a3 = a(a3, z2);
        }
        if (a3 != -1) {
            return i(a3).a(z2) + h(a3);
        }
        if (i3 == 2) {
            return a(z2);
        }
        return -1;
    }

    @Override // com.applovin.impl.fo
    public final Object b(int i2) {
        int d = d(i2);
        return a(f(d), i(d).b(i2 - g(d)));
    }

    @Override // com.applovin.impl.fo
    public final fo.b a(int i2, fo.b bVar, boolean z2) {
        int d = d(i2);
        int h2 = h(d);
        i(d).a(i2 - g(d), bVar, z2);
        bVar.f23950c += h2;
        if (z2) {
            bVar.f23949b = a(f(d), b1.a(bVar.f23949b));
        }
        return bVar;
    }

    @Override // com.applovin.impl.fo
    public final fo.b a(Object obj, fo.b bVar) {
        Object d = d(obj);
        Object c2 = c(obj);
        int b2 = b(d);
        int h2 = h(b2);
        i(b2).a(c2, bVar);
        bVar.f23950c += h2;
        bVar.f23949b = obj;
        return bVar;
    }

    @Override // com.applovin.impl.fo
    public final fo.d a(int i2, fo.d dVar, long j2) {
        int e = e(i2);
        int h2 = h(e);
        int g2 = g(e);
        i(e).a(i2 - h2, dVar, j2);
        Object f2 = f(e);
        if (!fo.d.f23957s.equals(dVar.f23961a)) {
            f2 = a(f2, dVar.f23961a);
        }
        dVar.f23961a = f2;
        dVar.f23974p += g2;
        dVar.f23975q += g2;
        return dVar;
    }
}
