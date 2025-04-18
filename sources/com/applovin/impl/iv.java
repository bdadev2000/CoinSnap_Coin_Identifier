package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class iv implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f5387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5388d;

    public /* synthetic */ iv(s0.a aVar, boolean z10, int i10) {
        this.f5386b = i10;
        this.f5387c = aVar;
        this.f5388d = z10;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f5386b;
        s0.a aVar = this.f5387c;
        boolean z10 = this.f5388d;
        switch (i10) {
            case 0:
                ((s0) obj).b(aVar, z10);
                return;
            case 1:
                ((s0) obj).d(aVar, z10);
                return;
            case 2:
                r0.a(aVar, z10, (s0) obj);
                return;
            default:
                ((s0) obj).a(aVar, z10);
                return;
        }
    }
}
