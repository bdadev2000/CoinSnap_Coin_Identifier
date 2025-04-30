package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;

/* loaded from: classes.dex */
public final /* synthetic */ class T1 implements cc.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0746s0.a f6485c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f6486d;

    public /* synthetic */ T1(InterfaceC0746s0.a aVar, Exception exc, int i9) {
        this.b = i9;
        this.f6485c = aVar;
        this.f6486d = exc;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((InterfaceC0746s0) obj).a(this.f6485c, this.f6486d);
                return;
            case 1:
                ((InterfaceC0746s0) obj).d(this.f6485c, this.f6486d);
                return;
            case 2:
                ((InterfaceC0746s0) obj).b(this.f6485c, this.f6486d);
                return;
            default:
                ((InterfaceC0746s0) obj).c(this.f6485c, this.f6486d);
                return;
        }
    }
}
