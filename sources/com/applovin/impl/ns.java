package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.nh;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class ns implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6435b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6437d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m2 f6438f;

    public /* synthetic */ ns(nh.f fVar, nh.f fVar2, int i10) {
        this.f6436c = i10;
        this.f6437d = fVar;
        this.f6438f = fVar2;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f6435b;
        int i11 = this.f6436c;
        m2 m2Var = this.f6438f;
        Object obj2 = this.f6437d;
        switch (i10) {
            case 0:
                a8.p(i11, (nh.f) obj2, (nh.f) m2Var, (nh.c) obj);
                return;
            default:
                ((s0) obj).a((s0.a) obj2, (od) m2Var, i11);
                return;
        }
    }

    public /* synthetic */ ns(s0.a aVar, od odVar, int i10) {
        this.f6437d = aVar;
        this.f6438f = odVar;
        this.f6436c = i10;
    }
}
