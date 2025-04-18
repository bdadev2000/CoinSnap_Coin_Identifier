package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.f9;
import com.applovin.impl.tf;
import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes2.dex */
public final class sf implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private final bh f26875a;

    /* renamed from: b, reason: collision with root package name */
    private final tf.a f26876b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26877c;
    private qo d;
    private String e;

    /* renamed from: f, reason: collision with root package name */
    private int f26878f;

    /* renamed from: g, reason: collision with root package name */
    private int f26879g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26880h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26881i;

    /* renamed from: j, reason: collision with root package name */
    private long f26882j;

    /* renamed from: k, reason: collision with root package name */
    private int f26883k;

    /* renamed from: l, reason: collision with root package name */
    private long f26884l;

    public sf() {
        this(null);
    }

    private void c(bh bhVar) {
        int min = Math.min(bhVar.a(), this.f26883k - this.f26879g);
        this.d.a(bhVar, min);
        int i2 = this.f26879g + min;
        this.f26879g = i2;
        int i3 = this.f26883k;
        if (i2 < i3) {
            return;
        }
        long j2 = this.f26884l;
        if (j2 != -9223372036854775807L) {
            this.d.a(j2, 1, i3, 0, null);
            this.f26884l += this.f26882j;
        }
        this.f26879g = 0;
        this.f26878f = 0;
    }

    private void d(bh bhVar) {
        int min = Math.min(bhVar.a(), 4 - this.f26879g);
        bhVar.a(this.f26875a.c(), this.f26879g, min);
        int i2 = this.f26879g + min;
        this.f26879g = i2;
        if (i2 < 4) {
            return;
        }
        this.f26875a.f(0);
        if (!this.f26876b.a(this.f26875a.j())) {
            this.f26879g = 0;
            this.f26878f = 1;
            return;
        }
        this.f26883k = this.f26876b.f27160c;
        if (!this.f26880h) {
            this.f26882j = (r8.f27162g * 1000000) / r8.d;
            this.d.a(new f9.b().c(this.e).f(this.f26876b.f27159b).i(4096).c(this.f26876b.e).n(this.f26876b.d).e(this.f26877c).a());
            this.f26880h = true;
        }
        this.f26875a.f(0);
        this.d.a(this.f26875a, 4);
        this.f26878f = 2;
    }

    @Override // com.applovin.impl.q7
    public void a() {
        this.f26878f = 0;
        this.f26879g = 0;
        this.f26881i = false;
        this.f26884l = -9223372036854775807L;
    }

    @Override // com.applovin.impl.q7
    public void b() {
    }

    public sf(String str) {
        this.f26878f = 0;
        bh bhVar = new bh(4);
        this.f26875a = bhVar;
        bhVar.c()[0] = -1;
        this.f26876b = new tf.a();
        this.f26884l = -9223372036854775807L;
        this.f26877c = str;
    }

    private void b(bh bhVar) {
        byte[] c2 = bhVar.c();
        int e = bhVar.e();
        for (int d = bhVar.d(); d < e; d++) {
            byte b2 = c2[d];
            boolean z2 = (b2 & UnsignedBytes.MAX_VALUE) == 255;
            boolean z3 = this.f26881i && (b2 & 224) == 224;
            this.f26881i = z2;
            if (z3) {
                bhVar.f(d + 1);
                this.f26881i = false;
                this.f26875a.c()[1] = c2[d];
                this.f26879g = 2;
                this.f26878f = 1;
                return;
            }
        }
        bhVar.f(e);
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f26884l = j2;
        }
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        b1.b(this.d);
        while (bhVar.a() > 0) {
            int i2 = this.f26878f;
            if (i2 == 0) {
                b(bhVar);
            } else if (i2 == 1) {
                d(bhVar);
            } else if (i2 == 2) {
                c(bhVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.d = m8Var.a(dVar.c(), 1);
    }
}
