package com.applovin.impl;

import com.applovin.impl.c8;
import com.applovin.impl.cc;
import com.applovin.impl.nh;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements cc.a, c8.f {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a8 f6382c;

    public /* synthetic */ E(a8 a8Var, int i9) {
        this.b = i9;
        this.f6382c = a8Var;
    }

    @Override // com.applovin.impl.c8.f
    public void a(c8.e eVar) {
        this.f6382c.c(eVar);
    }

    @Override // com.applovin.impl.cc.a
    public void a(Object obj) {
        switch (this.b) {
            case 0:
                this.f6382c.d((nh.c) obj);
                return;
            default:
                this.f6382c.b((nh.c) obj);
                return;
        }
    }
}
