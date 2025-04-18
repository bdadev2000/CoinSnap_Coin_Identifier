package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes3.dex */
public final /* synthetic */ class cv implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f23384c;
    public final /* synthetic */ Exception d;

    public /* synthetic */ cv(s0.a aVar, Exception exc, int i2) {
        this.f23383b = i2;
        this.f23384c = aVar;
        this.d = exc;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        int i2 = this.f23383b;
        s0.a aVar = this.f23384c;
        Exception exc = this.d;
        s0 s0Var = (s0) obj;
        switch (i2) {
            case 0:
                r0.c0(aVar, exc, s0Var);
                return;
            case 1:
                r0.f0(aVar, exc, s0Var);
                return;
            case 2:
                r0.R(aVar, exc, s0Var);
                return;
            default:
                r0.P(aVar, exc, s0Var);
                return;
        }
    }
}
