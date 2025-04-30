package com.applovin.impl;

import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;

/* loaded from: classes.dex */
public final /* synthetic */ class Q1 implements cc.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0746s0.a f6463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6464d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6466g;

    public /* synthetic */ Q1(InterfaceC0746s0.a aVar, int i9, long j7, long j9, int i10) {
        this.b = i10;
        this.f6463c = aVar;
        this.f6464d = i9;
        this.f6465f = j7;
        this.f6466g = j9;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((InterfaceC0746s0) obj).a(this.f6463c, this.f6464d, this.f6465f, this.f6466g);
                return;
            default:
                ((InterfaceC0746s0) obj).b(this.f6463c, this.f6464d, this.f6465f, this.f6466g);
                return;
        }
    }
}
