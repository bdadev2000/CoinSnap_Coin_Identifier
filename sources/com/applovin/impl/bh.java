package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;

/* loaded from: classes.dex */
public final class bh implements cj {

    /* renamed from: a, reason: collision with root package name */
    private d9 f6870a;
    private io b;

    /* renamed from: c, reason: collision with root package name */
    private ro f6871c;

    public bh(String str) {
        this.f6870a = new d9.b().f(str).a();
    }

    private void a() {
        AbstractC0669a1.b(this.b);
        yp.a(this.f6871c);
    }

    @Override // com.applovin.impl.cj
    public void a(yg ygVar) {
        a();
        long b = this.b.b();
        long c9 = this.b.c();
        if (b == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || c9 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return;
        }
        d9 d9Var = this.f6870a;
        if (c9 != d9Var.f7214q) {
            d9 a6 = d9Var.a().a(c9).a();
            this.f6870a = a6;
            this.f6871c.a(a6);
        }
        int a9 = ygVar.a();
        this.f6871c.a(ygVar, a9);
        this.f6871c.a(b, 1, a9, 0, null);
    }

    @Override // com.applovin.impl.cj
    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.b = ioVar;
        dVar.a();
        ro a6 = k8Var.a(dVar.c(), 5);
        this.f6871c = a6;
        a6.a(this.f6870a);
    }
}
