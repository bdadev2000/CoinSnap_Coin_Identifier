package com.applovin.impl;

import com.applovin.impl.c8;
import com.applovin.impl.cc;
import com.applovin.impl.nh;

/* loaded from: classes.dex */
public final /* synthetic */ class ks implements c8.f, cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a8 f5781c;

    public /* synthetic */ ks(a8 a8Var, int i10) {
        this.f5780b = i10;
        this.f5781c = a8Var;
    }

    @Override // com.applovin.impl.c8.f
    public final void a(c8.e eVar) {
        this.f5781c.c(eVar);
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f5780b;
        a8 a8Var = this.f5781c;
        switch (i10) {
            case 1:
                a8Var.d((nh.c) obj);
                return;
            default:
                a8Var.b((nh.c) obj);
                return;
        }
    }
}
