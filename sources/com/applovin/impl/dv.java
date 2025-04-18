package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class dv implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f4387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic f4388d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pd f4389f;

    public /* synthetic */ dv(s0.a aVar, ic icVar, pd pdVar, int i10) {
        this.f4386b = i10;
        this.f4387c = aVar;
        this.f4388d = icVar;
        this.f4389f = pdVar;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f4386b;
        ic icVar = this.f4388d;
        s0.a aVar = this.f4387c;
        pd pdVar = this.f4389f;
        switch (i10) {
            case 0:
                ((s0) obj).b(aVar, icVar, pdVar);
                return;
            case 1:
                ((s0) obj).c(aVar, icVar, pdVar);
                return;
            default:
                ((s0) obj).a(aVar, icVar, pdVar);
                return;
        }
    }
}
