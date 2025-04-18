package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.of;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class nf implements o7 {
    private final yg a;

    /* renamed from: b, reason: collision with root package name */
    private final of.a f6393b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6394c;

    /* renamed from: d, reason: collision with root package name */
    private ro f6395d;

    /* renamed from: e, reason: collision with root package name */
    private String f6396e;

    /* renamed from: f, reason: collision with root package name */
    private int f6397f;

    /* renamed from: g, reason: collision with root package name */
    private int f6398g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6399h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6400i;

    /* renamed from: j, reason: collision with root package name */
    private long f6401j;

    /* renamed from: k, reason: collision with root package name */
    private int f6402k;

    /* renamed from: l, reason: collision with root package name */
    private long f6403l;

    public nf() {
        this(null);
    }

    private void c(yg ygVar) {
        int min = Math.min(ygVar.a(), this.f6402k - this.f6398g);
        this.f6395d.a(ygVar, min);
        int i10 = this.f6398g + min;
        this.f6398g = i10;
        int i11 = this.f6402k;
        if (i10 < i11) {
            return;
        }
        long j3 = this.f6403l;
        if (j3 != C.TIME_UNSET) {
            this.f6395d.a(j3, 1, i11, 0, null);
            this.f6403l += this.f6401j;
        }
        this.f6398g = 0;
        this.f6397f = 0;
    }

    private void d(yg ygVar) {
        int min = Math.min(ygVar.a(), 4 - this.f6398g);
        ygVar.a(this.a.c(), this.f6398g, min);
        int i10 = this.f6398g + min;
        this.f6398g = i10;
        if (i10 < 4) {
            return;
        }
        this.a.f(0);
        if (!this.f6393b.a(this.a.j())) {
            this.f6398g = 0;
            this.f6397f = 1;
            return;
        }
        this.f6402k = this.f6393b.f6586c;
        if (!this.f6399h) {
            this.f6401j = (r8.f6590g * 1000000) / r8.f6587d;
            this.f6395d.a(new d9.b().c(this.f6396e).f(this.f6393b.f6585b).i(4096).c(this.f6393b.f6588e).n(this.f6393b.f6587d).e(this.f6394c).a());
            this.f6399h = true;
        }
        this.a.f(0);
        this.f6395d.a(this.a, 4);
        this.f6397f = 2;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.f6395d);
        while (ygVar.a() > 0) {
            int i10 = this.f6397f;
            if (i10 == 0) {
                b(ygVar);
            } else if (i10 == 1) {
                d(ygVar);
            } else if (i10 == 2) {
                c(ygVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public nf(String str) {
        this.f6397f = 0;
        yg ygVar = new yg(4);
        this.a = ygVar;
        ygVar.c()[0] = -1;
        this.f6393b = new of.a();
        this.f6403l = C.TIME_UNSET;
        this.f6394c = str;
    }

    private void b(yg ygVar) {
        byte[] c10 = ygVar.c();
        int e2 = ygVar.e();
        for (int d10 = ygVar.d(); d10 < e2; d10++) {
            byte b3 = c10[d10];
            boolean z10 = (b3 & UByte.MAX_VALUE) == 255;
            boolean z11 = this.f6400i && (b3 & 224) == 224;
            this.f6400i = z10;
            if (z11) {
                ygVar.f(d10 + 1);
                this.f6400i = false;
                this.a.c()[1] = c10[d10];
                this.f6398g = 2;
                this.f6397f = 1;
                return;
            }
        }
        ygVar.f(e2);
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f6396e = dVar.b();
        this.f6395d = k8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if (j3 != C.TIME_UNSET) {
            this.f6403l = j3;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f6397f = 0;
        this.f6398g = 0;
        this.f6400i = false;
        this.f6403l = C.TIME_UNSET;
    }
}
