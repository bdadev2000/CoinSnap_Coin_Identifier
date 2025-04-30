package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;

/* loaded from: classes.dex */
public final /* synthetic */ class A2 implements cc.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0746s0.a f6361c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic f6362d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pd f6363f;

    public /* synthetic */ A2(InterfaceC0746s0.a aVar, ic icVar, pd pdVar, int i9) {
        this.b = i9;
        this.f6361c = aVar;
        this.f6362d = icVar;
        this.f6363f = pdVar;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((InterfaceC0746s0) obj).b(this.f6361c, this.f6362d, this.f6363f);
                return;
            case 1:
                ((InterfaceC0746s0) obj).a(this.f6361c, this.f6362d, this.f6363f);
                return;
            default:
                ((InterfaceC0746s0) obj).c(this.f6361c, this.f6362d, this.f6363f);
                return;
        }
    }
}
