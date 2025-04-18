package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes2.dex */
public final /* synthetic */ class sv implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f26988c;
    public final /* synthetic */ f9 d;
    public final /* synthetic */ q5 e;

    public /* synthetic */ sv(s0.a aVar, f9 f9Var, q5 q5Var, int i2) {
        this.f26987b = i2;
        this.f26988c = aVar;
        this.d = f9Var;
        this.e = q5Var;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f26987b;
        f9 f9Var = this.d;
        s0.a aVar = this.f26988c;
        q5 q5Var = this.e;
        s0 s0Var = (s0) obj;
        switch (i2) {
            case 0:
                r0.b(aVar, f9Var, q5Var, s0Var);
                return;
            default:
                r0.a(aVar, f9Var, q5Var, s0Var);
                return;
        }
    }
}
