package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;

/* loaded from: classes.dex */
public final /* synthetic */ class Y1 implements cc.a {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0746s0.a f6528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6529d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6530f;

    public /* synthetic */ Y1(InterfaceC0746s0.a aVar, int i9, long j7) {
        this.f6528c = aVar;
        this.f6530f = i9;
        this.f6529d = j7;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((InterfaceC0746s0) obj).a(this.f6528c, this.f6530f, this.f6529d);
                return;
            default:
                ((InterfaceC0746s0) obj).a(this.f6528c, this.f6529d, this.f6530f);
                return;
        }
    }

    public /* synthetic */ Y1(InterfaceC0746s0.a aVar, long j7, int i9) {
        this.f6528c = aVar;
        this.f6529d = j7;
        this.f6530f = i9;
    }
}
