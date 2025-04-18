package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ev implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f23761c;
    public final /* synthetic */ int d;

    public /* synthetic */ ev(s0.a aVar, int i2, int i3) {
        this.f23760b = i3;
        this.f23761c = aVar;
        this.d = i2;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f23760b;
        s0.a aVar = this.f23761c;
        int i3 = this.d;
        s0 s0Var = (s0) obj;
        switch (i2) {
            case 0:
                s0Var.d(aVar, i3);
                return;
            case 1:
                s0Var.f(aVar, i3);
                return;
            case 2:
                s0Var.e(aVar, i3);
                return;
            case 3:
                r0.a(aVar, i3, s0Var);
                return;
            default:
                s0Var.c(aVar, i3);
                return;
        }
    }
}
