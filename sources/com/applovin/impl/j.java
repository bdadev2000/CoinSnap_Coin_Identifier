package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.f9;
import com.applovin.impl.k;

/* loaded from: classes2.dex */
public final class j implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private final ah f24545a;

    /* renamed from: b, reason: collision with root package name */
    private final bh f24546b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24547c;
    private String d;
    private qo e;

    /* renamed from: f, reason: collision with root package name */
    private int f24548f;

    /* renamed from: g, reason: collision with root package name */
    private int f24549g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f24550h;

    /* renamed from: i, reason: collision with root package name */
    private long f24551i;

    /* renamed from: j, reason: collision with root package name */
    private f9 f24552j;

    /* renamed from: k, reason: collision with root package name */
    private int f24553k;

    /* renamed from: l, reason: collision with root package name */
    private long f24554l;

    public j() {
        this(null);
    }

    private void c() {
        this.f24545a.c(0);
        k.b a2 = k.a(this.f24545a);
        f9 f9Var = this.f24552j;
        if (f9Var == null || a2.d != f9Var.f23851z || a2.f24761c != f9Var.A || !xp.a((Object) a2.f24759a, (Object) f9Var.f23840m)) {
            f9 a3 = new f9.b().c(this.d).f(a2.f24759a).c(a2.d).n(a2.f24761c).e(this.f24547c).a();
            this.f24552j = a3;
            this.e.a(a3);
        }
        this.f24553k = a2.e;
        this.f24551i = (a2.f24762f * 1000000) / this.f24552j.A;
    }

    @Override // com.applovin.impl.q7
    public void a() {
        this.f24548f = 0;
        this.f24549g = 0;
        this.f24550h = false;
        this.f24554l = -9223372036854775807L;
    }

    @Override // com.applovin.impl.q7
    public void b() {
    }

    public j(String str) {
        ah ahVar = new ah(new byte[128]);
        this.f24545a = ahVar;
        this.f24546b = new bh(ahVar.f22849a);
        this.f24548f = 0;
        this.f24554l = -9223372036854775807L;
        this.f24547c = str;
    }

    private boolean b(bh bhVar) {
        while (true) {
            if (bhVar.a() <= 0) {
                return false;
            }
            if (!this.f24550h) {
                this.f24550h = bhVar.w() == 11;
            } else {
                int w = bhVar.w();
                if (w == 119) {
                    this.f24550h = false;
                    return true;
                }
                this.f24550h = w == 11;
            }
        }
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f24554l = j2;
        }
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        b1.b(this.e);
        while (bhVar.a() > 0) {
            int i2 = this.f24548f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(bhVar.a(), this.f24553k - this.f24549g);
                        this.e.a(bhVar, min);
                        int i3 = this.f24549g + min;
                        this.f24549g = i3;
                        int i4 = this.f24553k;
                        if (i3 == i4) {
                            long j2 = this.f24554l;
                            if (j2 != -9223372036854775807L) {
                                this.e.a(j2, 1, i4, 0, null);
                                this.f24554l += this.f24551i;
                            }
                            this.f24548f = 0;
                        }
                    }
                } else if (a(bhVar, this.f24546b.c(), 128)) {
                    c();
                    this.f24546b.f(0);
                    this.e.a(this.f24546b, 128);
                    this.f24548f = 2;
                }
            } else if (b(bhVar)) {
                this.f24548f = 1;
                this.f24546b.c()[0] = 11;
                this.f24546b.c()[1] = 119;
                this.f24549g = 2;
            }
        }
    }

    private boolean a(bh bhVar, byte[] bArr, int i2) {
        int min = Math.min(bhVar.a(), i2 - this.f24549g);
        bhVar.a(bArr, this.f24549g, min);
        int i3 = this.f24549g + min;
        this.f24549g = i3;
        return i3 == i2;
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = m8Var.a(dVar.c(), 1);
    }
}
