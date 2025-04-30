package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;

/* loaded from: classes.dex */
public final /* synthetic */ class X1 implements cc.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0746s0.a f6521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f6522d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6523f;

    public /* synthetic */ X1(InterfaceC0746s0.a aVar, boolean z8, int i9, int i10) {
        this.b = i10;
        this.f6521c = aVar;
        this.f6522d = z8;
        this.f6523f = i9;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((InterfaceC0746s0) obj).a(this.f6521c, this.f6522d, this.f6523f);
                return;
            default:
                ((InterfaceC0746s0) obj).b(this.f6521c, this.f6522d, this.f6523f);
                return;
        }
    }
}
