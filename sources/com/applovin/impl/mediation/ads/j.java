package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements MaxFullscreenAdImpl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl.c f25389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAd f25390c;

    public /* synthetic */ j(MaxFullscreenAdImpl.c cVar, MaxAd maxAd, int i2) {
        this.f25388a = i2;
        this.f25389b = cVar;
        this.f25390c = maxAd;
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
    public final void a() {
        int i2 = this.f25388a;
        MaxAd maxAd = this.f25390c;
        MaxFullscreenAdImpl.c cVar = this.f25389b;
        switch (i2) {
            case 0:
                cVar.a(maxAd);
                return;
            default:
                cVar.b(maxAd);
                return;
        }
    }
}
