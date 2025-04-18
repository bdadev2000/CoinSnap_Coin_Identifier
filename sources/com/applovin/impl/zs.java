package com.applovin.impl;

import com.applovin.impl.ec;
import com.applovin.impl.h4;
import com.applovin.impl.hc;
import com.applovin.impl.qh;
import com.applovin.impl.s0;
import com.applovin.impl.vb;

/* loaded from: classes4.dex */
public final /* synthetic */ class zs implements hc.a, h4.c, hc.b, ec.a, vb.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28392c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zs(int i2, Object obj, Object obj2) {
        this.f28391b = i2;
        this.f28392c = obj;
        this.d = obj2;
    }

    @Override // com.applovin.impl.h4.c
    public final void a(h4.b bVar) {
        ((h4) this.f28392c).a((h4.c) this.d, bVar);
    }

    @Override // com.applovin.impl.ec.a
    public final void a(lb lbVar, dc dcVar) {
        un.a((un) this.f28392c, (com.applovin.impl.sdk.j) this.d, lbVar, dcVar);
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f28391b;
        Object obj2 = this.d;
        Object obj3 = this.f28392c;
        switch (i2) {
            case 0:
                c8.A((oh) obj3, (to) obj2, (qh.c) obj);
                return;
            case 1:
            case 4:
            default:
                ((vb.b) obj3).a(obj2);
                return;
            case 2:
                r0.J((s0.a) obj3, (ph) obj2, (s0) obj);
                return;
            case 3:
                r0.N((s0.a) obj3, (nh) obj2, (s0) obj);
                return;
            case 5:
                r0.m((s0.a) obj3, (vd) obj2, (s0) obj);
                return;
            case 6:
                r0.L((s0.a) obj3, (qh.b) obj2, (s0) obj);
                return;
            case 7:
                r0.r((s0.a) obj3, (xq) obj2, (s0) obj);
                return;
            case 8:
                r0.A((s0.a) obj3, (ud) obj2, (s0) obj);
                return;
            case 9:
                r0.g0((s0.a) obj3, (bf) obj2, (s0) obj);
                return;
        }
    }

    @Override // com.applovin.impl.hc.b
    public final void a(Object obj, b9 b9Var) {
        r0.e((r0) this.f28392c, (qh) this.d, (s0) obj, b9Var);
    }
}
