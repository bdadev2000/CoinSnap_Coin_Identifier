package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class nv implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f25796c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ nv(s0.a aVar, boolean z2, int i2, int i3) {
        this.f25795b = i3;
        this.f25796c = aVar;
        this.d = z2;
        this.e = i2;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f25795b;
        boolean z2 = this.d;
        s0.a aVar = this.f25796c;
        int i3 = this.e;
        s0 s0Var = (s0) obj;
        switch (i2) {
            case 0:
                s0Var.b(aVar, z2, i3);
                return;
            default:
                s0Var.a(aVar, z2, i3);
                return;
        }
    }
}
