package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class bv implements cc.a, n9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3962c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3963d;

    public /* synthetic */ bv(int i10, int i11, Object obj) {
        this.f3963d = obj;
        this.f3961b = i10;
        this.f3962c = i11;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        ((s0) obj).a((s0.a) this.f3963d, this.f3961b, this.f3962c);
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        ((t7.c) obj).getClass();
    }
}
