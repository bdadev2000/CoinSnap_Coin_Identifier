package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.s0;

/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements hc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f24037c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f24038f;

    public /* synthetic */ fv(s0.a aVar, int i2, long j2, long j3, int i3) {
        this.f24036b = i3;
        this.f24037c = aVar;
        this.d = i2;
        this.e = j2;
        this.f24038f = j3;
    }

    @Override // com.applovin.impl.hc.a
    public final void a(Object obj) {
        switch (this.f24036b) {
            case 0:
                ((s0) obj).a(this.f24037c, this.d, this.e, this.f24038f);
                return;
            default:
                ((s0) obj).b(this.f24037c, this.d, this.e, this.f24038f);
                return;
        }
    }
}
