package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class mv implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f25617c;
    public final /* synthetic */ n5 d;

    public /* synthetic */ mv(s0.a aVar, int i2, n5 n5Var) {
        this.f25616b = i2;
        this.f25617c = aVar;
        this.d = n5Var;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f25616b;
        s0.a aVar = this.f25617c;
        n5 n5Var = this.d;
        s0 s0Var = (s0) obj;
        switch (i2) {
            case 0:
                r0.a(aVar, n5Var, s0Var);
                return;
            case 1:
                r0.c(aVar, n5Var, s0Var);
                return;
            case 2:
                r0.b(aVar, n5Var, s0Var);
                return;
            default:
                r0.d(aVar, n5Var, s0Var);
                return;
        }
    }
}
