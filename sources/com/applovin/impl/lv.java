package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class lv implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f25157c;
    public final /* synthetic */ nc d;
    public final /* synthetic */ ud e;

    public /* synthetic */ lv(s0.a aVar, nc ncVar, ud udVar, int i2) {
        this.f25156b = i2;
        this.f25157c = aVar;
        this.d = ncVar;
        this.e = udVar;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f25156b;
        nc ncVar = this.d;
        s0.a aVar = this.f25157c;
        ud udVar = this.e;
        s0 s0Var = (s0) obj;
        switch (i2) {
            case 0:
                s0Var.a(aVar, ncVar, udVar);
                return;
            case 1:
                s0Var.c(aVar, ncVar, udVar);
                return;
            default:
                s0Var.b(aVar, ncVar, udVar);
                return;
        }
    }
}
