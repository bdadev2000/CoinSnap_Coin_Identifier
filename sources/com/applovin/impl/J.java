package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;
import com.applovin.impl.nh;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements cc.a {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6418d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725m2 f6419f;

    public /* synthetic */ J(nh.f fVar, nh.f fVar2, int i9) {
        this.f6417c = i9;
        this.f6418d = fVar;
        this.f6419f = fVar2;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                a8.a(this.f6417c, (nh.f) this.f6418d, (nh.f) this.f6419f, (nh.c) obj);
                return;
            default:
                ((InterfaceC0746s0) obj).a((InterfaceC0746s0.a) this.f6418d, (od) this.f6419f, this.f6417c);
                return;
        }
    }

    public /* synthetic */ J(InterfaceC0746s0.a aVar, od odVar, int i9) {
        this.f6418d = aVar;
        this.f6419f = odVar;
        this.f6417c = i9;
    }
}
