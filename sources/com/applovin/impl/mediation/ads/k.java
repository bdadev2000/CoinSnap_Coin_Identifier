package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25392b;

    public /* synthetic */ k(Object obj, int i2) {
        this.f25391a = i2;
        this.f25392b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25391a;
        Object obj = this.f25392b;
        switch (i2) {
            case 0:
                MaxFullscreenAdImpl.c.b((MaxFullscreenAdImpl.c) obj);
                return;
            default:
                MaxAdViewImpl.i((MaxAdViewImpl) obj);
                return;
        }
    }
}
