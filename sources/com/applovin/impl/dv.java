package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes3.dex */
public final /* synthetic */ class dv implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f23544c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f23545f;

    public /* synthetic */ dv(s0.a aVar, String str, long j2, long j3, int i2) {
        this.f23543b = i2;
        this.f23544c = aVar;
        this.d = str;
        this.e = j2;
        this.f23545f = j3;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        switch (this.f23543b) {
            case 0:
                r0.b(this.f23544c, this.d, this.e, this.f23545f, (s0) obj);
                return;
            default:
                r0.c(this.f23544c, this.d, this.e, this.f23545f, (s0) obj);
                return;
        }
    }
}
