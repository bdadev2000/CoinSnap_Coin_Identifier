package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class xu implements cc.a, n9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOException f9083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9085d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9087g;

    public /* synthetic */ xu(Object obj, Object obj2, Object obj3, IOException iOException, boolean z10) {
        this.f9085d = obj;
        this.f9086f = obj2;
        this.f9087g = obj3;
        this.f9083b = iOException;
        this.f9084c = z10;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        ((s0) obj).a((s0.a) this.f9085d, (ic) this.f9086f, (pd) this.f9087g, this.f9083b, this.f9084c);
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        v8.u uVar = (v8.u) this.f9087g;
        t7.u uVar2 = (t7.u) ((t7.c) obj);
        uVar2.getClass();
        uVar2.f25355v = uVar.a;
    }
}
