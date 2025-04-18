package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6099c;

    public /* synthetic */ m(Object obj, int i10) {
        this.f6098b = i10;
        this.f6099c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6098b;
        Object obj = this.f6099c;
        switch (i10) {
            case 0:
                MaxFullscreenAdImpl.c.c((MaxFullscreenAdImpl.c) obj);
                return;
            case 1:
                MaxAdViewImpl.i((MaxAdViewImpl) obj);
                return;
            default:
                MaxFullscreenAdImpl.l((MaxFullscreenAdImpl) obj);
                return;
        }
    }
}
