package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class fv implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f4812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d9 f4813d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o5 f4814f;

    public /* synthetic */ fv(s0.a aVar, d9 d9Var, o5 o5Var, int i10) {
        this.f4811b = i10;
        this.f4812c = aVar;
        this.f4813d = d9Var;
        this.f4814f = o5Var;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f4811b;
        d9 d9Var = this.f4813d;
        s0.a aVar = this.f4812c;
        o5 o5Var = this.f4814f;
        switch (i10) {
            case 0:
                r0.A(aVar, d9Var, o5Var, (s0) obj);
                return;
            default:
                r0.g(aVar, d9Var, o5Var, (s0) obj);
                return;
        }
    }
}
