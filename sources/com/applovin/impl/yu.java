package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class yu implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f9298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5 f9299d;

    public /* synthetic */ yu(s0.a aVar, int i10, l5 l5Var) {
        this.f9297b = i10;
        this.f9298c = aVar;
        this.f9299d = l5Var;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f9297b;
        s0.a aVar = this.f9298c;
        l5 l5Var = this.f9299d;
        switch (i10) {
            case 0:
                r0.d(aVar, l5Var, (s0) obj);
                return;
            case 1:
                r0.b(aVar, l5Var, (s0) obj);
                return;
            case 2:
                r0.c(aVar, l5Var, (s0) obj);
                return;
            default:
                r0.a(aVar, l5Var, (s0) obj);
                return;
        }
    }
}
