package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9053c;

    public /* synthetic */ l(Object obj, int i9) {
        this.b = i9;
        this.f9053c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((MaxFullscreenAdImpl.c) this.f9053c).a();
                return;
            case 1:
                MaxAdViewImpl.i((MaxAdViewImpl) this.f9053c);
                return;
            default:
                MaxFullscreenAdImpl.k((MaxFullscreenAdImpl) this.f9053c);
                return;
        }
    }
}
