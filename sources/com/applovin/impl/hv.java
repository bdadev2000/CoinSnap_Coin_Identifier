package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class hv implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f5207c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5208d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5209f;

    public /* synthetic */ hv(s0.a aVar, boolean z10, int i10, int i11) {
        this.f5206b = i11;
        this.f5207c = aVar;
        this.f5208d = z10;
        this.f5209f = i10;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f5206b;
        boolean z10 = this.f5208d;
        s0.a aVar = this.f5207c;
        int i11 = this.f5209f;
        switch (i10) {
            case 0:
                ((s0) obj).b(aVar, z10, i11);
                return;
            default:
                ((s0) obj).a(aVar, z10, i11);
                return;
        }
    }
}
