package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.dp;
import com.applovin.impl.f9;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class bc implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23036a;

    /* renamed from: b, reason: collision with root package name */
    private final bh f23037b;

    /* renamed from: c, reason: collision with root package name */
    private final ah f23038c;
    private qo d;
    private String e;

    /* renamed from: f, reason: collision with root package name */
    private f9 f23039f;

    /* renamed from: g, reason: collision with root package name */
    private int f23040g;

    /* renamed from: h, reason: collision with root package name */
    private int f23041h;

    /* renamed from: i, reason: collision with root package name */
    private int f23042i;

    /* renamed from: j, reason: collision with root package name */
    private int f23043j;

    /* renamed from: k, reason: collision with root package name */
    private long f23044k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23045l;

    /* renamed from: m, reason: collision with root package name */
    private int f23046m;

    /* renamed from: n, reason: collision with root package name */
    private int f23047n;

    /* renamed from: o, reason: collision with root package name */
    private int f23048o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23049p;

    /* renamed from: q, reason: collision with root package name */
    private long f23050q;

    /* renamed from: r, reason: collision with root package name */
    private int f23051r;

    /* renamed from: s, reason: collision with root package name */
    private long f23052s;

    /* renamed from: t, reason: collision with root package name */
    private int f23053t;

    /* renamed from: u, reason: collision with root package name */
    private String f23054u;

    public bc(String str) {
        this.f23036a = str;
        bh bhVar = new bh(1024);
        this.f23037b = bhVar;
        this.f23038c = new ah(bhVar.c());
        this.f23044k = -9223372036854775807L;
    }

    private int c(ah ahVar) {
        int b2 = ahVar.b();
        a.b a2 = a.a(ahVar, true);
        this.f23054u = a2.f22663c;
        this.f23051r = a2.f22661a;
        this.f23053t = a2.f22662b;
        return b2 - ahVar.b();
    }

    private void d(ah ahVar) {
        int a2 = ahVar.a(3);
        this.f23048o = a2;
        if (a2 == 0) {
            ahVar.d(8);
            return;
        }
        if (a2 == 1) {
            ahVar.d(9);
            return;
        }
        if (a2 == 3 || a2 == 4 || a2 == 5) {
            ahVar.d(6);
        } else {
            if (a2 != 6 && a2 != 7) {
                throw new IllegalStateException();
            }
            ahVar.d(1);
        }
    }

    private int e(ah ahVar) {
        int a2;
        if (this.f23048o != 0) {
            throw dh.a(null, null);
        }
        int i2 = 0;
        do {
            a2 = ahVar.a(8);
            i2 += a2;
        } while (a2 == 255);
        return i2;
    }

    private void f(ah ahVar) {
        boolean f2;
        int a2 = ahVar.a(1);
        int a3 = a2 == 1 ? ahVar.a(1) : 0;
        this.f23046m = a3;
        if (a3 != 0) {
            throw dh.a(null, null);
        }
        if (a2 == 1) {
            a(ahVar);
        }
        if (!ahVar.f()) {
            throw dh.a(null, null);
        }
        this.f23047n = ahVar.a(6);
        int a4 = ahVar.a(4);
        int a5 = ahVar.a(3);
        if (a4 != 0 || a5 != 0) {
            throw dh.a(null, null);
        }
        if (a2 == 0) {
            int e = ahVar.e();
            int c2 = c(ahVar);
            ahVar.c(e);
            byte[] bArr = new byte[(c2 + 7) / 8];
            ahVar.a(bArr, 0, c2);
            f9 a6 = new f9.b().c(this.e).f("audio/mp4a-latm").a(this.f23054u).c(this.f23053t).n(this.f23051r).a(Collections.singletonList(bArr)).e(this.f23036a).a();
            if (!a6.equals(this.f23039f)) {
                this.f23039f = a6;
                this.f23052s = 1024000000 / a6.A;
                this.d.a(a6);
            }
        } else {
            ahVar.d(((int) a(ahVar)) - c(ahVar));
        }
        d(ahVar);
        boolean f3 = ahVar.f();
        this.f23049p = f3;
        this.f23050q = 0L;
        if (f3) {
            if (a2 == 1) {
                this.f23050q = a(ahVar);
            }
            do {
                f2 = ahVar.f();
                this.f23050q = (this.f23050q << 8) + ahVar.a(8);
            } while (f2);
        }
        if (ahVar.f()) {
            ahVar.d(8);
        }
    }

    @Override // com.applovin.impl.q7
    public void a() {
        this.f23040g = 0;
        this.f23044k = -9223372036854775807L;
        this.f23045l = false;
    }

    @Override // com.applovin.impl.q7
    public void b() {
    }

    private void b(ah ahVar) {
        if (!ahVar.f()) {
            this.f23045l = true;
            f(ahVar);
        } else if (!this.f23045l) {
            return;
        }
        if (this.f23046m != 0) {
            throw dh.a(null, null);
        }
        if (this.f23047n == 0) {
            a(ahVar, e(ahVar));
            if (this.f23049p) {
                ahVar.d((int) this.f23050q);
                return;
            }
            return;
        }
        throw dh.a(null, null);
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f23044k = j2;
        }
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        b1.b(this.d);
        while (bhVar.a() > 0) {
            int i2 = this.f23040g;
            if (i2 != 0) {
                if (i2 == 1) {
                    int w = bhVar.w();
                    if ((w & 224) == 224) {
                        this.f23043j = w;
                        this.f23040g = 2;
                    } else if (w != 86) {
                        this.f23040g = 0;
                    }
                } else if (i2 == 2) {
                    int w2 = ((this.f23043j & (-225)) << 8) | bhVar.w();
                    this.f23042i = w2;
                    if (w2 > this.f23037b.c().length) {
                        a(this.f23042i);
                    }
                    this.f23041h = 0;
                    this.f23040g = 3;
                } else if (i2 == 3) {
                    int min = Math.min(bhVar.a(), this.f23042i - this.f23041h);
                    bhVar.a(this.f23038c.f22849a, this.f23041h, min);
                    int i3 = this.f23041h + min;
                    this.f23041h = i3;
                    if (i3 == this.f23042i) {
                        this.f23038c.c(0);
                        b(this.f23038c);
                        this.f23040g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (bhVar.w() == 86) {
                this.f23040g = 1;
            }
        }
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        this.d = m8Var.a(dVar.c(), 1);
        this.e = dVar.b();
    }

    private static long a(ah ahVar) {
        return ahVar.a((ahVar.a(2) + 1) * 8);
    }

    private void a(ah ahVar, int i2) {
        int e = ahVar.e();
        if ((e & 7) == 0) {
            this.f23037b.f(e >> 3);
        } else {
            ahVar.a(this.f23037b.c(), 0, i2 * 8);
            this.f23037b.f(0);
        }
        this.d.a(this.f23037b, i2);
        long j2 = this.f23044k;
        if (j2 != -9223372036854775807L) {
            this.d.a(j2, 1, i2, 0, null);
            this.f23044k += this.f23052s;
        }
    }

    private void a(int i2) {
        this.f23037b.d(i2);
        this.f23038c.a(this.f23037b.c());
    }
}
