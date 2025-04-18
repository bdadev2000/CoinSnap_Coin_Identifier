package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ov implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f25945c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ov(s0.a aVar, boolean z2, int i2) {
        this.f25944b = i2;
        this.f25945c = aVar;
        this.d = z2;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f25944b;
        s0.a aVar = this.f25945c;
        boolean z2 = this.d;
        s0 s0Var = (s0) obj;
        switch (i2) {
            case 0:
                s0Var.b(aVar, z2);
                return;
            case 1:
                s0Var.d(aVar, z2);
                return;
            case 2:
                r0.a(aVar, z2, s0Var);
                return;
            default:
                s0Var.a(aVar, z2);
                return;
        }
    }
}
