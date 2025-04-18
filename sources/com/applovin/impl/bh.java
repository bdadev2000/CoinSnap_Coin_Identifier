package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class bh implements cj {
    private d9 a;

    /* renamed from: b, reason: collision with root package name */
    private io f3888b;

    /* renamed from: c, reason: collision with root package name */
    private ro f3889c;

    public bh(String str) {
        this.a = new d9.b().f(str).a();
    }

    private void a() {
        a1.b(this.f3888b);
        yp.a(this.f3889c);
    }

    @Override // com.applovin.impl.cj
    public void a(yg ygVar) {
        a();
        long b3 = this.f3888b.b();
        long c10 = this.f3888b.c();
        if (b3 == C.TIME_UNSET || c10 == C.TIME_UNSET) {
            return;
        }
        d9 d9Var = this.a;
        if (c10 != d9Var.f4232q) {
            d9 a = d9Var.a().a(c10).a();
            this.a = a;
            this.f3889c.a(a);
        }
        int a10 = ygVar.a();
        this.f3889c.a(ygVar, a10);
        this.f3889c.a(b3, 1, a10, 0, null);
    }

    @Override // com.applovin.impl.cj
    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.f3888b = ioVar;
        dVar.a();
        ro a = k8Var.a(dVar.c(), 5);
        this.f3889c = a;
        a.a(this.a);
    }
}
