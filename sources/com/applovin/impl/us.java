package com.applovin.impl;

import com.applovin.impl.e8;
import com.applovin.impl.hc;
import com.applovin.impl.qh;

/* loaded from: classes2.dex */
public final /* synthetic */ class us implements e8.f, hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c8 f27434c;

    public /* synthetic */ us(c8 c8Var, int i2) {
        this.f27433b = i2;
        this.f27434c = c8Var;
    }

    @Override // com.applovin.impl.e8.f
    public final void a(e8.e eVar) {
        this.f27434c.c(eVar);
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f27433b;
        c8 c8Var = this.f27434c;
        qh.c cVar = (qh.c) obj;
        switch (i2) {
            case 1:
                c8Var.d(cVar);
                return;
            default:
                c8Var.b(cVar);
                return;
        }
    }
}
