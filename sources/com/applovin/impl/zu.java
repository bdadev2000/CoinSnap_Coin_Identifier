package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class zu implements cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0.a f9505c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9506d;

    public /* synthetic */ zu(s0.a aVar, int i10, int i11) {
        this.f9504b = i11;
        this.f9505c = aVar;
        this.f9506d = i10;
    }

    @Override // com.applovin.impl.cc.a
    public final void a(Object obj) {
        int i10 = this.f9504b;
        s0.a aVar = this.f9505c;
        int i11 = this.f9506d;
        switch (i10) {
            case 0:
                ((s0) obj).f(aVar, i11);
                return;
            case 1:
                ((s0) obj).e(aVar, i11);
                return;
            case 2:
                r0.a(aVar, i11, (s0) obj);
                return;
            case 3:
                ((s0) obj).d(aVar, i11);
                return;
            default:
                ((s0) obj).c(aVar, i11);
                return;
        }
    }
}
