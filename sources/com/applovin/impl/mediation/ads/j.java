package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements MaxFullscreenAdImpl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9047a;
    public final /* synthetic */ MaxFullscreenAdImpl.c b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAd f9048c;

    public /* synthetic */ j(MaxFullscreenAdImpl.c cVar, MaxAd maxAd, int i9) {
        this.f9047a = i9;
        this.b = cVar;
        this.f9048c = maxAd;
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
    public final void a() {
        switch (this.f9047a) {
            case 0:
                this.b.b(this.f9048c);
                return;
            default:
                this.b.a(this.f9048c);
                return;
        }
    }
}
