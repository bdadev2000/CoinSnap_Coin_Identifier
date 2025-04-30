package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;

/* loaded from: classes.dex */
public final /* synthetic */ class U1 implements cc.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0746s0.a f6494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6495d;

    public /* synthetic */ U1(InterfaceC0746s0.a aVar, String str, int i9) {
        this.b = i9;
        this.f6494c = aVar;
        this.f6495d = str;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((InterfaceC0746s0) obj).b(this.f6494c, this.f6495d);
                return;
            default:
                ((InterfaceC0746s0) obj).a(this.f6494c, this.f6495d);
                return;
        }
    }
}
