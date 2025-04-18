package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;
import com.applovin.impl.zb;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class us implements zb.a, cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8435c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8436d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8437f;

    public /* synthetic */ us(int i10, Object obj, Object obj2, Object obj3) {
        this.f8434b = i10;
        this.f8436d = obj;
        this.f8435c = obj2;
        this.f8437f = obj3;
    }

    @Override // com.applovin.impl.zb.a
    public final void a(hb hbVar, yb ybVar) {
        int i10 = this.f8434b;
        Object obj = this.f8437f;
        Object obj2 = this.f8435c;
        Object obj3 = this.f8436d;
        switch (i10) {
            case 0:
                b0.c((b0) obj3, (com.applovin.impl.sdk.k) obj2, (z) obj, hbVar, ybVar);
                return;
            default:
                ((c0) obj3).a((List) obj, (com.applovin.impl.sdk.k) obj2, hbVar, ybVar);
                return;
        }
    }

    public /* synthetic */ us(c0 c0Var, List list, com.applovin.impl.sdk.k kVar) {
        this.f8434b = 1;
        this.f8436d = c0Var;
        this.f8437f = list;
        this.f8435c = kVar;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        ((s0) obj).a((s0.a) this.f8436d, (qo) this.f8435c, (uo) this.f8437f);
    }
}
