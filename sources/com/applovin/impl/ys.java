package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.qh;
import com.applovin.impl.s0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ys implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28240b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28241c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ o2 e;

    public /* synthetic */ ys(qh.f fVar, qh.f fVar2, int i2) {
        this.f28241c = i2;
        this.d = fVar;
        this.e = fVar2;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f28240b;
        int i3 = this.f28241c;
        o2 o2Var = this.e;
        Object obj2 = this.d;
        switch (i2) {
            case 0:
                c8.a(i3, (qh.f) obj2, (qh.f) o2Var, (qh.c) obj);
                return;
            default:
                ((s0) obj).a((s0.a) obj2, (td) o2Var, i3);
                return;
        }
    }

    public /* synthetic */ ys(s0.a aVar, td tdVar, int i2) {
        this.d = aVar;
        this.e = tdVar;
        this.f28241c = i2;
    }
}
