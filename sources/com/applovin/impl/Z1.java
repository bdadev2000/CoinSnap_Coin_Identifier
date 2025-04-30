package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;

/* loaded from: classes.dex */
public final /* synthetic */ class Z1 implements cc.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0746s0.a f6535c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6536d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6538g;

    public /* synthetic */ Z1(InterfaceC0746s0.a aVar, String str, long j7, long j9, int i9) {
        this.b = i9;
        this.f6535c = aVar;
        this.f6536d = str;
        this.f6537f = j7;
        this.f6538g = j9;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                C0742r0.a(this.f6535c, this.f6536d, this.f6537f, this.f6538g, (InterfaceC0746s0) obj);
                return;
            default:
                C0742r0.b(this.f6535c, this.f6536d, this.f6537f, this.f6538g, (InterfaceC0746s0) obj);
                return;
        }
    }
}
