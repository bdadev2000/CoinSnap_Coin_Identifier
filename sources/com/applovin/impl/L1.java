package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;

/* loaded from: classes.dex */
public final /* synthetic */ class L1 implements cc.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0746s0.a f6428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6429d;

    public /* synthetic */ L1(InterfaceC0746s0.a aVar, int i9, int i10) {
        this.b = i10;
        this.f6428c = aVar;
        this.f6429d = i9;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                C0742r0.a(this.f6428c, this.f6429d, (InterfaceC0746s0) obj);
                return;
            case 1:
                ((InterfaceC0746s0) obj).d(this.f6428c, this.f6429d);
                return;
            case 2:
                ((InterfaceC0746s0) obj).c(this.f6428c, this.f6429d);
                return;
            case 3:
                ((InterfaceC0746s0) obj).f(this.f6428c, this.f6429d);
                return;
            default:
                ((InterfaceC0746s0) obj).e(this.f6428c, this.f6429d);
                return;
        }
    }
}
