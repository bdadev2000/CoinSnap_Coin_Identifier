package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;

/* loaded from: classes.dex */
public final /* synthetic */ class P1 implements cc.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0746s0.a f6454c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d9 f6455d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o5 f6456f;

    public /* synthetic */ P1(InterfaceC0746s0.a aVar, d9 d9Var, o5 o5Var, int i9) {
        this.b = i9;
        this.f6454c = aVar;
        this.f6455d = d9Var;
        this.f6456f = o5Var;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                C0742r0.a(this.f6454c, this.f6455d, this.f6456f, (InterfaceC0746s0) obj);
                return;
            default:
                C0742r0.b(this.f6454c, this.f6455d, this.f6456f, (InterfaceC0746s0) obj);
                return;
        }
    }
}
