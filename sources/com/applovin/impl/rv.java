package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes2.dex */
public final /* synthetic */ class rv implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26386b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f26387c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ rv(s0.a aVar, int i2, long j2) {
        this.f26387c = aVar;
        this.e = i2;
        this.d = j2;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f26386b;
        long j2 = this.d;
        s0.a aVar = this.f26387c;
        int i3 = this.e;
        s0 s0Var = (s0) obj;
        switch (i2) {
            case 0:
                s0Var.a(aVar, i3, j2);
                return;
            default:
                s0Var.a(aVar, j2, i3);
                return;
        }
    }

    public /* synthetic */ rv(s0.a aVar, long j2, int i2) {
        this.f26387c = aVar;
        this.d = j2;
        this.e = i2;
    }
}
