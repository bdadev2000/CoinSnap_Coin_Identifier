package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes2.dex */
public final /* synthetic */ class pv implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f26128c;

    public /* synthetic */ pv(s0.a aVar, int i2) {
        this.f26127b = i2;
        this.f26128c = aVar;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f26127b;
        s0.a aVar = this.f26128c;
        s0 s0Var = (s0) obj;
        switch (i2) {
            case 0:
                s0Var.d(aVar);
                return;
            case 1:
                s0Var.c(aVar);
                return;
            case 2:
                s0Var.e(aVar);
                return;
            case 3:
                s0Var.h(aVar);
                return;
            case 4:
                s0Var.a(aVar);
                return;
            case 5:
                s0Var.g(aVar);
                return;
            default:
                s0Var.b(aVar);
                return;
        }
    }
}
