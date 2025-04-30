package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;

/* loaded from: classes.dex */
public final /* synthetic */ class M1 implements cc.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0746s0.a f6434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5 f6435d;

    public /* synthetic */ M1(InterfaceC0746s0.a aVar, int i9, l5 l5Var) {
        this.b = i9;
        this.f6434c = aVar;
        this.f6435d = l5Var;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                C0742r0.d(this.f6434c, this.f6435d, (InterfaceC0746s0) obj);
                return;
            case 1:
                C0742r0.c(this.f6434c, this.f6435d, (InterfaceC0746s0) obj);
                return;
            case 2:
                C0742r0.a(this.f6434c, this.f6435d, (InterfaceC0746s0) obj);
                return;
            default:
                C0742r0.b(this.f6434c, this.f6435d, (InterfaceC0746s0) obj);
                return;
        }
    }
}
