package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class gv implements cc.a, n9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f5041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5042c;

    public /* synthetic */ gv(Object obj, float f10) {
        this.f5042c = obj;
        this.f5041b = f10;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        ((s0) obj).a((s0.a) this.f5042c, this.f5041b);
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        ((t7.c) obj).getClass();
    }
}
