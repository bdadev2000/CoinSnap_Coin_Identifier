package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements MaxFullscreenAdImpl.e {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl.c f6094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAd f6095c;

    public /* synthetic */ k(MaxFullscreenAdImpl.c cVar, MaxAd maxAd, int i10) {
        this.a = i10;
        this.f6094b = cVar;
        this.f6095c = maxAd;
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
    public final void a() {
        int i10 = this.a;
        MaxAd maxAd = this.f6095c;
        MaxFullscreenAdImpl.c cVar = this.f6094b;
        switch (i10) {
            case 0:
                cVar.a(maxAd);
                return;
            default:
                cVar.b(maxAd);
                return;
        }
    }
}
