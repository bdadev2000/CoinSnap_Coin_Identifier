package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.of;

/* loaded from: classes.dex */
public final class nf implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final yg f9328a;
    private final of.a b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9329c;

    /* renamed from: d, reason: collision with root package name */
    private ro f9330d;

    /* renamed from: e, reason: collision with root package name */
    private String f9331e;

    /* renamed from: f, reason: collision with root package name */
    private int f9332f;

    /* renamed from: g, reason: collision with root package name */
    private int f9333g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9334h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9335i;

    /* renamed from: j, reason: collision with root package name */
    private long f9336j;

    /* renamed from: k, reason: collision with root package name */
    private int f9337k;
    private long l;

    public nf() {
        this(null);
    }

    private void c(yg ygVar) {
        int min = Math.min(ygVar.a(), this.f9337k - this.f9333g);
        this.f9330d.a(ygVar, min);
        int i9 = this.f9333g + min;
        this.f9333g = i9;
        int i10 = this.f9337k;
        if (i9 < i10) {
            return;
        }
        long j7 = this.l;
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f9330d.a(j7, 1, i10, 0, null);
            this.l += this.f9336j;
        }
        this.f9333g = 0;
        this.f9332f = 0;
    }

    private void d(yg ygVar) {
        int min = Math.min(ygVar.a(), 4 - this.f9333g);
        ygVar.a(this.f9328a.c(), this.f9333g, min);
        int i9 = this.f9333g + min;
        this.f9333g = i9;
        if (i9 < 4) {
            return;
        }
        this.f9328a.f(0);
        if (!this.b.a(this.f9328a.j())) {
            this.f9333g = 0;
            this.f9332f = 1;
            return;
        }
        this.f9337k = this.b.f9523c;
        if (!this.f9334h) {
            this.f9336j = (r8.f9527g * 1000000) / r8.f9524d;
            this.f9330d.a(new d9.b().c(this.f9331e).f(this.b.b).i(4096).c(this.b.f9525e).n(this.b.f9524d).e(this.f9329c).a());
            this.f9334h = true;
        }
        this.f9328a.f(0);
        this.f9330d.a(this.f9328a, 4);
        this.f9332f = 2;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        AbstractC0669a1.b(this.f9330d);
        while (ygVar.a() > 0) {
            int i9 = this.f9332f;
            if (i9 == 0) {
                b(ygVar);
            } else if (i9 == 1) {
                d(ygVar);
            } else if (i9 == 2) {
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
        this.f9332f = 0;
        yg ygVar = new yg(4);
        this.f9328a = ygVar;
        ygVar.c()[0] = -1;
        this.b = new of.a();
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f9329c = str;
    }

    private void b(yg ygVar) {
        byte[] c9 = ygVar.c();
        int e4 = ygVar.e();
        for (int d2 = ygVar.d(); d2 < e4; d2++) {
            byte b = c9[d2];
            boolean z8 = (b & 255) == 255;
            boolean z9 = this.f9335i && (b & 224) == 224;
            this.f9335i = z8;
            if (z9) {
                ygVar.f(d2 + 1);
                this.f9335i = false;
                this.f9328a.c()[1] = c9[d2];
                this.f9333g = 2;
                this.f9332f = 1;
                return;
            }
        }
        ygVar.f(e4);
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f9331e = dVar.b();
        this.f9330d = k8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.l = j7;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f9332f = 0;
        this.f9333g = 0;
        this.f9335i = false;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
