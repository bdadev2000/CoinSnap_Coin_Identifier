package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.nh;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class lv implements cc.a, n9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5922d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5923f;

    public /* synthetic */ lv(int i10, Object obj, Object obj2, Object obj3) {
        this.f5921c = obj;
        this.f5920b = i10;
        this.f5922d = obj2;
        this.f5923f = obj3;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        r0.a((s0.a) this.f5921c, this.f5920b, (nh.f) this.f5922d, (nh.f) this.f5923f, (s0) obj);
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        t7.c cVar = (t7.c) obj;
        cVar.getClass();
        t7.u uVar = (t7.u) cVar;
        int i10 = this.f5920b;
        if (i10 == 1) {
            uVar.u = true;
        }
        uVar.f25345k = i10;
    }
}
